<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="script.js"></script>
<link rel="stylesheet" href="./css/style.css">
<link rel="shortcut icon" href="./css/icon.png">
<title>Login</title>
</head>
<body>
<h1>Cadastro de Disciplinas</h1>
<form action="ServletAutentica" method="post" id="login">
	<label id="name_in">USUARIO:</label>
	<input type="text" onkeyup="verificaLetra(this.value)" name="usuario">
	<br>
	
	<label id="password_in">SENHA:</label>
	<input type="password" name="senha">
	<br><br>
	
	<input type="submit" value="Enviar">
</form>
</body>
</html>