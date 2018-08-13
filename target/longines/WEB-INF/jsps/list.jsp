<%--
  Created by IntelliJ IDEA.
  User: ly
  Date: 2018/8/11
  Time: 1:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Successful!</h1>
    <table border="1">
        <tr>
            <td>用户ID</td>
            <td>商品ID</td>
            <td>商品数量</td>
            <td>总金额</td>
            <td>状态号</td>
            <td>操作</td>
        </tr>
    </table>
    <c:forEach items="ShcList" var="shc">
        <td>${shc.uId}</td>
        <td>${shc.gId}</td>
        <td>${shc.gNum}</td>
        <td>${shc.gAmount}</td>
        <td>${shc.status}</td>
        <td>
            <a href="${pageContext.request.contextPath }/longines/receiveInt?id=${shc.uId}>修改</a>
        </td>
    </c:forEach>
</body>
</html>
