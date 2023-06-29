
<%@page import="org.springframework.ui.Model"%>
<%@page import="com.ripplestreet.usermvc.dto.User"%>
<%@page import="java.util.List"%>

<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Details are</h1>
	<%
		List<User> userList = (List<User>) request.getAttribute("list");
	%>
	<table>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Age</th>
			<th>Phone</th>

		</tr>
		<%
		for (User u : userList) {
		%>
		<tr>
			<td><%=u.getId()%></td>
			<td><%=u.getName()%></td>
			<td><%=u.getAge()%></td>
			<td><%=u.getPhone()%></td>

		</tr>
		<%
		}
		%>
	
</body>
</html>