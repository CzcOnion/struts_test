<%--
  Created by IntelliJ IDEA.
  User: 90676
  Date: 2019/4/6
  Time: 21:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>等待页面</title>
    <meta http-equiv="refresh" content="3;url=<s:url includeParams="all"/>"/>
</head>
<body>
    正在登录，请稍后...(<s:property value="complete"/>)%<br/>
    如果页面没有跳转，请<a href="<s:url includeParams="all"/>">单击这里...</a>
</body>
</html>
