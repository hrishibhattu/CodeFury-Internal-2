<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page
	import="java.util.*, com.toyodo.utils.*, com.toyodo.notification.*,com.toyodo.model.Customer"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order Management Dashboard</title>

<link href="/ToYoDo/CSS/layout.css" rel="stylesheet" type="text/css"
	media="all" />
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
	<div id="main">Main</div>
	<div id="footer">Footer</div>

</body>
</html>