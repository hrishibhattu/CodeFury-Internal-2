<%@page import="com.toyodo.service.impl.EmployeeServiceImpl"%>
<%@page import="com.toyodo.service.EmployeeService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page
	import="java.util.*, java.io.*,java.text.*, java.sql.Timestamp, com.toyodo.utils.*, com.toyodo.notification.*,com.toyodo.model.Employee"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>

<link href="/ToYoDo/CSS/layout.css" rel="stylesheet" type="text/css"
	media="all" />
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Open+Sans:400,400i,700">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.4.1/css/all.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<body>

	<%
	HttpSession httpSession = request.getSession(false);
	String employeeID = (String) httpSession.getAttribute("loginID");
	System.out.println(employeeID);
	if (employeeID == null || httpSession.isNew()) {
		RequestDispatcher rd = request.getRequestDispatcher("/JSP/index.jsp");
		request.setAttribute("unauthorised_msg", Notify.UNAUTHORISED);
		rd.forward(request, response);
	}
	%>




	<div id="header">
		<%@include file="/WEB-INF/nav/dashboardNav.html"%>
	</div>
	<div id="sidebar-left">
		<%
		EmployeeService employeeService = new EmployeeServiceImpl();
		%>
		<%@include file="/WEB-INF/nav/sidebarNav.html"%>
		<%@include file="/WEB-INF/modal/quote.jsp"%>
	</div>

	<div id="main">
		<div id="detailsDisplay">
			<%
			EmployeeServiceImpl eservice = new EmployeeServiceImpl();
			Date now = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date currentAccess = new Date(httpSession.getLastAccessedTime());
			String lastAccess = eservice.getLastAccessTime(employeeID, formatter.format(currentAccess));
			%>
			<div id="details">
				<center>
					<h1>Employee Details</h1>
					<br>
					<table class="container">
						<thead>
							<tr>
								<th>Employee Id</th>
								<td><%=employeeID%></td>
							</tr>
							<tr>
								<th>Employee Name</th>
								<td><%=eservice.getEmployeeName(employeeID)%></td>
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
	<div id="footer">
		Copyright &copy; 2021 ToYoDo <br /> All rights reserved. Powered by
		JAVATAR
	</div>
</body>
</html>