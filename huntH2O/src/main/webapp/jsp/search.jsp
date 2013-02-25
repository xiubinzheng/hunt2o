<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic"  %>

   
<html>
<head>
<title>Find any drinking fountain near you!!! :)</title>
</head>
<body>
   
<font size="+1">
HuntH2O Inc.
</font><br>
   
<html:errors/>
   
<html:form action="search">
   
<table>
 <tr>
<td><html:text property="fountainName"/></td>
</tr>
<tr>

</tr>


<tr>

<td align="justify"><html:submit value ="search"/></td>
</tr>
</table>
   
</html:form>
   
<logic:present name="searchForm" property="results">
   
<hr width="100%" size="1" noshade="true">
<bean:size id="size" name="searchForm" property="results"/>
<logic:equal name="size" value="0">
<center><font color="red">No drinking fountain Found</b></font></center>
</logic:equal>
   
</logic:present>
   
</body>
</html>
