<%--
  Created by IntelliJ IDEA.
  User: captain_rkr
  Date: 6/5/2019
  Time: 8:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>High Radius- New user</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>
    <div class="container jumbotron" style="margin: 80px">
        <center>
            <h1>Welcome to High Radius!</h1><br>
            <h4>Please register yourself...</h4>
        </center>

        <form action="register" method="post">
            <div class="form-group">
                <label for="name">Full Name</label>
                <input type="text" class="form-control" id="name" name="name" placeholder="Full Name">
            </div>
            <div class="form-group">
                <label for="email">Email address</label>
                <input type="email" class="form-control" name="email" id="email" placeholder="xyz@example.com">
            </div>
            <div class="form-group">
                <label for="password-label">Password</label>
                <input type="password" class="form-control" name="password" id="password-label" placeholder="password">
            </div>
            <div class="form-group">
                <label for="gender-label">Gender</label>
               <div class="col col-2" id="gender-label">
                   <input type="radio" name="gender" value="Male">Male&nbsp;
                   <input type="radio" name="gender" value="Female">Female
               </div>
            </div>

            <div class="form-group">
                <label for="exampleFormControlTextarea1">Address</label>
                <textarea class="form-control" name="address" id="exampleFormControlTextarea1" rows="3"></textarea>
            </div>

            <button class="btn btn-primary" type="submit" value="Register" name="register">Register</button>
        </form>

        <center>Already a user then click <h5><a href="login.jsp">Login</a></h5></center>
    </div>

    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>
