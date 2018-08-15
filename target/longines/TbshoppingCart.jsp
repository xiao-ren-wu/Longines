<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Select Single User</title>
</head>
<body>
购物车:
    <form action="${pageContext.request.contextPath }/longines/tbShoppingCartInsert" method="post">
        <input type="text" placeholder="Please input Info" name="uId" >
        <input type="submit" value="Add">
    </form>

    <form action="${pageContext.request.contextPath }/longines/tbShoppingCartDelete" method="post">
        <input type="text" placeholder="Please input PK" name="gId" >
        <input type="submit" value="Delete">
    </form>

 <%--   <form action="${pageContext.request.contextPath }/longines/receiveInt" method="post">
    <input type="text" name="uId"  id="uId">
    <input type="submit" value="tijiao">
    </form>--%>

    <hr size="12" color="blue">
    <form action="${pageContext.request.contextPath }/longines/receiveInt">
        ID:<input type="checkbox" name="ids"  value="1" >
        ID:<input type="checkbox" name="ids"  value="2" >
        ID:<input type="checkbox" name="ids"  value="3" >
    <input type="submit" value="submit">
    </form>

    <form action="${pageContext.request.contextPath }/longines/TbShoppingCartHomePage" method="post">
        <input type="submit" value="hello">
    </form>

    <hr size="12" color="blue">
    <form action="${pageContext.request.contextPath }/longines/receiveShoppingCart" method="post">
        用户ID:<input type="text" name="uId"  id="uId" >
        商品ID:<input type="text" name="gId"  id="gId" >
        商品数量:<input type="text"name="gNum"  id="gNum" >
        总金额:<input type="text" name="tAmount"  id="tAmount" >
        状态号:<input type="text" name="status"  id="status" >
    <input type="submit" value="submit">
    </form>

    <form action="${pageContext.request.contextPath }/longines/redirect" method="post">
        <input type="submit" value="tijiao">
    </form>

</body>
</html>