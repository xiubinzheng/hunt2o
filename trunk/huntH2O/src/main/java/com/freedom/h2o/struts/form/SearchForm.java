package com.freedom.h2o.struts.form;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
   
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
   
public class SearchForm extends ActionForm
{
  private String fountainName = null;
  private String description = null;
  private List results = null;
   
  
   
  public void setResults(List results) {
    this.results = results;
  }
   
  public List getResults() {
    return results;
  }
  
  public void setFountainName(String fountainName)
  {
	  this.fountainName = fountainName;
  }
  
  public String getFountainName()
  {
	  return fountainName;
  }
  
  public void setDescription(String description)
  {
	  this.description = description;
  }
  
  public String getDescription()
  {
	  return description;
  }
   
  // Reset form fields.
   
  public void reset(ActionMapping mapping, HttpServletRequest request)
  {
	  fountainName = null;
	  description  = null;
	  results = null;
  }
   
  // Validate form data.
  public ActionErrors validate(ActionMapping mapping,
    HttpServletRequest request)
  {
    ActionErrors errors = new ActionErrors();
   
    boolean fountainNameEntered = false;
    boolean descriptionEntered = false;
   
    // Determine if name has been entered.
    if (fountainName != null && fountainName.length() > 0) {
    	fountainNameEntered = true;
    }
   
        // Determine if social security number has been entered.
    if (description != null && description.length() > 0) {
    	descriptionEntered = true;
    }
   
    /* Validate that either name or social security number
       has been entered. */
    if (!fountainNameEntered && !descriptionEntered) {
      errors.add(null,
            new ActionMessage("error.search.criteria.missing"));
    }
   
   
   
    return errors;
  }
   
  // Validate format of social security number.
  private static boolean isValidSsNum(String ssNum) {
      if (ssNum.length() < 11) {
       return false;
    }
   
    for (int i = 0; i < 11; i++) {
      if (i == 3 || i == 6) {
        if (ssNum.charAt(i) != '-') {
          return false;
        }
      } else if ("0123456789".indexOf(ssNum.charAt(i)) == -1) {
        return false;
      }
    }
   
    return true;
  }
}