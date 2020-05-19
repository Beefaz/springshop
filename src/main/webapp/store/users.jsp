<%--
  Created by IntelliJ IDEA.
  User: SOLO
  Date: 5/15/2020
  Time: 4:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

    <title>Users</title>
</head>
<body>

<div class="jumbotron">
    <h2>Products</h2>
    <jsp:include page="components/navbar.jsp"></jsp:include>
</div>

<div class="container-fluid" style="display:none" id="hide_and_show">
    <jsp:include page="users/adduser.jsp"></jsp:include>
</div>
<div class="container">
    <button type="button" class="btn btn-info" onclick="hideAndShow()">Add new user</button>
    <table class="table table-hover">
        <tr>
            <th>User ID</th>
            <th>User name</th>
            <th>User Email</th>
        </tr>
        <c:forEach items="${ListOfUsers}" var="users">
            <tr>
                <td>${users.userId}</td>
                <td>${users.userName}</td>
                <td>${users.userEmail}</td>
            </tr>
        </c:forEach>
    </table>
</div>
<script>
    function hideAndShow() {
        var x = document.getElementById("hide_and_show");
        if (x.style.display === "none") {
            x.style.display = "block";
        } else {
            x.style.display = "none";
        }
    }
</script>
</body>