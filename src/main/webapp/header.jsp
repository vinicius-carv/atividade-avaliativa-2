<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Header</title>
<link rel="stylesheet" href="./css/header.css">
<style>
.header{
	list-style-type: none;
	display: flex;
	flex-direction: row;
	justify-content: space-between;
}
</style>
</head>
<body>
<%
String usuario = (String)session.getAttribute("usuario");
SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
%>
<div class="header">
<li>Seja bem-vindo, <% out.print(usuario);%>.</li>
<li><%= data.format(new Date()) %></li>
</div>
</body>
</html>