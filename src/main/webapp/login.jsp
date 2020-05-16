<%--
  Created by IntelliJ IDEA.
  User: SOLO
  Date: 5/15/2020
  Time: 2:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form action="login/">
    <Label for="username_field">Vartotojo vardas</Label><br>
    <input type="text" id="username_field" name="userName"><br>

    <Label for="password_field">Slaptažodis</Label><br>
    <input type="text" id="password_field" name="userPassword"><br><br>

    <input type="submit" id="login_button"><br>
    <Label for="login_button"></Label><br>
</form>
</body>
</html>
