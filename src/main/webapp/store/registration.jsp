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
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

    <title>Registration</title>
</head>
<body>
<div class="jumbotron">
    <h1>Registration</h1>
    <jsp:include page="/store/components/loginRegisterNavbar.jsp"></jsp:include>
</div>
<div class="jumbotron">
    <form action="users/adduser">
        <div class="container">
            <Label for="username_field">Username</Label><br>
            <input type="text" id="username_field" name="userName"><br><br>

            <Label for="password_field">Password</Label><br>
            <input type="text" id="password_field" name="userPassword"><br><br>

            <Label for="email_field">E-mail</Label><br>
            <input type="text" id="email_field" name="userEmail"><br><br>

            <Label for="login_button"></Label><br>
            <input type="submit" class="btn btn-info" id="login_button" value="Sign up"><br><br>
        </div>
    </form>
</div>
</body>
</body>
</html>


