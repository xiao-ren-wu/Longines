<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/6/006
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form id="itemForm" action="${pageContext.request.contextPath }/longines/tbCollectionWeb" method="post">
    <h1>首界面</h1>
    <input type="text" name="uId" value="${uId}"/>
    <input type="submit" value="提交"/>
</form>
<form id="its" action="${pageContext.request.contextPath }/longines/tbCollectionsave" method="post">
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
