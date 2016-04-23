<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2015/11/27
  Time: 0:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Object hello = request.getAttribute("hello");
    response.getOutputStream().print(hello.toString());
    response.getOutputStream().print(hello.toString());
%>
</body>
</html>
