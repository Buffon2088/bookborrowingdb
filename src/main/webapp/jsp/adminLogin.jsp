<%--
  Created by IntelliJ IDEA.
  User: 11848
  Date: 2022/11/8
  Time: 9:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/admin/adminLogin">
    <input type="text" name="adminLoginName" placeholder="请输入登录名称"><br>
    <input type="password" name="adminLoginPwd" placeholder="请输入密码"><br>
    <input type="submit" value="login">
</form>
</body>
</html>
