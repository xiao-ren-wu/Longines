<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>添加地址</title>

</head>
<body>
<form id="itemForm" action="${pageContext.request.contextPath }/rec/insertRec" method="post">
    <input type="hidden" name="uid1" id="uid1" value="${recode.uId }"/>
    添加地址
    <table width="100%" border=1>
        <tr>
            <td>收货人</td>
            <td><input type="text" name="con1" id="con1" value="${recode.consignee}"/></td>
        </tr>
        <tr>
            <td>收货地址</td>
            <td><input type="text" name="add1" id="add1" value="${recode.sAdd}"/></td>
        </tr>
        <tr>
            <td>联系方式</td>
            <td><input type="text" name="tel1" id="tel1" value="${recode.cTel}"/></td>
        </tr>
        <tr>
            <td>邮编</td>
            <td><input type="text" name="pos1" id="pos1" value="${recode.postcode}"/></td>
        </tr>
        <tr>
            <td>省</td>
            <td><input type="text" name="pro1" id="pro1" value="${recode.province}"/></td>
        </tr>
        <tr>
            <td>市</td>
            <td><input type="text" name="city1" id="city1" value="${recode.city}"/></td>
        </tr>
        <tr>
            <td>区</td>
            <td><input type="text" name="dis1" id="dis1" value="${recode.district}"/></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="提交"/>
            </td>
        </tr>
    </table>
</form>
</body>

</html>