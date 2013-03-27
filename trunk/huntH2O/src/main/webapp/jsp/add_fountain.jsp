<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
   
<html>
<head>
<title>All you can drink buffet - Drinking Fountain Search</title>
</head>
<body>
   
<font size="+1">
All you can drink buffet - Drinking Fountain Search
</font><br>
<hr width="100%" noshade="true">
   
<html:errors/>
   
<html:form action="/add">
   
<table>
<tr>
<td align="right"><bean:message key="label.search.fountainName"/>:</td>
<td><html:text property="fountainName"/></td>
</tr>

<tr>
<td align="right"><bean:message key="label.search.description"/>:</td>
<td><html:text property="description"/></td>
</tr>
<tr>
<td align="right">address:</td>
<td><input type="text"/></td>
</tr>
<tr>
<td></td>
<td><html:submit value="add"/></td>
</tr>
</table>
   
</html:form>
   
<logic:present name="addFountainForm" property="results">
   
<hr width="100%" size="1" noshade="true">
   
<bean:size id="size" name="addFountainForm" property="results"/>
<logic:equal name="size" value="0">
<center><font color="red"><cTypeface:Bold>No drinking fountain Found</b></font></center>
</logic:equal>
   
<logic:greaterThan name="size" value="0">
<table border="1">
<tr>
<th>Fountain Name</th>
<th>Description</th>
</tr>
<logic:iterate id="result" name="addFountainForm" property="results">
<tr>
<td><bean:write name="result" property="fountainName"/></td>
<td><bean:write name="result" property="description"/></td>
</tr>
</logic:iterate>
</table>
</logic:greaterThan>
   
</logic:present>
   
</body>
</html>