<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<c:set var="picPath" value="http://127.0.0.1:8003/ssmImage19"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Conl,lktent-Type" content="text/html; charset=UTF-8">
    <title>查询商品列表</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/TbGoods/sTimeAsc" method="post">
    查询条件：
    <table width="100%" border=1>
        <tr>
            <td><input type="text" name="theme" id="theme"></td>
            <td><input type="submit" value="查询"/></td>
        </tr>
    </table>
    商品列表：
    <table width="100%" border=1>
        <tr>
            <td>ID</td>
            <td>商品名称</td>
            <td>商品品牌</td>
            <td>商品价格</td>
            <td>主题</td>
            <td>商品图片</td>
            <td>商家id</td>
            <td>商家头像</td>
        </tr>
        <c:forEach items="${tbGoodsInfoExtList }" var="tbGoodsInfo">
            <tr>
                <td>${tbGoodsInfo.gId}</td>
                <td>${tbGoodsInfo.gname }</td>
                <td>${tbGoodsInfo.brand}</td>
                <td>${tbGoodsInfo.price }</td>
                <td>${tbGoodsInfo.theme }</td>
                <td>${tbGoodsInfo.gPic}</td>
                <td>${tbGoodsInfo.mId}</td>
                <td>${tbGoodsInfo.mPic}</td>
            </tr>
        </c:forEach>

    </table>
</form>
</body>

</html>