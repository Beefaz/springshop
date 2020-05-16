<%--
  Created by IntelliJ IDEA.
  User: SOLO
  Date: 5/14/2020
  Time: 11:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="addUser">
    <Label for="username_field">Vartotojo vardas</Label><br>
    <input type="text" id="username_field" name="userName"><br>

    <Label for="password_field">Slaptažodis</Label><br>
    <input type="text" id="password_field" name="userPassword"><br>

    <Label for="email_field">El. paštas</Label><br>
    <input type="text" id="email_field" name="userEmail"><br>
    <input type="submit"><br>
</form>
</body>
</html>
