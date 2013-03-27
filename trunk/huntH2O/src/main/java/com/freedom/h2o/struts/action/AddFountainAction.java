package com.freedom.h2o.struts.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.freedom.h2o.service.EmployeeSearchService;
import com.freedom.h2o.service.FountainSearchService;
import com.freedom.h2o.struts.form.AddFountainForm;

   
public final class AddFountainAction extends Action
{
  public ActionForward execute(ActionMapping mapping,
     ActionForm form,
    HttpServletRequest request,
    HttpServletResponse response)
     throws Exception
  {
   
    FountainSearchService fService = new FountainSearchService(); 
    
    ArrayList results;
   
    AddFountainForm addFountainForm = (AddFountainForm) form;
   
    // Perform employee search based on the criteria entered.
    String name = addFountainForm.getFountainName();
       if (name != null && name.trim().length() > 0) {
      results = fService.searchByfountainName(name);
    } else {
      results = null;
    }
   
    // Place search results in SearchForm for access by JSP.
       addFountainForm.setResults(results);
   
       // Forward control to this Action's input page.
    return mapping.getInputForward();
  }
}