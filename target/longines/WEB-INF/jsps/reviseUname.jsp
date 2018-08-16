<%--
  Created by IntelliJ IDEA.
  User: zxk
  Date: 2018/8/9
  Time: 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改昵称</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/longines/update">
    <input type="text" name="label" value="${tbusr.uname}"><a href="${pageContext.request.contextPath }/longines/update?uId=${tbuser.uId}">修改</a>

</form>
</body>
</html>
