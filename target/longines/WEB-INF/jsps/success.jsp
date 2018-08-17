<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/10
  Time: 23:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table width="100%" border="2">
    <tr>
        <td>订单ID</td><td>用户ID</td><td>地址ID</td><td>创建时间</td><td>发货时间</td><td>收货日期</td><td>总金额</td><td>运费</td><td>状态号</td><td>配送方式</td>
    </tr>
    <c:forEach items="${snumList}" var="list">
        <tr>
            <td>${list.oId }</td> <td>${list.uId }</td> <td>${list.aId }</td> <td>${list.creDate }</td> <td>${list.delDate }</td>
            <td>${list.tbDate }</td> <td>${list.aAmount }</td> <td>${list.freight }</td> <td>${list.sNum }</td> <td>${list.dMethod }</td>
        </tr>
    </c:forEach>
</table></body>
</html>
