<%@ page import="com.longines.pojo.TbUser" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户信息</title>
</head>
<body>
<%
    TbUser user= (TbUser) session.getAttribute("tbuser");
    System.out.println(user);
%>
<center>
    <form >

        图像<input type="text" name="pic" value=user.getPic()><a href="${pageContext.request.contextPath }/longines/revise?uId=${tbuser.uId}">修改</a><br>
        用户ID<input type="text" name="uId" value=user.getuId()>
        昵称<input type="text" name="uname" value=user.getUname()><a href="${pageContext.request.contextPath }/longines/reviseUname?uId=${tbuser.uId}">修改</a><br>
        电话号码<input type="text" name="telNum" value=user.getTelNum()><a href="${pageContext.request.contextPath }/longines/reviseTelNum?uId=${tbuser.uId}">修改</a><br>
        个性标签<input type="text" name="label" value=user.getLabel()><a href="${pageContext.request.contextPath }/longines/reviseLabel?uId=${tbuser.uId}">修改</a><br>

    </form>

</center>
</body>
</html>
