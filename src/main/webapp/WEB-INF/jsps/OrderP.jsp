<%--
  Created by IntelliJ IDEA.
  User: leijing
  Date: 2018/8/7
  Time: 19:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>OrderP</title>
</head>
<body>
<form action=" ${pageContext.request.contextPath }/Longines/OrderPay" method="post">
      ID:<input type="text" name = "oid" >
    <input type="submit" value = "提交">
</form>
<form action ="${pageContext.request.contextPath}/Longines/OrderPay" method="post"><
    用户id:<input type = "text" name = "userid" value="${uId}" id="userid">
    用户pic:<input type = "text" name = "userpic" value="${Pic}" id="userpic">
    订单余额:<input type = "text" name = "orderaAmout" value="${aAmount}" id="orderaAmount">
</form>
<td><a href="${pageContext.request.contextPath}/Longines/IS">支付</a></td>

</body>
</html>
