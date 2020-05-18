<%--
  Created by IntelliJ IDEA.
  User: SOLO
  Date: 5/15/2020
  Time: 3:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
</head>
<body>
<div class="jumbotron">
    <h2>Users</h2>
    <jsp:include page="components/navbar.jsp"></jsp:include>
</div>
<form action="login">
    <label for="login_button">Sign In</label><br>
    <input id="login_button" type="submit"><br>
</form>

<form action="registration">
    <label for="register_button">Register</label><br>
    <input id="register_button" type="submit"><br>
</form>

</body>
</html>
