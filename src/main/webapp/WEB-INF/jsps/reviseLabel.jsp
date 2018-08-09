<%--
  Created by IntelliJ IDEA.
  User: zxk
  Date: 2018/8/9
  Time: 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改个性标签</title>
</head>
<body>


<form action="${pageContext.request.contextPath }/longines/update">
    <input type="hidden" name="uId" value="${tbuser.uId }"/>
    <input type="text" name="label" value="${tbuser.label}">
    <input type="submit" value="修改">
</form>

</body>
</html>
