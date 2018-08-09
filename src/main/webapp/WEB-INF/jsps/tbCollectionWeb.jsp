<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<c:set var="picPath" value="http://127.0.0.1:8003/ssmImage19"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>查询商品列表</title>
</head>
<body>

<form action="${pageContext.request.contextPath }/longines/tbCollectionWeb" method="post">
    商品列表：
    <table width="100%" border=1>
        <c:forEach items="${tbCollectionList}" var="tbCollection" varStatus="loop">
            <tr>
                <td>${tbCollection.uId}</td>
                <td>${tbCollection.gId}</td>
                <c:if test="${tbCollection.invalid==1}"><td></td></c:if>
                <c:if test="${tbCollection.invalid==0}"><td>已失效</td></c:if>
                <td>${tbCollection.pur}</td>
                <td>${tbCollection.collTime}</td>
                <td>${tbCollection.cPrice}</td>
                <td>${tbCollectionPic[loop.count-1]}</td>
                <td><a href="${pageContext.request.contextPath }/longines/tbCollection">返回</a></td>
                <td><a href="${pageContext.request.contextPath }/longines/tbCollectionDelete?uId=${tbCollection.uId}&gId=${tbCollection.gId}">删除</a></td>
            </tr>
        </c:forEach>
    </table>
</form>

</body>

</html>
