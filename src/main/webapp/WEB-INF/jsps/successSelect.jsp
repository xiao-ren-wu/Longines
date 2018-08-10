<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>查询地址列表</title>
</head>
<body>
    地址列表:
    <table width="100%" border=1>

        <tr>
            <td>收货人</td>
            <td>收货地址</td>
            <td>联系方式</td>
        </tr>
        <c:forEach items="${recListed}" var="recode">
            <tr>
                <td>${recode.consignee}</td>
                <td>${recode.sAdd}</td>
                <td>${recode.cTel}</td>
                <td>
                    <a href="${pageContext.request.contextPath }/rec/recEdit?aid1=${recode.aId}&uid1=${recode.uId}">修改</a>
                    <a href="${pageContext.request.contextPath }/rec/deleteByID?aid1=${recode.aId}&uid1=${recode.uId}">删除</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <a href="${pageContext.request.contextPath }/rec/recInsert1?uid1=${recListed.get(0).uId}">
        <button>添加地址</button>
    </a>
</body>

</html>