<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic"  %>

   
<html>
<head>
<title>ABC, Inc. Human Resources Portal - Employee Search</title>
</head>
<body>
   
<font size="+1">
ABC, Inc. Human Resources Portal - Employee Search
</font><br>
<hr width="100%" noshade="true">
   
<html:errors/>
   
<html:form action="search">
   
<table>
 <tr>
<td><html:text property="fountainName"/></td>
</tr>
<tr>
<td></td>
<td>-- or --</td>
</tr>


<tr>
<td></td>
<td><html:submit/></td>
</tr>
</table>
   
</html:form>
   
<logic:present name="searchForm" property="results">
   
<hr width="100%" size="1" noshade="true">
<bean:size id="size" name="searchForm" property="results"/>
<logic:equal name="size" value="0">
<center><font color="red">No Employees Found</b></font></center>
</logic:equal>
   
</logic:present>
   
</body>
</html>
