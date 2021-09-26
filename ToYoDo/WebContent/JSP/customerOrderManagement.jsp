<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.toyodo.service.impl.CustomerServiceImpl"%>
<%@page
	import="java.util.*, com.toyodo.utils.*,java.text.*, java.sql.Timestamp, com.toyodo.notification.*,com.toyodo.model.Customer"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order Management Dashboard</title>

<link href="/ToYoDo/CSS/layout.css" rel="stylesheet" type="text/css"
	media="all" />
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Open+Sans:400,400i,700">
</head>
<body>
	<%
	HttpSession httpSession = request.getSession(false);
	String customerID = (String) httpSession.getAttribute("loginID");
	System.out.println(customerID);
	if (customerID == null || httpSession.isNew()) {
		RequestDispatcher rd = request.getRequestDispatcher("/ToYoDo/JSP/index.jsp");
		request.setAttribute("unauthorised_msg", Notify.UNAUTHORISED);
		rd.forward(request, response);
	}
	%>



	<div id="header">
		<h1>
			Order Management Dashboard
			<%=customerID%></h1>
	</div>
	<div id="sidebar-left">Left</div>
	<div id="main">
		<div id="detailsDisplay">
			<%
			CustomerServiceImpl cservice = new CustomerServiceImpl();
			Date now = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date currentAccess = new Date(httpSession.getLastAccessedTime());
			String lastAccess = cservice.getLastAccessTime(customerID, formatter.format(currentAccess));
			%>
			<div id="details">
				<center>
					<h1>Employee Details</h1>
					<br>
					<table class="container">
						<thead>
							<tr>
								<th>Customer Id</th>
								<td><%=customerID%></td>
							</tr>
							<tr>
								<th>Customer Name</th>
								<td><%=cservice.getCustomerName(customerID)%></td>
							</tr>
							<tr>
								<th>Current Access</th>
								<td><%=formatter.format(currentAccess)%></td>
							</tr>
							<tr>
								<th>Last Accessed</th>
								<td><%=lastAccess%></td>
							</tr>
							<tr>
						</thead>
					</table>
				</center>
			</div>

		</div>
	</div>
	<div id="footer">Footer</div>

</body>
</html>