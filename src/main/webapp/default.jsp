
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>input text</title>
</head>
<body>
<fmt:bundle basename="i18n"/>
<fmt:message key="hello"/>

<form action="${pageContext.request.contextPath}/Controller" method="post">
     <textarea name="text"  cols="30" rows="10"></textarea>
    <input type="submit" name="Submit">
</form>

</body>
</html>
