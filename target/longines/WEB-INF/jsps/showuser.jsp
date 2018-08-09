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
    <form <%--action="${pageContext.request.contextPath }/longines/revise"--%>>
    <%--  用户id<input type="text" name="uId" value="${tbuser.uId}"><a href="">修改<a/><br>--%>
        图像<input type="text" name="pic" value="${tbuser.pic}"><a href="${pageContext.request.contextPath }/longines/revise?uId=${tbuser.uId}">修改</a><br>
        用户ID<input type="text" name="uId" value="${tbuser.uId}"><a href="${pageContext.request.contextPath }/longines/revise?uId=${tbuser.uId}">修改</a><br>
        昵称<input type="text" name="uname" value="${tbuser.uname}"><a href="${pageContext.request.contextPath }/longines/revise?uId=${tbuser.uId}">修改</a><br>
        电话号码<input type="text" name="telNum" value="${tbuser.telNum}"><a href="${pageContext.request.contextPath }/longines/revise?uId=${tbuser.uId}">修改</a><br>
        个性标签<input type="text" name="label" value="${tbuser.label}"><a href="${pageContext.request.contextPath }/longines/revise?uId=${tbuser.uId}">修改</a><br>



    </form>

</center>
</body>
</html>
