<%--
  Created by IntelliJ IDEA.
  User: Andy
  Date: 2018/8/9
  Time: 17:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>地址信息表</title>
    </head>
    <body>
        查询条件：
        <table width="100%" border=1>
            <tr>
                <td>
                    <form action="${pageContext.request.contextPath }/rec/recSelect" method="post">
                        ID<input type = "text" name = "uid1" id = "uid1">
                        <input type="submit" value = "提交">
                    </form>
                </td>
            </tr>
        </table>
    </body>
</html>