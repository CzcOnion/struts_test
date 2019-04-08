<%--
  Created by IntelliJ IDEA.
  User: 90676
  Date: 2019/4/6
  Time: 12:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>登录成功</title>
</head>
<body>
<h1>登录成功！</h1>
<br>欢迎<s:property value="user.username"/>
<br>生日为<s:property value="user.birthday.toString()"/>
</body>
</html>
