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
	
	<jsp:include page="/WEB-INF/jsp/supermenu.jsp" flush="true" />
<!-- end #header --></div>
<div id="sidebar1">
<h3><jsp:include page="/WEB-INF/jsp/menu.jsp" flush="true" />&nbsp;</h3>
<p>&nbsp;</p>
<!-- end #sidebar1 --></div>
<div id="mainContent">



<br/>
<br/>
<h2>About Us</h2>

<p align="justify"><font size="4" face="Verdana">This is a
very first version of income tax calculator. It can properly calculate <b>individual
income tax</b>. Three 3rd semester students <a href="#A">A.N.M Bazlur Rahman</a> ,<a href="#B">Md.Tauhid
Bin Iqbal</a> and <a href="#C">Mirza Rehenuma Tabassum </a>of Institute of Information
Technology (IIT), University Of Dhaka has developed itax as a Project of
their 3rd Semester. And their supervisor was <a href="#D">Mr.Rashedul bari Sujan</a> who
is a Software Engineer by profession.</font></p>


<br />
<br />
<br />
<br />
<br />
<br />
<h3><a name="A">A. N. M. Bazlur Rahman:</a></h3>
<img align="middle" src="image/rokon.jpg" width="400" height="300" />

<p align="justify"><em>A. N. M Bazlur Rahman is a student of <a
	href="http://iit.univdhaka.edu"> Institute of Information
Technology (IIT)</a>, <a href="http://www.univdhaka.edu">University Of
Dhaka.</a> He is now completing his 3rd semester. Solving different kinds of
mathematical problems using programming language is his hobby. He is
very much efficient in C, C++, python, Java (both SE & EE). Besides
programming, writing poem and blogging are his favorite hobbies. To make
a website that will hold a brand value is his current dream. <br />
<br />
Linked Address: </em></p>
<br />
<br />
<br />
<h3><a name="B">Md. Tauhid Bin Iqbal:</a></h3>
<img align="middle" src="image/pran.jpg" width="400" height="400" />

<p align="justify"><em>Md.Tauhid Bin Iqbal is a 3rd semester
student of <a href="http://iit.univdhaka.edu"> Institute of
Information Technology (IIT)</a>, <a href="http://www.univdhaka.edu">University
Of Dhaka.</a> He is very much efficient in solving different kinds of
mathematical problems using programming language. His favorite language
is JAVA. Besides the academic education, he is very much well known as a
debater. His current dream is to make a unique website that will hold
all the fundamental things and information about debate. </em></p>

<br />
<br />
<br />
<h3><a name="C">Mirza Rehenuma Tabassum:</a></h3>
<img align="middle" src="image/rehenu.jpg" width="400" height="300" />

<p align="justify"><em> Mirza Rehenuma Tabassum is a 3rd
semester student of <a href="http://iit.univdhaka.edu"> Institute of
Information Technology (IIT)</a>, <a href="http://www.univdhaka.edu">University
Of Dhaka.</a> She already proved her skills in different programming
language, like Java, C, C++ etc. She has already a published paper in
‘Skeen tests’ by a Malaysian organization. Besides academic study, she
is also habituated in different co-curricular activities. Her present
dream is to work on navigation softwares. </em></p>

<br />
<br />
<br />
<h3><a name="D">Mr.Rashedul bari Sujan:</a></h3>
<img align="middle" src="image/rasedul_bari.jpg" width="300"
	height="400" />

<p align="justify"><em> He has completed his BSc
and MSc degree from Department of Computer Science & Engineering, Dhaka
Universtiy. He works as a honorary teacher in Institute of Information
Technology, University of Dhaka. Besides teaching, he is working as a
Senior software developer in Vantage Communications. He is also a
software engineer in Therap,BD. Also he is working as a software
engineer in Boarding Vista Limited. </em></p>




<!-- end #mainContent --></div>
<!-- This clearing element should immediately follow the #mainContent div in order to force the #container div to contain all child floats -->
<br class="clearfloat">
<div id="footer" align="center">
<p>&copy iTax 2010</p>
<!-- end #footer --></div>
<!-- end #container --></div>




</body>
</html>
