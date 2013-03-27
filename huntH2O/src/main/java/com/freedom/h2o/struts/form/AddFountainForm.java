package com.freedom.h2o.struts.form;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class AddFountainForm extends ActionForm{
	private String fountainName = null;
	private String description = null;
	private List results = null;
	
	public String getFountainName() {
		return fountainName;
	}
	public void setFountainName(String fountainName) {
		this.fountainName = fountainName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setResults(List results)
	{
		this.results = results;
	}
	
	public List getResults()
	{
		return results;
	}
	
	
}
