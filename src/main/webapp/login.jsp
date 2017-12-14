<%--
  Created by IntelliJ IDEA.
  User: Aron
  Date: 17-12-14
  Time: 10:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<div class="login-page">
    <div class="form">
        <form class="register-form">
            <input type="text" placeholder="name"/>
            <input type="password" placeholder="password"/>
            <input type="text" placeholder="email address"/>
            <button>create</button>
            <p class="message">Already registered? <a href="#">Sign In</a></p>
        </form>
        <form class="login-form" action="login.action" method="POST" namespace="/">
            <label for="userName">Username</label>
            <br/>
            <input type="text" name="userName" id="username" placeholder="请输入用户名"/>
            <br/>
            <label for="password">password</label>
            <br/>
            <input type="password" name="password" id="password" placeholder="请输入密码"/>
            <br/>
            <button>login</button>
            <p class="message">Not registered? <a href="#">Create an account</a></p>
        </form>
    </div>
</div>
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script src="js/login.js"></script>
</body>
</html>
