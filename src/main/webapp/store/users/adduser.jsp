<%@ page contentType="text/html;charset=UTF-8" %>

<form action="users/adduser">
    <div class="jumbotron d-flex">
        <div class="d-flex flex-row" style="margin-right:20px">
            <button type="submit" class="btn btn-info">Create</button>
        </div>
        <div class="d-flex flex-row flex-wrap justify-content-start" style="flex-grow:1">
            <div class="d-flex flex-column" style="margin-right:10px">
                <label for="user_name">User name</label><input type="text" id="user_name"
                                                               name="userName">
            </div>
            <div class="d-flex flex-column" style="margin-right:10px">
                <label for="user_password">User password</label><input type="text" id="user_password"
                                                                       name="userPassword">
            </div>
            <div class="d-flex flex-column" style="margin-right:10px">
                <label for="user_email">Email</label><input type="text" id="user_email"
                                                            name="userEmail">
            </div>
        </div>
    </div>
</form>
<br>
