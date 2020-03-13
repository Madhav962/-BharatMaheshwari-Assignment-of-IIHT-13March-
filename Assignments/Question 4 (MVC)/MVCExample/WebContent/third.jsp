<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
response.setIntHeader("Refresh", 3);
%>
<h1>From third.jsp</h1>
<jsp:useBean id="ref" class="com.js.bean.LoginBean" scope="session"></jsp:useBean>
<jsp:getProperty property="userName" name="ref"/>
<jsp:getProperty property="password" name="ref"/>
</body>
</html>