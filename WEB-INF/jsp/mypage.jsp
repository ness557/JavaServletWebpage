<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: ness
  Date: 14.05.18
  Time: 13:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Mypage jsp</title>
</head>
<body>
<h1>My servlet jsp page</h1>
 <%= new Date().toString()%>
<br/>
<p>This page was visited <%=request.getAttribute("count")%> times</p>
</body>
</html>
