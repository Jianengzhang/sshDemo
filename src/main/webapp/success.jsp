<%--
  Created by IntelliJ IDEA.
  User: Aron
  Date: 17-12-6
  Time: 11:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>；
<html>
<head>
    <title>成功</title>
</head>
<body>
<s:iterator var="user" value="#session.existUser" status="st">
    <s:property value="#user.userName"/>
    <s:property value="#user.password"/>
</s:iterator>

<h1>success</h1>
</body>
</html>
