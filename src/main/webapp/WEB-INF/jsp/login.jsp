<%--
  Created by IntelliJ IDEA.
  User: wll
  Date: 2020/1/12
  Time: 16:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>登录页</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/login.action" method="post">
    <input type="text" name="username" value=""/>
    <input type="submit" value="登录">
</form>
</body>
</html>
