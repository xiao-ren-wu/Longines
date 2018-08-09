<%--
  Created by IntelliJ IDEA.
  User: zxk
  Date: 2018/8/4
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户信息</title>
</head>
<body>
<center>
    <form action="${pageContext.request.contextPath }/longines/revise">
      用户id<input type="text" name="uId" value="${tbuser.uId}"><br>
        性别<input type="text" name="sex" value="${tbuser.sex}"><br>
        姓名<input type="text" name="uname" value="${tbuser.uname}"><br>
    个性标签<input type="text" name="label" value="${tbuser.label}"><br>
    密码<input type="text" name="pw" value="${tbuser.pw}"><br>
    电话号码<input type="text" name="telNum" value="${tbuser.telNum}"><br>
    图像<input type="text" name="pic" value="${tbuser.pic}"><br>
        <input type="submit" value="修改">
    </form>


</center>
</body>
</html>
