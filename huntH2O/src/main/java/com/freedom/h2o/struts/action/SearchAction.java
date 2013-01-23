package com.freedom.h2o.struts.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.freedom.h2o.service.FountainSearchService;
import com.freedom.h2o.struts.form.SearchForm;

public class SearchAction extends Action {
	@SuppressWarnings("unchecked")
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		FountainSearchService service = new FountainSearchService();
		ArrayList results = null;

		SearchForm searchForm = (SearchForm) form;

		// Perform employee search based on the criteria entered.
		String foutainName = searchForm.getFountainName();
		if (foutainName != null && foutainName.trim().length() > 0) {
			results = service.searchByfountainName(foutainName);
		}

		// Place search results in SearchForm for access by JSP.
		searchForm.setResults(results);

		// Forward control to this Action's input page.
		return mapping.getInputForward();
	}

}
