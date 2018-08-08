<%--
  Created by IntelliJ IDEA.
  User: 888
  Date: 2018/8/8
  Time: 19:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>success</title>
</head>
<body>
<form action = " ${pageContext.request.contextPath }/Longines/IfSuccess" method="post">
    OID:<input type="text" name = "oid" >
    PW:<input type="text" name = "pw">
    <input type="submit" value = "提交">
</form>
<script>
        if(i=${state}){
            alert("成功");
        }else {
            alert("失败");
        }
</script>
</body>
</html>
