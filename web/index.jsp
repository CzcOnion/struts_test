<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: 90676
  Date: 2019/4/6
  Time: 12:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>用户登录</title>
</head>
<body>

<%--<form action="Login.action" method="post">--%>
  <%--<table>--%>
    <%--<tr>--%>
      <%--<td>用户名：</td>--%>
      <%--<td><input type="text" name="user.username"></td>--%>
    <%--</tr>--%>
    <%--<tr>--%>
      <%--<td>密码：</td>--%>
      <%--<td><input type="password" name="user.password"></td>--%>
    <%--</tr>--%>
    <%--<tr>--%>
      <%--<td>生日：</td>--%>
      <%--<td><input type="text" name="user.birthday"></td>--%>
    <%--</tr>--%>
    <%--<tr>--%>
        <%--<img src="Security/SecurityCodeImageAction" id="Verify"  style="cursor:hand;" alt="看不清，换一张"/>--%>
        <%--<input type="text" name="securityCode"/>--%>
    <%--</tr>--%>
    <%--<tr>--%>
      <%--<td colspan="2" style="text-align: center"><input type="submit" value="登录"></td>--%>
    <%--</tr>--%>
  <%--</table>--%>
<%--</form>--%>
<s:text name="check"></s:text>:
<a href="check.action?request_locale=zh_CN"><s:text name="chinese"/></a>
<a href="check.action?request_locale=en_US"><s:text name="english"/></a>
<s:form action="Login" method="POST">
    <s:token></s:token>
    <s:textfield name="user.username" key="username"/>
    <s:password name="user.password"  key="password"/>
    <s:textfield name="user.birthday" key="birthday"/>
    <s:textfield name="securityCode"/>
    <s:label><img src="Security/SecurityCodeImageAction" id="Verify"  style="cursor:hand;" alt="看不清，换一张"/></s:label>
    <s:submit key="submit"/>
</s:form>
<script>
    window.onload=function(){
        var verifyObj = document.getElementById("Verify");
        verifyObj.onclick=function(){
            this.src="SecurityCodeImageAction?timestamp="+new Date().getTime();
        };
    }
</script>
</body>
</html>