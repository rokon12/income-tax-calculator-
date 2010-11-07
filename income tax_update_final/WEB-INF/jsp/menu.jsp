<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@page import="com.rokon.web.SessionKeys"%><ul>
	<li><a href="<%=request.getContextPath()%>/adminHome.htm">Home</a></li>
<% 
//if (request.getAttribute("RequestKeys.AUTH_ATTRIBUE") == null) { 
%>
	<li><a href="<%=request.getContextPath()%>/logoutPage.htm?action=logout">Logout</a></li>
<% //} else { %>
	<li><a href="<%=request.getContextPath()%>/loginPage.htm">Login</a></li>
<% //} %>
	<li><a href="<%=request.getContextPath()%>/userResitration.htm">Register</a></li>
	<li><a href="<%=request.getContextPath()%>/userInfoSubmit.htm">User Info Submission</a></li>
	<li><a href="<%=request.getContextPath()%>/salarySheet.htm">Salary Sheet</a></li>
	<li><a href="<%=request.getContextPath()%>/houseProperty.htm">House Property</a></li>
	<li><a href="<%=request.getContextPath()%>/agriculture.htm">Agriculture Income</a></li>
	<li><a href="<%=request.getContextPath()%>/captalgain.htm">Capital,Others & Foreign</a></li>
	<li><a href="<%=request.getContextPath()%>/security.htm">Security</a></li>
	<li><a href="<%=request.getContextPath()%>/bussiOrProff.htm">Income From Busi. or Profession</a></li>
	<li><a href="<%=request.getContextPath()%>/investmentCredit.htm">Investment of tax credit</a></li>
	<li><a href="<%=request.getContextPath()%>/statmentOfAssetForm.htm">Statement of asset</a></li>
	<li><a href="<%=request.getContextPath()%>/particularExpForm.htm">Particular Expense</a></li>
	<li><a href="<%=request.getContextPath()%>/report.htm">Calculate</a></li>
	
</ul>

