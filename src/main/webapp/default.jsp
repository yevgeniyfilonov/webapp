<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 01.07.2014
  Time: 10:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>input text</title>
</head>
<body>
<fmt:bundle basename="i18n"/>
<fmt:message key="hello"/>

<form action="${pageContext.request.contextPath}/Controller" method="post">
    <%--<textarea name="text" rows="20" cols="80">--%>
    <textarea name="text" id="" cols="30" rows="10"></textarea>
    <input type="submit" name="Submit">
</form>

</body>
</html>
