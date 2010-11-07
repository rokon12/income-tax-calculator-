<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/taglibs.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success Page</title>
<link rel="stylesheet" href="css/master.css" type="text/css" />
</head>
<body>

<div id="mask">
<div id="header">
<h1>iTax - Register</h1>
</div>
<div id="content-wrapper">
<div id="leftcol-wrapper">
<div id="leftcol"><jsp:include page="menu.jsp" /></div>
<div id="content">User Details
<hr>
<table>
	<tr>
		<td>1. Name of the Assessee:</td>

		<td>${user.name }</td>

	</tr>

	<tr>
		<td>2. National ID No (if any) :</td>
		<td>${user.nationalid }</td>
	</tr>

	<tr>
		<td>3. (a) Circle:</td>
		<td>${user.circle }</td>
		<td>(b) Taxes Zone:</td>
		<td>${user.taxeszone }</td>
	</tr>

	<tr>
		<td>4. Assessment Year:</td>
		<td>${user.asssessment}</td>
	</tr>

	<tr>
		<td>5. Residential Status:</td>
		<td>${user.residentialstatus }</td>
	</tr>

	<tr>
		<td>6. Status:</td>
		<td>${user.status }</td>
	</tr>

	<tr>
		<td>7. Name of the employer/business (where applicable):</td>
		<td>${user.nameoftheemployer}</td>
	</tr>

	<tr>
		<td>8. Wife/Husband's Name:</td>
		<td>${user.wiferrhusbandsname }</td>
	</tr>

	<tr>
		<td>9. Father's Name:</td>
		<td>${user.fathersname }</td>
	</tr>

	<tr>
		<td>10. Mother's Name:</td>
		<td>${user.mothersname}</td>
	</tr>

	<tr>
		<td>11. Date of Birth:</td>
		<td>${user.dateofbirth }</td>
	</tr>

	<tr>
		<td>12. Address (a) Present:</td>
		<td>${user.presentaddress }</td>
		<td>(b) Permanent:</td>
		<td>${user.paradd }</td>


	</tr>

	<tr>
		<td>13. Mobile:</td>
		<td>${user.telephoneno }</td>
	</tr>

	<tr>
		<td>14. VAT Registration Number (if any):</td>
		<td>${user.vatreginumber }</td>
	</tr>

</table>
</div>
</div>
</div>
<div id=clearfooter"></div>
</div>
<div id="footer" align="center"><jsp:include page="footer.jsp" />
</div>

</body>
</html>