package com.freedom.h2o.struts.form;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.freedom.h2o.bean.Fountain;

public class SearchForm extends ActionForm {
	/**
	 * 
	 */
	private static final long serialVersionUID = -720847218144773028L;

	private String address = null;
	private String cityTown = null;
	private String zipCode = null;
	private String fountainName = null;
	private List<Fountain> results = null;

	public void setName(String name) {
		this.address = name;
	}

	public String getName() {
		return address;
	}

	public void setResults(List<Fountain> results) {
		this.results = results;
	}

	public List<Fountain> getResults() {
		return results;
	}

	// Reset form fields.

	public void reset(ActionMapping mapping, HttpServletRequest request) {
		address = null;
		cityTown = null;
		zipCode = null;
		results = null;
	}

	// Validate form data.
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		ActionErrors errors = new ActionErrors();

		boolean cityTownEntered = false;
		boolean zipCodeEntered = false;
		boolean addressEntered = false;

		// Determine if name has been entered.
		if (address != null && address.length() > 0) {
			addressEntered = true;
		}

		// Determine if social security number has been entered.
		if (cityTown != null && cityTown.length() > 0) {
			cityTownEntered = true;
		}

		/*
		 * Validate that either name or social security number has been entered.
		 */
		if (!addressEntered && !cityTownEntered) {
			errors.add(null, new ActionMessage("error.search.criteria.missing"));
		}

		/*
		 * Validate format of social security number if it has been entered.
		 */
		if (zipCodeEntered && !isValidZipCode(zipCode)) {
			errors.add("zipCode", new ActionMessage(
					"error.search.zipCode.invalid"));
		}

		return errors;
	}

	// Validate format of social security number.
	private static boolean isValidZipCode(String zipCode) {
		if (zipCode.length() < 5) {
			return false;
		}

		for (int i = 0; i < 5; i++) {
			if ("0123456789".indexOf(zipCode.charAt(i)) == -1) {
				return false;
			}
		}

		return true;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getFountainName() {
		return fountainName;
	}

	public void setFountainName(String fountainName) {
		this.fountainName = fountainName;
	}

}
