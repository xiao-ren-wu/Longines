<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<c:set var="picPath" value="http://127.0.0.1:8003/ssmImage19"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>购物车</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/longines/list" method="post">
    根据用户ID查找：
    <input type="text" name="uId" value="${uId}"/>
    <input type="submit" value="提交"/>
</form>
    购物车列表：
    <table width="100%" border=1>
        <tr>
            <td>用户ID</td>
            <td>商品ID</td>
            <td>商品数量</td>
            <td>总金额</td>
        </tr>
        <c:forEach items="${list}" var="item">
            <tr>
                <td>
                    <input type="checkbox" name="uId" value="${TbShoppingCart.gId}">
                </td>
                <%--<td>${item.name }</td>
                <td>${item.price }</td>
                <td><fmt:formatDate value="${item.createtime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
                <td>${item.detail }</td>

                <td><a href="${pageContext.request.contextPath }/items/edit.do?id=${item.id}">修改</a>
                    <a href="${pageContext.request.contextPath }/items/deleteByID.do?id=${item.id}">删除</a>
                </td>--%>

            </tr>
        </c:forEach>
    </table>

    <form id="its" action="${pageContext.request.contextPath }/longines/tbShoppingCartDelete" method="post">
    <table>
        <tr>
            <td>uId</td><td>gId</td>
        </tr>
        <tr>
            <td> <input type="text" name="uId" value="${uId}"/></td>
            <td> <input type="text" name="gId" value="${gId}"/></td>
            <td>  <input type="submit" value="提交"/></td>
        </tr>
    </table>
    </form>

</body>

</html>