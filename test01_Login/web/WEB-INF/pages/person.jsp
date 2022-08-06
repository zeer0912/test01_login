<%--
  Created by IntelliJ IDEA.
  User: 泽儿_
  Date: 2022/8/2
  Time: 21:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户信息</title>
</head>
<body>
<h3>用户信息</h3><br>
<h4>用户名：${sessionScope.username}</h4><br>
<h4>学号：${requestScope.user.studentID}</h4><br>


</body>
</html>
