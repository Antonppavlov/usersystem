<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: antonpavlov
  Date: 17.02.2018
  Time: 20:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<spring:form modelAttribute="userFromServer" method="post" action="/user-system/users/check">
    <spring:input path="login"/>
    <spring:password path="password"/>
    <spring:button>Check</spring:button>
</spring:form>
</body>
</html>
