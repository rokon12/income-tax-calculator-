<%@ page contentType="text/html; charset=utf-8" language="java"
	import="java.sql.*" errorPage=""%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ include file="/WEB-INF/jsp/taglibs.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>income tax</title>
<style type="text/css">
<!--
body {
	font: 100% Verdana, Arial, Helvetica, sans-serif;
	background: #666666;
	margin: 0;
	/* it's good practice to zero the margin and padding of the body element to account for differing browser defaults */
	padding: 0;
	text-align: center;
	/* this centers the container in IE 5* browsers. The text is then set to the left aligned default in the #container selector */
	color: #000000;
	background-repeat: repeat;
	background-color: #333300;
	background-image: url(image/green11.jpg);
}

.twoColHybLtHdr #container {
	width: 80%; /* this will create a container 80% of the browser width */
	background: #FFFFFF;
	margin: 0 auto;
	/* the auto margins (in conjunction with a width) center the page */
	border: 1px solid #000000;
	text-align: left;
	/* this overrides the text-align: center on the body element. */
}

.twoColHybLtHdr #header {
	background: #DDDDDD;
	padding: 0 10px;
	/* this padding matches the left alignment of the elements in the divs that appear beneath it. If an image is used in the #header instead of text, you may want to remove the padding. */
}

.twoColHybLtHdr #header h1 {
	margin: 0;
	/* zeroing the margin of the last element in the #header div will avoid margin collapse - an unexplainable space between divs. If the div has a border around it, this is not necessary as that also avoids the margin collapse */
	padding: 10px 0;
	/* using padding instead of margin will allow you to keep the element away from the edges of the div */
}

/* Tips for sidebar1:
1. Since we are working in relative units, it's best not to use padding on the sidebar. It will be added to the overall width for standards compliant browsers creating an unknown actual width. 
2. Since em units are used for the sidebar value, be aware that its width will vary with different default text sizes.
3. Space between the side of the div and the elements within it can be created by placing a left and right margin on those elements as seen in the ".twoColHybLtHdr #sidebar1 p" rule.
*/
.twoColHybLtHdr #sidebar1 {
	float: left;
	width: 12em; /* since this element is floated, a width must be given */
	background: #EBEBEB;
	/* the background color will be displayed for the length of the content in the column, but no further */
	padding: 15px 0;
	/* top and bottom padding create visual space within this div  */
}

.twoColHybLtHdr #sidebar1 h3,.twoColHybLtHdr #sidebar1 p {
	margin-left: 10px;
	/* the left and right margin should be given to every element that will be placed in the side columns */
	margin-right: 10px;
}

/* Tips for mainContent:
1. The space between the mainContent and sidebar1 is created with the left margin on the mainContent div.  No matter how much content the sidebar1 div contains, the column space will remain. You can remove this left margin if you want the #mainContent div's text to fill the #sidebar1 space when the content in #sidebar1 ends.
2. Be aware it is possible to cause float drop (the dropping of the non-floated mainContent area below the sidebar) if an element wider than it can contain is placed within the mainContent div. WIth a hybrid layout (percentage-based overall width with em-based sidebar), it may not be possible to calculate the exact width available. If the user's text size is larger than average, you will have a wider sidebar div and thus, less room in the mainContent div. You should be aware of this limitation - especially if the client is adding content with Contribute.
3. In the Internet Explorer Conditional Comment below, the zoom property is used to give the mainContent "hasLayout." This may help avoid several IE-specific bugs.
*/
.twoColHybLtHdr #mainContent {
	margin: 0 20px 0 13em;
	/* the right margin can be given in percentages or pixels. It creates the space down the right side of the page. */
}

.twoColHybLtHdr #footer {
	padding: 0 10px;
	/* this padding matches the left alignment of the elements in the divs that appear above it. */
	background: #DDDDDD;
}

.twoColHybLtHdr #footer p {
	margin: 0;
	/* zeroing the margins of the first element in the footer will avoid the possibility of margin collapse - a space between divs */
	padding: 10px 0;
	/* padding on this element will create space, just as the the margin would have, without the margin collapse issue */
}

/* Miscellaneous classes for reuse */
.fltrt {
	/* this class can be used to float an element right in your page. The floated element must precede the element it should be next to on the page. */
	float: right;
	margin-left: 8px;
}

.fltlft {
	/* this class can be used to float an element left in your page */
	float: left;
	margin-right: 8px;
}

.clearfloat {
	/* this class should be placed on a div or break element and should be the final element before the close of a container that should fully contain a float */
	clear: both;
	height: 0;
	font-size: 1px;
	line-height: 0px;
}

a {
	font-family: Georgia, Times New Roman, Times, serif;
	font-size: 100%;
}

a:hover {
	color: #6699FF;
}

.style1 {
	color: #00FF99
}
-->
</style>
<!--[if IE]>
<style type="text/css"> 
/* place css fixes for all versions of IE in this conditional comment */
.twoColHybLtHdr #sidebar1 { padding-top: 30px; }
.twoColHybLtHdr #mainContent { zoom: 1; padding-top: 15px; }
/* the above proprietary zoom property gives IE the hasLayout it may need to avoid several bugs */
</style>
<![endif]-->
</head>

<body class="twoColHybLtHdr">

<div id="container">
<div id="header">
<h1><img src="image/itaxBan.jpg" width="100%" height="142"
	alt="itaxLogo"></h1>
<jsp:include page="/WEB-INF/jsp/supermenu.jsp" flush="true" /> <!-- end #header --></div>
<div id="sidebar1">
<h3><jsp:include page="/WEB-INF/jsp/menu.jsp" flush="true" />&nbsp;</h3>
<p>&nbsp;</p>
<!-- end #sidebar1 --></div>
<div id="mainContent">
<h2>HELP</h2>

<h3>What is income tax?</h3>
<p align="justify">Income tax is a tax paid on income. It is paid by
employees and people who are self-employed. It may also be payable if
you aren't working if, for example, you have an income from a pension or
savings. Not all types of income are taxable and it will seldom be the
case that all of your income is taxed. There is no minimum age at which
a person becomes liable to pay income tax. What matters is the amount of
your taxable income. If this is below a certain level, no tax is
payable. <br />
<br />
Source of Income: <br />
For the purpose of computation of total income and charging tax thereon,
sources of income can be classified into 7 categories, which are as
follows :
<ul>
	<ol>
		Salaries
	</ol>
	<ol>
		Interest on securities
	</ol>
	<ol>
		Income from house property
	</ol>
	<ol>
		Income from agriculture
	</ol>
	<ol>
		Income from business or profession
	</ol>
	<ol>
		Capital gains
	</ol>
	<ol>
		Income from other sources.
	</ol>
</ul>

</p>
<h3>Income from salary</h3>
<p align="justify"><br />
Income under heads of salary is defined as remuneration received by an
individual for services rendered by him to undertake a contract whether
it is expressed or implied. According to Income Tax Act there are
following conditions where all such remuneration are chargeable to
income tax:
<ul>
	<ol>
		When due from the former employer or present employer in the previous
		year, whether paid or not
	</ol>
	<br />
	<ol>
		When paid or allowed in the previous year, by or on behalf of a former
		employer or present employer, though not due or before it becomes due.
	</ol>
	<br />
	<ol>
		When arrears of salary is paid in the previous year by or on behalf of
		a former employer or present employer, if not charged to tax in the
		period to which it relates.
	</ol>
</ul>
</p>

<h3>Interest on securities</h3>

<p align="justify">A security interest is a property interest
created by agreement or by operation of law over assets to secure the
performance of an obligation, usually the payment of a debt.[1] It gives
the beneficiary of the security interest certain preferential rights in
the disposition of secured assets. Such rights vary according to the
type of security interest, but in most cases, a holder of the security
interest is entitled to seize, and usually sell, the property to
discharge the debt that the security interest secures.</p>

<h3>Income from house property</h3>
<p align="justify">In ordinary parlance, your income from house property will
presuppose that you have a house from which you are deriving income in
the form of rent. The scope of income from house property for the
purpose of the Income tax Act is, however, much wider. It is quite
possible that the house property in question is not giving you any rent
as is the case when it remains vacant throughout the year or you may be
using it yourself for self-occupation. Yet, for the purpose of the
Income-tax Act, you will have income from house property. For what is
taxed under this head is not the actual rent but the inherent capacity
of the property to earn income. This is technically known as the “annual
value” of the property.</p>

<h3>Income from agriculture</h3>
<h3>Income from business or profession</h3>
<h3>Capital gains</h3>
<h3>Income from other sources.</h3>

<!-- end #mainContent --></div>
<!-- This clearing element should immediately follow the #mainContent div in order to force the #container div to contain all child floats -->
<br class="clearfloat">
<div id="footer" align="center">
<p>&copy iTax 2010</p>
<!-- end #footer --></div>
<!-- end #container --></div>
</body>
</html>
