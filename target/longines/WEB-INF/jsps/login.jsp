<%--
  Created by IntelliJ IDEA.
  User: zxk
  Date: 2018/8/4
  Time: 15:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>
  <form action="${pageContext.request.contextPath }/longines/login",method=post>
    手机号码<input type="text" name="telNum"><br>
      密码<input type="text" name="pw"><br>
      <input type="submit" value="登录">
 </form>
</body>
</html>
