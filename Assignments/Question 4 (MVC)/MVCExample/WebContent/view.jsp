<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>From view.jsp Page</h1>

<jsp:useBean id="ref" class="com.js.bean.LoginBean" scope="session"></jsp:useBean>
<jsp:getProperty property="userName" name="ref"/>
<jsp:getProperty property="password" name="ref"/>
<a href="Logout.jsp">Logout</a>
</body>
</html>