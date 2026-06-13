<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*" %>
<%
    List<String> list = Arrays.asList("Java", "Python", "PHP");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Languages</h2>

<%
    for(String s : list) {
%>
        <p><%= s %></p>
<%
    }
%>

<p>Server Name: <%= request.getServerName() %></p>

</body>
</html>