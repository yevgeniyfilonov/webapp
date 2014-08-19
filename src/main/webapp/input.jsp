
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>input text</title>
</head>
<body>
<fmt:bundle basename="i18n"/>
    <fmt:message key="hello"/>
<form action="${pageContext.request.contextPath}servlet" method="post"/>
    <textarea name="text" rows="20" cols="80"/>
<input type="submit" name="Submit">
</body>
</html>
