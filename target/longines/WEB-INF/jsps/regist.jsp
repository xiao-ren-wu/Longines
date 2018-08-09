
<%-- Created by IntelliJ IDEA.
  User: zxk
  Date: 2018/8/4
  Time: 16:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册用户</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/longines/register" enctype="multipart/form-data" method="post">
   姓名<input type="text" name="uname"><br>
   密码<input type="text" name="pw"><br>
    性别<input type="text" name="sex"><br>
    图像<input type="file" name="image"><br>
  电话<input type="text" name="telNum"><br>
      <input type="submit" value="注册">
</form>
</body>
</html>
