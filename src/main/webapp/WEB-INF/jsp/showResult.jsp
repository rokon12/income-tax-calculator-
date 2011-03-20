<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Final sheet</title>

<style type="text/css">
.tablebdr,.tablebdr td {
	border-color: #000000;
	border-style: solid;
}

.tablebdr {
	border-width: 0 0 1px 1px;
	border-spacing: 0;
	border-collapse: collapse;
}

.tablebdr td {
	margin: 0;
	padding: 4px;
	border-width: 1px 1px 0 0;
	background-color: #FFFFFF;
}

p,ol li {
	text-align: justify;
}
</style>
</head>


<body
	style="font-family: 'Times New Roman', Times, serif; font-size: 13px;">
<div align="center" style="margin: 0;">
<form action="post">
<table width="700" border="0" cellspacing="0" cellpadding="4">
	<tr>
		<td align="right" valign="top">
		<div
			style="float: left; font-family: Verdana, Arial, Helvetica, sans-serif; font-size: 11px;"><a
			href="finalSheet.htm?reportViewType=pdf" style="color: #0000FF;">Print
		as a PDF Format</a> <img src="image/pdf.jpg" width="40px" height="40px" /></div>
		<div style="float: right;"><a
			href="<%=request.getContextPath()%>/adminHome.htm"><img
			src="image/home_icon.gif" width="40px" height="40px" border="0"
			title="Back To Home" /></a>&nbsp;&nbsp;&nbsp;<a
			href="<%=request.getContextPath()%>/salarySheet.htm"><img
			src="image/calculator.jpg" width="40px" height="40px" border="0"
			title="Start Again Calculator" /></a>&nbsp;&nbsp;&nbsp;<a title=""><img
			src="image/Printer-icon.png" width="40px" height="40px" border="0"
			title="Print Page 1" /></a></div>
		<div style="clear: both;"></div>
		<hr />
		</td>
	</tr>

	<tr>
		<td align="center" valign="top">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td width="85%" align="center" valign="top"><strong>FORM
				OF RETUN OF INCOME UNDER THE INCOME TAX<br />
				ORDINANCE, 1984 (XXXVI OF 1984)</strong></td>
				<td width="15%" align="right" valign="top">
				<table width="100" border="0" cellpadding="0" cellspacing="0"
					class="tablebdr">
					<tr>
						<td align="center" valign="middle"><strong>IT-11GA</strong></td>
					</tr>
				</table>
				</td>
			</tr>
		</table>
		</td>
	</tr>
	<tr>
		<td align="center" valign="top">
		<table width="224" border="0" cellpadding="4" cellspacing="0">
			<tr>
				<td width="223" align="center" valign="top"
					style="color: #FFFFFF; background-color: #000000;"><strong>FOR
				INDIVIDUAL AND OTHER TAXPAYERS</strong><br />
				(OTHER THAN COMPANY)</td>
			</tr>
		</table>
		</td>
	</tr>
	<tr>
		<td align="center" valign="top">
		<table width="96%" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td width="47%" align="left" valign="top">
				<table width="186" border="0" cellpadding="0" cellspacing="0"
					class="tablebdr">
					<tr>
						<td align="center" valign="top"><strong>Be a
						Respectable Taxpayer<br />
						Submit return in due time<br />
						Avoid penalty</strong></td>
					</tr>
				</table>
				Put the tick (&radic;) mark wherever applicable
				<table border="0" cellpadding="0" cellspacing="4"
					style="width: 300px; height: 30px;">
					<tr>
						<td
							style="border: 1px #000000 solid; width: 28%; text-align: center; vertical-align: middle;"><strong>Self</strong></td>
						<td
							style="border: 1px #000000 solid; width: 41%; text-align: center; vertical-align: middle;"><strong>Universal
						Self</strong></td>
						<td
							style="border: 1px #000000 solid; width: 31%; text-align: center; vertical-align: middle;"><strong>Normal</strong></td>
					</tr>
				</table>
				</td>
				<td width="53%" align="right" valign="top">
				<table width="125" height="97" border="0" cellpadding="0"
					cellspacing="0" class="tablebdr">
					<tr>
						<td height="96" align="center" valign="middle"><strong>Photograph
						of the Assessee</strong><br />
						[to be attested on the photograph]</td>
					</tr>
				</table>
				</td>
			</tr>
		</table>
		</td>
	</tr>
	<tr>
		<td align="center" valign="top">
		<div style="width: 645px; border: 1px #000000 solid; padding: 10px">
		<table width="100%" border="0" cellspacing="0" cellpadding="6">
			<tr>
				<td align="left" valign="middle">1. Name of the Assessee: &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp
				${report.user.name}</td>
			</tr>
			<tr>
				<td align="left" valign="middle">2. National ID No (if any):&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp
				${report.user.nationalid}</td>
			</tr>
			<tr>
				<td align="left" valign="middle">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td width="15%" align="left" valign="middle">3. UTIN (if
						any):</td>
						<td width="85%" align="left" valign="middle"></td>
					</tr>
				</table>
				</td>
			</tr>
			<tr>
				<td align="left" valign="middle">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td width="7%" align="left" valign="middle">4. TIN:</td>
						<td width="93%" align="left" valign="middle"></td>
					</tr>
				</table>
				</td>

			</tr>
			<tr>
				<td align="left" valign="middle">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td width="50%">5. (a) Circle:&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp ${report.user.circle}</td>
						<td width="50%">(b) Taxes Zone: &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp ${report.user.taxeszone}</td>
					</tr>
				</table>
				</td>
			</tr>
			<tr>
				<td align="left" valign="middle">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td width="50%">6. Assessment Year:&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp
						${report.user.asssessment}</td>
						<td width="50%">7. Residential
						Status:&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp ${report.user.residentialstatus}</td>
					</tr>
				</table>
				</td>
			</tr>
			<tr>
				<td align="left" valign="middle">8.
				Status:&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp ${report.user.status}</td>
			</tr>
			<tr>
				<td align="left" valign="middle">9. Name of the
				employer/business (where
				applicable):&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp ${report.user.nameoftheemployer}</td>
			</tr>
			<tr>
				<td align="left" valign="middle">10. Wife/Husband's Name (if
				assessee, please mention TIN):&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp ${report.user.wiferrhusbandsname}</td>
			</tr>
			<tr>
				<td align="left" valign="middle">11. Father's
				Name:&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp ${report.user.fathersname}</td>
			</tr>
			<tr>
				<td align="left" valign="middle">12. Mother's
				Name:&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp ${report.user.mothersname}</td>
			</tr>
			<tr>
				<td align="left" valign="middle">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td width="39%" align="left" valign="middle">13. Date of
						Birth (in case of individual): </td>
						<td width="61%" align="left" valign="middle"> ${report.user.dateofbirth}</td>
						
					</tr>
				</table>
				</td>
			</tr>
			<tr>
				<td align="left" valign="middle">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td width="20%" height="75" align="left" valign="top">14.
						Address (a) Present:&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp ${report.user.presentaddress}</td>
						<td width="80%" align="left" valign="top"></td>
					</tr>
				</table>
				</td>
			</tr>
			<tr>
				<td align="left" valign="middle">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td width="20%" height="78" align="left" valign="top">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(b)
						Permanent:&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp ${report.user.paradd}</td>
						<td width="80%" align="left" valign="top"></td>
					</tr>
				</table>
				</td>
			</tr>
			<tr>
				<td align="left" valign="middle">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td width="50%">15. Telephone: Office/Business
						:&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp ${report.user.telephoneno}</td>
						<td width="50%">Residential:</td>
					</tr>
				</table>
				</td>
			</tr>
			<tr>
				<td align="left" valign="middle">16. VAT Registration Number
				(if any):&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp ${report.user.vatreginumber}</td>
			</tr>
		</table>
		</div>
		</td>
	</tr>

	<tr>
		<td align="center" valign="top">&nbsp;</td>
	</tr>
	<tr>
		<td align="center" valign="top">
		<div style="float: left;"><strong>1</strong></div>
		<div style="float: right;">&copy; iTax</div>
		</td>
	</tr>
	<tr>
		<td align="right" valign="top">&nbsp;</td>
	</tr>

	<tr>
		<td><br />
		<br />
		<br />
		<br />
		</td>
	</tr>

	<tr>
		<td align="center" valign="top"><u><strong>Statement
		of income of the Assessee</strong></u><br />
		Statement of income during the income year ended on ${date.dateString }.</td>
	</tr>

	<tr>
		<td align="center" valign="top">
		<div style="width: 665px; padding: 0px">
		<table width="100%" border="0" cellpadding="0" cellspacing="0"
			class="tablebdr">
			<tr>
				<td align="center" valign="top"><strong>Serial no.</strong></td>
				<td align="center" valign="top"><strong>Heads of
				Income</strong></td>
				<td align="center" valign="top"><strong>Amount in Taka</strong></td>
			</tr>
			<tr>
				<td align="center" valign="middle">1</td>
				<td align="left" valign="middle">Salaries : u/s 21 (as per
				schedule 1)</td>
				<td align="center" valign="middle">0</td>
			</tr>
			<tr>
				<td align="center" valign="middle">2</td>
				<td align="left" valign="middle">Interest on Securities : u/s
				22</td>
				<td align="center" valign="middle">0</td>
			</tr>
			<tr>
				<td align="center" valign="middle">3</td>
				<td align="left" valign="middle">Income from house property :
				u/s 24 (as per schedule 2)</td>
				<td align="center" valign="middle">0</td>
			</tr>
			<tr>
				<td align="center" valign="middle">4</td>
				<td align="left" valign="middle">Agricultural income : u/s 26</td>
				<td align="center" valign="middle">0</td>
			</tr>
			<tr>
				<td align="center" valign="middle">5</td>
				<td align="left" valign="middle">Income from business or
				profession : u/s 28</td>
				<td align="center" valign="middle">0</td>
			</tr>
			<tr>
				<td align="center" valign="middle">6</td>
				<td align="left" valign="middle">Share of profit in a firm :</td>
				<td align="center" valign="middle">0</td>
			</tr>
			<tr>
				<td align="center" valign="middle">7</td>
				<td align="left" valign="middle">Income of the spouse or minor
				child as applicable : u/s 43(4)</td>
				<td align="center" valign="middle"></td>
			</tr>
			<tr>
				<td align="center" valign="middle">8</td>
				<td align="left" valign="middle">Capital Gains : u/s 31</td>
				<td align="center" valign="middle">0</td>
			</tr>
			<tr>
				<td align="center" valign="middle">9</td>
				<td align="left" valign="middle">Income from other source : u/s
				33</td>
				<td align="center" valign="middle">0</td>
			</tr>
			<tr>
				<td align="center" valign="middle">10</td>
				<td align="left" valign="middle">Total (serial no. 1 to 9)</td>
				<td align="center" valign="middle">0</td>
			</tr>
			<tr>
				<td align="center" valign="middle">11</td>
				<td align="left" valign="middle">Foreign Income:</td>
				<td align="center" valign="middle">0</td>
			</tr>
			<tr>
				<td align="center" valign="middle">12</td>
				<td align="left" valign="middle">Total income (serial no. 10
				and 11)</td>
				<td align="center" valign="middle">0</td>
			</tr>
			<tr>
				<td align="center" valign="middle">13</td>
				<td align="left" valign="middle">Tax leviable on total income</td>
				<td align="center" valign="middle">0</td>
			</tr>
			<tr>
				<td align="center" valign="middle">14</td>
				<td align="left" valign="middle">Tax rebate: u/s 44(2)(b)(as
				per schedule 3)</td>
				<td align="center" valign="middle">100000</td>
			</tr>
			<tr>
				<td align="center" valign="middle">15</td>
				<td align="left" valign="middle">Tax payable (difference
				between serial no. 13 and 14)</td>
				<td align="center" valign="middle">Below Taxable</td>
			</tr>
			<tr>
				<td rowspan="8" align="center" valign="middle">16</td>
				<td align="left" valign="middle">Tax Payments: Tax on taxed
				income: Tk. 0</td>
				<td rowspan="8" align="center" valign="bottom">Below Taxable</td>
			</tr>
			<tr>
				<td align="left" valign="middle">(a) Tax deducted/collected at
				source Tk. 0</td>
			</tr>
			<tr>
				<td align="left" valign="middle">(Please attach supporting
				documents/statement) Cap./82C: Tk. 0</td>
			</tr>
			<tr>
				<td align="left" valign="middle">(b) Advance tax u/s 64/68
				(Please attach challan ) Tk. 0</td>
			</tr>
			<tr>
				<td align="left" valign="middle">(c) Tax paid on the basis of
				this return (u/s 74)</td>
			</tr>
			<tr>
				<td align="left" valign="middle">(Please attach challan/pay
				order/bank draft/cheque) Tk. 0</td>
			</tr>
			<tr>
				<td align="left" valign="middle">(d) Adjustment of Tax Refund
				(if any)</td>
			</tr>
			<tr>
				<td align="left" valign="middle">Total of (a), (b), (c) and (d)</td>
			</tr>
			<tr>
				<td align="center" valign="middle">17</td>
				<td align="left" valign="middle">Difference between serial no.
				15 and 16 (if any)</td>
				<td align="center" valign="middle">0</td>
			</tr>
			<tr>
				<td align="center" valign="middle">18</td>
				<td align="left" valign="middle">Tax exempted and Tax free
				income</td>
				<td align="center" valign="middle">0</td>
			</tr>
			<tr>
				<td align="center" valign="middle">19</td>
				<td align="left" valign="middle">Income tax paid in the last
				assessment year</td>
				<td align="center" valign="middle">&nbsp;</td>
			</tr>
		</table>
		</div>
		</td>
	</tr>

	<tr>
		<td align="left" valign="top"><strong><em>*If
		needed, please use separate sheet</em></strong></td>
	</tr>
	<tr>
		<td align="center" valign="top"><u><strong>Verification</strong></u></td>
	</tr>
	<tr>
		<td align="left" valign="top">I father/husband UTIN/TIN: solemnly
		declare that to the best of my knowledge and belief the information
		given in this return and statements and documents annexed herewith is
		correct and complete.<br />
		Place:<br />
		Date:</td>
	</tr>

	<tr>
		<td align="right" valign="top">
		<table width="205" height="87" border="0" cellpadding="0"
			cellspacing="0">
			<tr>
				<td width="205" height="87" align="center" valign="middle"><br />
				Signature<br />
				(Name in block letters)<br />
				Designation and<br />
				Seal (for other than individual)</td>
			</tr>
		</table>
		</td>
	</tr>

	<tr>
		<td align="center" valign="top">
		<div style="float: left;"><strong>2</strong></div>
		<div style="float: right;">&copy; iTax</div>
		</td>
	</tr>



	<tr>
		<td align="right" valign="top">&nbsp;</td>
	</tr>


	<tr>
		<td><br />
		<br />
		<br />
		<br />
		</td>
	</tr>


	<tr>
		<td align="center" valign="top"><strong>SCHEDULES
		SHOWING DETAILS OF INCOME</strong></td>
	</tr>

	<tr>
		<td align="center" valign="top">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td width="54%" align="left" valign="middle"><strong>Name
				of the Assessee:</strong></td>
				<td width="46%" align="left" valign="middle">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td width="9%" align="left" valign="middle"><strong>TIN:
						</strong></td>
						<td width="91%" align="left" valign="middle"></td>
					</tr>
				</table>
				</td>
			</tr>
		</table>
		</td>
	</tr>
	<tr>
		<td align="center" valign="top"><strong><u>Schedule-1
		(Salaries)</u></strong></td>
	</tr>
	<tr>
		<td align="center" valign="top">
		<div style="width: 665px; padding: 0px">
		<table width="100%" border="0" cellpadding="0" cellspacing="0"
			class="tablebdr">
			<tr>
				<td width="52%" align="center" valign="top"><strong>Pay
				&amp; Allowance</strong></td>
				<td width="16%" align="center" valign="top"><strong>Amount
				of Income (Tk.)</strong></td>
				<td width="18%" align="center" valign="top"><strong>Amount
				of exempted income (Tk.)</strong></td>
				<td width="14%" align="center" valign="top"><strong>Net
				taxable income (Tk.)</strong></td>
			</tr>
			<tr>
				<td align="left" valign="middle">Basic pay</td>
				<td width="16%" align="center" valign="middle">${report.salary.basicpay }</td>
				<td width="18%" align="center" valign="middle">&nbsp; </td>
				<td width="14%" align="center" valign="middle">${report.salary.basicpay }</td>
			</tr>
			<tr>
				<td align="left" valign="middle">Special pay</td>
				<td align="center" valign="middle">${report.salary.spacialpay }</td>
				<td align="center" valign="middle">&nbsp;</td>
				<td align="center" valign="middle">${report.salary.spacialpay }</td>
			</tr>
			<tr>
				<td align="left" valign="middle">Dearness allowance</td>
				<td align="center" valign="middle">${report.salary.dearall}</td>
				<td align="center" valign="middle">&nbsp;</td>
				<td align="center" valign="middle"></td>
			</tr>
			<tr>
				<td align="left" valign="middle">Conveyance allowance</td>
				<td align="center" valign="middle">${report.salary.convyall}</td>
				<td align="center" valign="middle"></td>
				<td align="center" valign="middle">0</td>
			</tr>
			<tr>
				<td align="left" valign="middle">House rent allowance</td>
				<td align="center" valign="middle">${report.salary.houserent}</td>
				<td align="center" valign="middle">0</td>
				<td align="center" valign="middle">0</td>
			</tr>
			<tr>
				<td align="left" valign="middle">Medical allowance</td>
				<td align="center" valign="middle">${report.salary.mediall}</td>
				<td align="center" valign="middle">${report.salary.expendmed}</td>
				<td align="center" valign="middle">0</td>
			</tr>
			<tr>
				<td align="left" valign="middle">Servant allowance</td>
				<td align="center" valign="middle">${report.salary.serall }</td>
				<td align="center" valign="middle">&nbsp;</td>
				<td align="center" valign="middle"></td>
			</tr>
			<tr>
				<td align="left" valign="middle">Leave allowance</td>
				<td align="center" valign="middle">${report.salary.leaveall}</td>
				<td align="center" valign="middle">&nbsp;</td>
				<td align="center" valign="middle"></td>
			</tr>
			<tr>
				<td align="left" valign="middle">Honorarium / Reward/ Fee</td>
				<td align="center" valign="middle">${report.salary.honorium}</td>
				<td align="center" valign="middle">&nbsp;</td>
				<td align="center" valign="middle"></td>
			</tr>
			<tr>
				<td align="left" valign="middle">Overtime allowance</td>
				<td align="center" valign="middle">${report.salary.overtime}</td>
				<td align="center" valign="middle">&nbsp;</td>
				<td align="center" valign="middle"></td>
			</tr>
			<tr>
				<td align="left" valign="middle">Bonus / Ex-gratia</td>
				<td align="center" valign="middle">${report.salary.bonus}</td>
				<td align="center" valign="middle">&nbsp;</td>
				<td align="center" valign="middle"></td>
			</tr>
			<tr>
				<td align="left" valign="middle">Other allowances</td>
				<td align="center" valign="middle"></td>
				<td align="center" valign="middle">&nbsp;</td>
				<td align="center" valign="middle"></td>
			</tr>
			<tr>
				<td align="left" valign="middle">Employer&rsquo;s contribution
				to Recognized Provident Fund</td>
				<td align="center" valign="middle">${report.salary.providentcontri}</td>
				<td align="center" valign="middle">&nbsp;</td>
				<td align="center" valign="middle"></td>
			</tr>
			<tr>
				<td align="left" valign="middle">Interest accrued on Recognized
				Provident Fund</td>
				<td align="center" valign="middle">${report.salary.prvidentaccrud}</td>
				<td align="center" valign="middle"></td>
				<td align="center" valign="middle">&nbsp;</td>
			</tr>
			<tr>
				<td align="left" valign="middle">Deemed income for transport
				facility</td>
				<td align="center" valign="middle">${report.salary.trancfacility}</td>
				<td align="center" valign="middle">0</td>
				<td align="center" valign="middle">0</td>
			</tr>
			<tr>
				<td align="left" valign="middle">Deemed income for free
				furnished/unfurnished accommodation</td>
				<td align="center" valign="middle"></td>
				<td align="center" valign="middle">0</td>
				<td align="center" valign="middle">0</td>
			</tr>
			<tr>
				<td align="left" valign="middle">Other, if any (give detail)</td>
				<td align="center" valign="middle">${report.salary.others}</td>
				<td align="center" valign="middle">&nbsp;</td>
				<td align="center" valign="middle"></td>
			</tr>
			<tr>
				<td align="right" valign="middle">Net taxable income from
				salary</td>
				<td align="center" valign="middle"></td>
				<td align="center" valign="middle">0</td>
				<td align="center" valign="middle">0</td>
			</tr>
		</table>
		</div>
		</td>
	</tr>



	<tr>
		<td align="center" valign="top"><strong><u>Schedule-2
		(House Property income)</u></strong></td>
	</tr>

	<tr>
		<td align="center" valign="top">

		<div style="width: 665px; padding: 0px">
		<table width="100%" border="0" cellpadding="0" cellspacing="0"
			class="tablebdr">
			<tr>
				<td width="35%" align="center" valign="top">Location and
				description of property</td>
				<td width="38%" align="center" valign="top">Particulars</td>
				<td width="14%" align="center" valign="top">Tk.</td>
				<td width="13%" align="center" valign="top">Tk.</td>
			</tr>
			<tr>
				<td rowspan="11" valign="top">&nbsp;</td>
				<td colspan="2" align="left" valign="middle">1. Annual rental
				income</td>
				<td align="left" valign="middle">${report.houseProperty.rentalincome }</td>
			</tr>
			<tr>
				<td colspan="3" align="left" valign="middle">2. Claimed
				Expenses :</td>
			</tr>
			<tr>
				<td align="left" valign="middle">&nbsp;&nbsp;&nbsp; Repair,
				Collection, etc.</td>
				<td align="center" valign="middle">${report.houseProperty.repair }</td>
				<td rowspan="7" valign="top">&nbsp;</td>
			</tr>
			<tr>
				<td align="left" valign="middle">&nbsp;&nbsp;&nbsp; Municipal
				or Local Tax</td>
				<td align="center" valign="middle">${report.houseProperty.municipal }</td>
			</tr>
			<tr>
				<td align="left" valign="middle">&nbsp;&nbsp;&nbsp;&nbsp; Land
				Revenue</td>
				<td align="center" valign="middle">${report.houseProperty.lendrev }</td>
			</tr>
			<tr>
				<td align="left" valign="middle">&nbsp;&nbsp;&nbsp; Interest on
				Loan/Mortgage/Capital Charge</td>
				<td align="center" valign="middle">${report.houseProperty.int_loan_or_mortgaze }</td>
			</tr>
			<tr>
				<td align="left" valign="middle">&nbsp;&nbsp;&nbsp; Insurance
				Premium</td>
				<td align="center" valign="middle">${report.houseProperty.insu_prem}</td>
			</tr>
			<tr>
				<td align="left" valign="middle">&nbsp;&nbsp;&nbsp; Vacancy
				Allowance</td>
				<td align="center" valign="middle">${report.houseProperty.vacan_all }</td>
			</tr>
			<tr>
				<td align="left" valign="middle">&nbsp;&nbsp;&nbsp; Other, if
				any</td>
				<td align="center" valign="middle">${report.houseProperty.other }</td>
			</tr>
			<tr>
				<td colspan="2" align="right" valign="top">Total =</td>
				<td align="left" valign="middle">0</td>
			</tr>
			<tr>
				<td colspan="2" align="left" valign="top">3. Net income (
				difference between item 1 and 2)</td>
				<td align="left" valign="middle">0</td>
			</tr>
		</table>
		</div>
		</td>
	</tr>

	<tr>
		<td align="center" valign="top">
		<div style="float: left;"><strong>3</strong></div>
		<div style="float: right;">&copy; iTax</div>
		</td>
	</tr>

	<tr>
		<td><br />
		<br />
		</td>
	</tr>



	<tr>
		<td align="right" valign="top">&nbsp;</td>
	</tr>
	<tr>

		<tr>
			<td align="center" valign="top"><strong><u>Schedule-3
			(Investment tax credit)</u></strong><br />
			(Section 44(2)(b) read with part &lsquo;B&rsquo; of Sixth Schedule)</td>
		</tr>
		<tr>
			<td align="center" valign="top">
			<div style="width: 665px; padding: 0px">
			<table width="100%" border="0" cellpadding="0" cellspacing="0"
				class="tablebdr">
				<tr>
					<td width="67%" align="left" valign="middle">1. Life insurance
					premium</td>
					<td width="15%" align="left" valign="middle"></td>
				</tr>
				<tr>
					<td align="left" valign="middle">2. Contribution to deferred
					annuity</td>
					<td align="left" valign="middle"></td>
				</tr>
				<tr>
					<td align="left" valign="middle">3. Contribution to Provident
					Fund to which Provident Fund Act, 1925 applies</td>
					<td align="left" valign="middle"></td>
				</tr>
				<tr>
					<td align="left" valign="middle">4. Self contribution and
					employer's contribution to Recognized Provident Fund</td>
					<td align="left" valign="middle"></td>
				</tr>

				<tr>
					<td align="left" valign="middle">5. Contribution to Super
					Annuation Fund</td>
					<td align="left" valign="middle"></td>
				</tr>
				<tr>
					<td align="left" valign="middle">6. Investment in approved
					debenture or debenture stock, Stock or Shares</td>
					<td align="left" valign="middle"></td>
				</tr>
				<tr>
					<td align="left" valign="middle">7. Contribution to deposit
					pension scheme</td>
					<td align="left" valign="middle"></td>
				</tr>
				<tr>
					<td align="left" valign="middle">8. Contribution to Benevolent
					Fund and Group Insurance premium</td>
					<td align="left" valign="middle"></td>
				</tr>
				<tr>
					<td align="left" valign="middle">9. Contribution to Zakat Fund</td>
					<td align="left" valign="middle"></td>
				</tr>
				<tr>
					<td align="left" valign="middle">10. Others, if any (give
					details)</td>
					<td align="left" valign="middle"></td>
				</tr>
				<tr>
					<td align="left" valign="middle">Total</td>
					<td align="left" valign="middle">0</td>
				</tr>
			</table>
			</div>
			</td>
		</tr>
		<tr>
			<td align="left" valign="top"><strong><em>*Please
			attach certificates/documents of investment.</em></strong></td>
		</tr>
		<tr>
			<td align="center" valign="top">&nbsp;</td>
		</tr>
		<tr>
			<td align="center" valign="top"><u><strong>List of
			documents furnished</strong></u></td>
		</tr>

		<tr>
			<td height="125" align="center" valign="top">
			<div style="width: 645px; border: 1px #000000 solid; padding: 10px">
			<table width="100%" height="400" border="0" cellpadding="0"
				cellspacing="0">
				<tr>
					<td height="463" align="left" valign="top"><strong>&radic;
					</strong>Bank Statement.<br />
					<strong>&radic; </strong>Photocopy of rent agreement or details of
					rent.<br />
					<strong>&radic; </strong>Photocopy of interest on borrowed capital.<br />
					<strong>&radic; </strong>Photocopy of municipal tax receipt.<br />
					<strong>&radic; </strong>Photocopy of land revenue.<br />
					<strong>&radic; </strong>Photocopy of insurance receipt.<br />
					<strong>&radic; </strong>Photocopy or details in case of purchase
					share.<br />
					<strong>&radic; </strong>Photocopy or documents against pension
					deposit scheme.<br />
					<strong>&radic; </strong>Photocopy or receipt of Zakat fund.<br />
					<strong>&radic; </strong>Photocopy of new purchased sanchaya patra.<br />
					<strong> &radic; </strong>Photocopy of purchased receipt incase of
					computer.<br />
					</strong> &radic;Photocopy of the pensioneer's saving cirtificates<br />
					<strong>&radic; </strong>Purchase details of immovable asset with
					sufficient documents.<br />
					</td>
				</tr>


			</table>
			</div>
			</td>
		</tr>
		<tr>
			<td align="left" valign="top"><strong><em>*Incomplete
			return is not acceptable</em></strong></td>
		</tr>



		<tr>
			<td><br />
			<br />
			</td>
		</tr>



		<tr>
			<td align="center" valign="top">
			<div style="float: left;"><strong>4</strong></div>
			<div style="float: right;">&copy; iTax</div>
			</td>
		</tr>
		<tr>
			<td align="right" valign="top">&nbsp;</td>
		</tr>

		<tr>
			<td align="right" valign="top"><strong><em>IT-10B</em></strong></td>
		</tr>
		<tr>
			<td align="center" valign="top"><strong>Statement of
			Assets and Liabilities (as on 30th June, 2009)</strong></td>
		</tr>
		<tr>
			<td><br />
			</td>
		</tr>


		<tr>
			<td align="center" valign="top">
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td width="54%" align="left" valign="middle"><strong>Name
					of the Assessee:</strong></td>
					<td width="46%" align="left" valign="middle">
					<table width="100%" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td width="9%" align="left" valign="middle"><strong>TIN:
							</strong></td>
							<td width="91%" align="left" valign="middle"></td>
						</tr>
					</table>
					</td>
				</tr>
			</table>
			</td>
		</tr>
		<tr>
			<td align="center" valign="top">&nbsp;</td>
		</tr>
		<tr>
			<td><br />
			<br />
			</td>
		</tr>
		<tr>



			<td align="center" valign="top">
			<table width="100%" height="768" border="0" cellpadding="0"
				cellspacing="0">
				<tr>
					<td width="65%" height="136" align="left" valign="top">1. (a)
					<strong>Business Capital</strong> (Closing balance)<br />

					&nbsp;&nbsp;&nbsp; (b) <strong>Directors Shareholdings in
					Limited Companies (at cost)</strong>
					<table width="100%" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td width="50%"><u>Name of Companies</u></td>
							<td width="50%"><u>Number of shares</u></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
							<td>&nbsp;</td>
						</tr>
					</table>
					</td>
					<td width="35%" align="left" valign="top"><br />
					</td>
				</tr>
				<tr>
					<td align="left" valign="top">2.<strong>
					Non-Agricultural Property (at cost with legal expenses ) :</strong><br />
					&nbsp;&nbsp;&nbsp; Land/House property (Description and location of
					property)</td>
					<td align="left" valign="top"></td>
				</tr>
				<tr>
					<td height="92" align="left" valign="top">&nbsp;</td>
					<td align="left" valign="top">&nbsp;</td>
				</tr>
				<tr>
					<td align="left" valign="top">3. <strong>Agricultural
					Property (at cost with legal expenses ) :</strong><br />
					&nbsp;&nbsp;&nbsp; Land (Total land and location of land property)</td>
					<td align="left" valign="top"></td>
				</tr>
				<tr>
					<td height="88" align="left" valign="top">&nbsp;</td>
					<td align="left" valign="top">&nbsp;</td>
				</tr>
				<tr>
					<td align="left" valign="top">4. <strong>Investments:</strong><br />
					&nbsp;&nbsp;&nbsp; (a) Shares/Debentures<br />
					&nbsp;&nbsp;&nbsp; (b) Saving Certificate/Unit Certificate/Bond<br />
					&nbsp;&nbsp;&nbsp; (c) Prize bond/Savings Scheme<br />
					&nbsp;&nbsp;&nbsp; (d) Loans given<br />
					&nbsp;&nbsp;&nbsp; (e) Other Investment<br />
					</td>
					<td align="left" valign="top"><br />
					<br />
					<br />
					<br />
					<br />
					<br />
					<br />

					</td>
				</tr>
				<tr>
					<td align="right" valign="middle">Total =</td>
					<td align="left" valign="middle">0</td>
				</tr>
				<tr>
					<td align="left" valign="top">&nbsp;</td>
					<td align="left" valign="top">&nbsp;</td>
				</tr>
				<tr>
					<td align="left" valign="top"><strong>5. Motor
					Vehicles (at cost) :</strong><br />
					&nbsp;&nbsp;&nbsp; Type of motor vehicle and Registration number</td>
					<td align="left" valign="top"></td>
				</tr>
				<tr>
					<td align="left" valign="middle">&nbsp;</td>
					<td align="left" valign="middle">&nbsp;</td>
				</tr>
				<tr>
					<td align="left" valign="middle">6. <strong>Jewellery
					(quantity and cost) :</strong></td>
					<td align="left" valign="middle"></td>
				</tr>
				<tr>
					<td align="left" valign="middle">&nbsp;</td>
					<td align="left" valign="middle">&nbsp;</td>
				</tr>
				<tr>
					<td align="left" valign="middle"><strong>7.Furniture
					(at cost) :</strong></td>
					<td align="left" valign="middle"></td>
				</tr>
				<tr>
					<td><br />
					<br />
					<br />
					</td>
				</tr>
				<tr>
					<td align="left" valign="middle">&nbsp;</td>
					<td align="left" valign="middle">&nbsp;</td>
				</tr>
				<tr>
					<td align="left" valign="middle"><strong>8.
					Electronic Equipment (at cost) :</strong></td>
					<td align="left" valign="middle"></td>
				</tr>
				<tr>
					<td><br />
					<br />
					<br />
					</td>
				</tr>
				<tr>
					<td align="left" valign="top">&nbsp;</td>
					<td align="left" valign="top">&nbsp;</td>
				</tr>
				<tr>
					<td><br />
					<br />
					<br />
					</td>
				</tr>
				<tr>
					<td align="left" valign="top">9. <strong>Cash Asset
					Outside Business:</strong><br />
					&nbsp;&nbsp;&nbsp; (a) Cash in hand<br />
					&nbsp;&nbsp;&nbsp; (b) Cash at bank<br />
					&nbsp;&nbsp;&nbsp; (c) Other deposits<br />
					</td>
					<td align="left" valign="top"><br />
					0<br />
					<br />
					<br />
					<br />
					<br />
					<br />
					<br />
					</td>
				</tr>
				<tr>
					<td align="right" valign="middle">Total =</td>
					<td align="left" valign="middle">0</td>
				</tr>
			</table>
			</td>
		</tr>
		<tr>
			<td align="center" valign="top">
			<div style="float: left;"><strong>5</strong></div>
			<div style="float: right;">&copy; iTax</div>
			</td>
		</tr>

		<tr>
			<td><br />
			<br />
			<br />
			<br />
			</td>
		</tr>




		<tr>
			<td align="right" valign="top">&nbsp;</td>
		</tr>


		<tr>
			<td align="center" valign="top">
			<table width="100%" height="678" border="0" cellpadding="0"
				cellspacing="0">
				<tr>
					<td align="left" valign="top"><strong>10.&nbsp; Any
					other assets</strong> ( Last Year Balance of Schedule-3 = )<br />
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; (With details) ( Addition of The
					Year = 0 )</td>
					<td align="left" valign="top">0</td>
				</tr>
				<tr>
					<td height="55" align="right" valign="top"><strong>Total
					Assets=</strong></td>
					<td align="left" valign="top">0</td>
				</tr>
				<tr>
					<td><br />

					<br />
					</td>
				</tr>



				<tr>
					<td align="left" valign="top"><strong>11. Less
					Liabilities:</strong><br />
					&nbsp;&nbsp;&nbsp; (a) Mortgages secured on property or land<br />
					&nbsp;&nbsp;&nbsp; (b) Unsecured loans<br />
					&nbsp;&nbsp;&nbsp; (c) Bank loan<br />
					&nbsp;&nbsp;&nbsp; (d) Others</td>
					<td align="left" valign="top"><br />
					<br />
					<br />
					<br />
					</td>
				</tr>
				<tr>
					<td align="right" valign="middle"><strong>Total
					Liabilities=</strong></td>
					<td align="left" valign="middle">0</td>
				</tr>
				<tr>
					<td><br />

					<br />
					</td>
				</tr>
				<tr>
					<td height="37" align="left" valign="top">&nbsp;</td>
					<td align="left" valign="top">&nbsp;</td>
				</tr>
				<tr>
					<td><br />

					<br />
					</td>
				</tr>
				<tr>
					<td align="left" valign="top"><strong>12. Net wealth
					as on last date of this income year</strong><br />
					(Difference between total assets and total liabilities)</td>
					<td align="left" valign="top">0</td>
				</tr>
				<tr>
					<td><br />

					<br />
					</td>
				</tr>
				<tr>
					<td align="left" valign="middle">&nbsp;</td>
					<td align="left" valign="middle">&nbsp;</td>
				</tr>
				<tr>
					<td width="65%" align="left" valign="middle"><strong>13.
					Net wealth as on last date of previous income year</strong></td>
					<td width="35%" align="left" valign="middle">0</td>
				</tr>
				<tr>
					<td><br />

					<br />
					</td>
				</tr>
				<tr>
					<td align="left" valign="middle"><strong>14.
					Accretion in wealth</strong> (Difference between serial no. 12 and 13)</td>
					<td align="left" valign="middle">0</td>
				</tr>
				<tr>
					<td><br />

					<br />
					</td>
				</tr>
				<tr>
					<td align="left" valign="top"><strong>15. </strong>(a) Family
					Expenditure: (Total expenditure as per Form IT 10 BB)<br />
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; (b) Number of dependant children of
					the family:
					<table width="229" border="0" cellpadding="2" cellspacing="0">
						<tr>
							<td width="19%" align="center" valign="top">&nbsp;</td>
							<td width="42%" align="center" valign="top">
							<table width="80" height="20" border="0" cellpadding="0"
								cellspacing="0" class="tablebdr">
								<tr>
									<td>&nbsp;</td>
								</tr>
							</table>
							</td>
							<td width="39%" align="center" valign="top">
							<table width="80" height="20" border="0" cellpadding="0"
								cellspacing="0" class="tablebdr">
								<tr>
									<td>&nbsp;</td>
								</tr>
							</table>
							</td>
						</tr>
						<tr>
							<td align="center" valign="top">&nbsp;</td>
							<td align="center" valign="top">Adult</td>
							<td align="center" valign="top">Child</td>
						</tr>
					</table>
					</td>
					<td align="left" valign="top">0</td>
				</tr>
				<tr>
					<td align="left" valign="middle"><strong>16. Total
					Accretion of wealth </strong>(Total of serial 14 and 15)</td>
					<td align="left" valign="middle">0</td>
				</tr>
				<tr>
					<td><br />

					<br />
					</td>
				</tr>

				<tr>
					<td align="left" valign="top"><strong>17. Sources of
					Fund :</strong><br />
					&nbsp;&nbsp;&nbsp; (i) Shown Return Income<br />
					&nbsp;&nbsp;&nbsp; (ii) Tax exempted/Tax free Income<br />
					&nbsp;&nbsp;&nbsp; (iii) Other receipts</td>
					<td align="left" valign="top"><br />
					0<br />
					0<br />
					0</td>
				</tr>
				<tr>
					<td align="right" valign="top">Total source of Fund =</td>
					<td align="left" valign="top">0</td>
				</tr>
				<tr>
					<td align="left" valign="middle"><strong>18.
					Difference</strong> (Between serial 16 and 17)</td>
					<td align="left" valign="middle"></td>
				</tr>
			</table>
			</td>
		</tr>
		<tr>
			<td align="center" valign="top">&nbsp;</td>
		</tr>
		<tr>
			<td align="left" valign="top">I solemnly declare that to the
			best of my knowledge and belief the information given in the IT-10B
			is correct and complete.</td>
		</tr>
		<tr>
			<td align="center" valign="top">&nbsp;</td>
		</tr>
		<tr>
			<td align="right" valign="top">
			<table width="226" height="59" border="0" cellpadding="0"
				cellspacing="0">
				<tr>
					<td width="208" height="59" align="left" valign="bottom"><br />
					Name &amp; signature of the Assessee<br />
					Date</td>
				</tr>
			</table>
			</td>
		</tr>
		<tr>
			<td align="center" valign="top">&nbsp;</td>
		</tr>
		<tr>
			<td align="left" valign="top"><strong><em>&bull;
			Assets and liabilities of self, spouse (if she/he is not an
			assessee), minor children and dependant(s) to be shown in the above
			statements.</em></strong></td>
		</tr>
		<tr>
			<td align="left" valign="top"><strong><em>*If
			needed, please use separate sheet.</em></strong></td>
		</tr>

		<tr>
			<td align="center" valign="top">
			<div style="float: left;"><strong>6</strong></div>
			<div style="float: right;">&copy; iTax</div>
			</td>
		</tr>
		<tr>
			<td><br />

			<br />
			</td>
		</tr>
		<tr>
			<td><br />

			<br />
			</td>
		</tr>

		<tr>
			<td><br />
			<br />
			<br />
			<br />
			</td>
		</tr>


		<tr>
			<td align="right" valign="top">&nbsp;</td>
		</tr>



		<tr>
			<td align="right" valign="top"><strong><em>Form
			No. IT-10BB</em></strong></td>
		</tr>
		<tr>
			<td align="center" valign="top"><strong>FORM</strong></td>
		</tr>
		<tr>
			<td><br />

			<br />
			</td>
		</tr>
		<tr>
			<td align="left" valign="top"><strong>Statement under
			section 75(2)(d)(i) and section 80 of the Income Tax Ordinance, 1984
			(XXXVI of 1984) regarding particulars of life style</strong></td>
		</tr>
		<tr>
			<td align="center" valign="top">
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td width="54%" align="left" valign="middle"><strong>Name
					of the Assessee:</strong></td>
					<td width="46%" align="left" valign="middle">
					<table width="100%" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td width="9%" align="left" valign="middle"><strong>TIN:
							</strong></td>
							<td width="91%" align="left" valign="middle"></td>
						</tr>
					</table>
					</td>
				</tr>
			</table>
			</td>
		</tr>
		<tr>
			<td align="center" valign="top">
			<table width="100%" border="0" cellpadding="0" cellspacing="0"
				class="tablebdr">
				<tr>
					<td align="center" valign="top"><strong>Serial No.</strong></td>
					<td align="center" valign="top"><strong>Particulars
					of Expenditure</strong></td>
					<td align="center" valign="top"><strong>Amount of Tk.</strong></td>
					<td align="center" valign="top"><strong>Comments </strong></td>
				</tr>
				<tr>
					<td align="center" valign="middle">1</td>
					<td align="left" valign="middle">Personal and fooding expenses</td>
					<td align="center" valign="middle"></td>
					<td align="center" valign="middle"></td>
				</tr>
				<tr>
					<td align="center" valign="middle">2</td>
					<td align="left" valign="middle">Tax paid including deduction
					at source of the last financial year</td>
					<td align="center" valign="middle"></td>
					<td align="center" valign="middle"></td>
				</tr>
				<tr>
					<td align="center" valign="middle">3</td>
					<td align="left" valign="middle">Accommodation expenses</td>
					<td align="center" valign="middle"></td>
					<td align="center" valign="middle"></td>
				</tr>
				<tr>
					<td align="center" valign="middle">4</td>
					<td align="left" valign="middle">Transport expenses</td>
					<td align="center" valign="middle"></td>
					<td align="center" valign="middle"></td>
				</tr>
				<tr>
					<td align="center" valign="middle">5</td>
					<td align="left" valign="middle">Electricity Bill for
					residence</td>
					<td align="center" valign="middle"></td>
					<td align="center" valign="middle"></td>
				</tr>
				<tr>
					<td align="center" valign="middle">6</td>
					<td align="left" valign="middle">Wasa Bill for residence</td>
					<td align="center" valign="middle"></td>
					<td align="center" valign="middle"></td>
				</tr>
				<tr>
					<td align="center" valign="middle">7</td>
					<td align="left" valign="middle">Gas Bill for residence</td>
					<td align="center" valign="middle"></td>
					<td align="center" valign="middle"></td>
				</tr>
				<tr>
					<td align="center" valign="middle">8</td>
					<td align="left" valign="middle">Telephone Bill for residence</td>
					<td align="center" valign="middle"></td>
					<td align="center" valign="middle"></td>
				</tr>
				<tr>
					<td align="center" valign="middle">9</td>
					<td align="left" valign="middle">Education expenses for
					children</td>
					<td align="center" valign="middle"></td>
					<td align="center" valign="middle"></td>
				</tr>
				<tr>
					<td align="center" valign="middle">10</td>
					<td align="left" valign="middle">Personal expenses for Foreign
					travel</td>
					<td align="center" valign="middle"></td>
					<td align="center" valign="middle"></td>
				</tr>
				<tr>
					<td align="center" valign="middle">11</td>
					<td align="left" valign="middle">Festival and other special
					expenses, if any</td>
					<td align="center" valign="middle"></td>
					<td align="center" valign="middle"></td>
				</tr>
				<tr>
					<td align="center" valign="middle">&nbsp;</td>
					<td align="left" valign="middle">Total Expenditure</td>
					<td align="center" valign="middle">0</td>
					<td align="center" valign="middle">&nbsp;</td>
				</tr>
			</table>
			</td>
		</tr>

		<tr>
			<td align="left" valign="top">&nbsp;</td>
		</tr>

		<tr>
			<td><br />

			<br />
			</td>
		</tr>
		<tr>
			<td align="left" valign="top">I solemnly declare that to the
			best of my knowledge and belief the information given in the IT-10BB
			is correct and complete.</td>
		</tr>
		<tr>
			<td align="right" valign="top">
			<table width="272" height="71" border="0" cellpadding="0"
				cellspacing="0">
				<tr>
					<td width="272" height="71" align="left" valign="bottom"><br />
					Name and signature of the Assessee<br />
					Date</td>
				</tr>
			</table>
			</td>
		</tr>
		<tr>
			<td align="left" valign="top"><strong><em>*If
			needed, please use separate sheet.</em></strong></td>
		</tr>
		<tr>
			<td height="126" align="center" valign="top">&nbsp;</td>
		</tr>
		<tr>
			<td align="center" valign="top"><img src="image/sizers.gif"
				border="0" />
			...................................................................................................................................................................................................</td>
		</tr>
		<tr>
			<td align="center" valign="top">&nbsp;</td>
		</tr>
	</tr>
	<tr>
		<td align="center" valign="top">&nbsp;</td>
	</tr>
	<tr>
		<td align="center" valign="top"><u><strong>Acknowledgement
		Receipt of Income Tax Return</strong></u></td>
	</tr>
	<tr>
		<td align="center" valign="top">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td width="54%" align="left" valign="middle"><strong>Name
				of the Assessee:</strong></td>
				<td width="46%" align="left" valign="middle">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td width="9%" align="left" valign="middle"><strong>TIN:
						</strong></td>
						<td width="91%" align="left" valign="middle"></td>
					</tr>
				</table>
				</td>
			</tr>
		</table>
		</td>
	</tr>
	<tr>
		<td align="center" valign="top">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td width="46%" align="left" valign="middle">UTIN/TIN:</td>
				<td width="25%" align="left" valign="middle">Circle:</td>
				<td width="29%" align="left" valign="middle">Taxes Zone:</td>
			</tr>
		</table>
		</td>
	</tr>
	<tr>
		<td align="center" valign="top">&nbsp;</td>
	</tr>

	<tr>
		<td align="center" valign="top">
		<div style="float: left;"><strong>7</strong></div>
		<div style="float: right;">&copy; iTax</div>
		</td>
	</tr>

	<tr>
		<td><br />

		<br />
		</td>
	</tr>
	<tr>
		<tr>
			<td><br />

			<br />
			</td>
		</tr>

		<tr>
			<td><br />

			<br />
			</td>
		</tr>
		<tr>
			<td><br />

			<br />
			</td>
		</tr>
		<td align="center" valign="top">&nbsp;</td>
	</tr>


	<tr>
		<td align="center" valign="top"><strong><u>Instructions
		to fill up the Return Form</u></strong></td>
	</tr>
	<tr>
		<td align="center" valign="top">&nbsp;</td>
	</tr>

	<tr>
		<td align="center" valign="top">
		<div
			style="width: 685px; border: 1px #000000 solid; padding: 5px; text-align: left;">
		<p><strong><u>Instructions:</u></strong></p>
		<ol>
			<li>This return of income shall be signed and verified by the
			individual assessee or person as prescribed u/s 75 of the Income Tax
			Ordinance, 1984.</li>
			<li><u>Enclose where applicable:</u></li>
			<ol>
				<li style="list-style: lower-alpha;">Salary statement for
				salary income; Bank statement for interest; Certificate for interest
				on savings instruments; Rent agreement, receipts of municipal tax
				and land revenue, statement of house property loan interest,
				insurance premium for house property income; Statement of
				professional income as per IT Rule-8; Copy of assessment/ income
				statement and balance sheet for partnership income; Documents of
				capital gain; Dividend warrant for dividend income; Statement of
				other income; Documents in support of investments in savings
				certificates, LIP, DPS, Zakat, stock/share etc.</li>
				<li style="list-style: lower-alpha;">Statement of income and
				expenditure; Manufacturing A/C, Trading and Profit & Loss A/C and
				Balance sheet;</li>
				<li style="list-style: lower-alpha;">Depreciation chart
				claiming depreciation as per THIRD SCHEDULE of the Income Tax
				Ordinance, 1984;</li>
				<li style="list-style: lower-alpha;">Computation of income
				according to Income tax Law;</li>
			</ol>

			<li><u>Enclose separate statement for:</u></li>
			<ol>
				<li style="list-style: lower-alpha;">Any income of the spouse
				of the assessee (if she/he is not an assessee), minor children and
				dependant;</li>
				<li style="list-style: lower-alpha;">Tax exempted / tax free
				income.</li>
			</ol>
			<li>Fulfillment of the conditions laid down in rule-38 is
			mandatory for submission of a return under "Self Assessment".</li>
			<li>Documents furnished to support the declaration should be
			signed by the assessee or his/her authorized representative.</li>
			<li>The assesse shall submit his/her photograph with return
			after every five year.</li>
			<li><u>Furnish the following information:</u></li>
			<ol>
				<li style="list-style: lower-alpha;">Name, address and TIN of
				the partners if the assessee is a firm;</li>
				<li style="list-style: lower-alpha;">Name of firm, address and
				TIN if the assessee is a partner;</li>
				<li style="list-style: lower-alpha;">Name of the company,
				address and TIN if the assessee is a director.</li>
			</ol>
			<li>Assets and liabilities of self, spouse (if she/he is not an
			assessee), minor children and dependant(s) to be shown in the IT-10B.</li>
			<li>Signature is mandatory for all the assessee or his/her
			authorized representative. For individual, signature is also
			mandatory in I.T-10B and I.T-10BB.</li>
			<li>If needed, please use separate sheet.</li>
		</ol>
		</div>
		</td>
	</tr>
	<tr>
		<td align="center" valign="top">&nbsp;</td>
	</tr>
	<tr>
		<td align="center" valign="top">&nbsp;</td>
	</tr>
	<tr>
		<td align="center" valign="top">&nbsp;</td>
	</tr>
	<tr>

	</tr>
	<tr>
		<td align="center" valign="top"><img src="image/sizers.gif"
			border="0" />
		...................................................................................................................................................................................................</td>
	</tr>

	<tr>
		<td align="center" valign="top">
		<table width="100%" border="0" cellpadding="4" cellspacing="0">
			<tr>
				<td align="left" valign="middle">Total income shown in Return:
				Tk. 0</td>
				<td align="left" valign="top">Tax paid:Tk. Below Taxable</td>
			</tr>
			<tr>
				<td align="left" valign="middle">Net Wealth of Assessee: Tk. 0</td>
				<td align="left" valign="top">&nbsp;</td>
			</tr>
			<tr>
				<td align="left" valign="middle">Date of receipt of return:</td>
				<td align="left" valign="top">Serial No. in return register</td>
			</tr>
			<tr>
				<td align="left" valign="middle">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td width="28%" align="left" valign="middle">Nature of Return
						:</td>
						<td width="72%" align="left" valign="middle">
						<table border="0" cellpadding="0" cellspacing="4"
							style="width: 300px; height: 30px;">
							<tr>
								<td
									style="border: 1px #000000 solid; width: 28%; text-align: center; vertical-align: middle;"><strong>Self</strong></td>
								<td
									style="border: 1px #000000 solid; width: 41%; text-align: center; vertical-align: middle;"><strong>Universal
								Self</strong></td>
								<td
									style="border: 1px #000000 solid; width: 31%; text-align: center; vertical-align: middle;"><strong>Normal</strong></td>
							</tr>
						</table>
						</td>
					</tr>
				</table>
				</td>
				<td align="left" valign="top">&nbsp;</td>
			</tr>
			<tr>
				<td width="59%" align="left" valign="middle">&nbsp;</td>
				<td width="41%" align="right" valign="top">Signature of
				Receiving<br />
				officer with seal</td>
			</tr>

		</table>
		</td>
	</tr>
	<tr>
		<td align="center" valign="top">Thank you for using this
		software. &copy; 2010 iTax</td>
	</tr>
	<tr>
		<td align="center" valign="top">
		<div style="float: left;"><strong>8</strong></div>
		<div style="float: right;">&copy; iTax</div>
		</td>
	</tr>

	<tr>
		<td><br />
		<br />
		<br />
		<br />
		</td>
	</tr>

</table>
</div>


</form>

</body>
</html>