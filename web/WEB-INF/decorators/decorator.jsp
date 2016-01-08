<%--
  Created by IntelliJ IDEA.
  User: jxxiangwen
  Date: 16-1-8
  Time: 上午10:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head><title>测试<sitemesh:write property='title'/></title> <sitemesh:write property='head'/></head>
<body><sitemesh:write property='body'/></body>
</html>
