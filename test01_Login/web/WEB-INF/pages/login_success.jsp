<%--
  Created by IntelliJ IDEA.
  User: 泽儿_
  Date: 2022/8/2
  Time: 16:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录成功</title>
</head>
<body>
    <h3>登录成功</h3><br>
<h4>您好，${sessionScope.username}!</h4><br>
    <form action="person" method="post">
        <input type="hidden" name="username" value=${sessionScope.username}>
        <input type="submit" value="查看用户信息">
    </form>
</body>
</html>
