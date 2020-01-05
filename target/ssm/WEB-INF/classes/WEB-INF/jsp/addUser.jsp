<%--
  Created by IntelliJ IDEA.
  User: wll
  Date: 2019/12/29
  Time: 17:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/item/saveUser.action" method="post">

<p><input type="test" name="username" placeholder="请输入用户名。。。" autofocus="autofocus"/></p>

<p><input type="test" name="age" placeholder="请输入年龄。。。"/></p>

<p><input type="test" name="phone" placeholder="请输入电话。。。"/></p>

<p>省份：

    <select>

        <option
         value="000001">北京市</option>

        <option
         value="000002">天津市</option>

        <option
         value="000003">上海市</option>

    </select>

</p>

<p>爱好：

    <label><input type="checkbox" name="intesters" value="1"/>爬山</label>

    <label><input type="checkbox" name="intesters" value="2"/>旅游</label>

    <label><input type="checkbox" name="intesters" value="3"/>打球</label>

</p>

<p>性别：

    <label><input type="radio" name="sex" value="1"/>男</label>

    <label><input type="radio" name="sex" value="2"/>女</label>

    <label><input type="radio" name="sex" value="3"/>保密</label>

</p>

<p><input type="submit" value="提交"/></p>

</form>

</body>
</html>
