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
<h1>iTax - Login</h1>
</div>
<div id="content-wrapper">
<div id="leftcol-wrapper">
<div id="leftcol"><jsp:include page="menu.jsp" /></div>
<div id="content">Salary Details:
<hr>
1. Basic Pay: ${salary.basicpay }<br />
2. Dearness Allowance: ${salary.dearall }<br />
3. Conveyance allowance: ${salary.convyall }<br />
4. House rent allowance: ${salary.houserent }<br />
5. Medical allowance: ${salary.mediall }<br />
6. Servant allowance: ${salary.serall }<br />
7. Leave allowance: ${salary.leaveall }<br />
8. Honorarium/Reward/Fee: ${salary.honorium }<br />
9. Overtime allowance: ${salary.overtime }<br />
10 . Bonus/Ex-gratia: ${salary.bonus }<br />
11. Other allowance (Entertainment): ${salary.entertainment }<br />
12. Employer's Contribution to Recognized Provident Fund:
${salary.providentcontri }<br />
13. Interest accrued on Recognized Provident Fund:
${salary.prvidentaccrud }<br />
14. Deemed income for transport facility: ${salary.trancfacility }<br />
15. Others, if any: ${salary.others }<br />

<br />
<br />
</div>
</div>
</div>
<div id=clearfooter"></div>
</div>
<div id="footer" align="center"><jsp:include page="footer.jsp" />
</div>
</body>
</html>