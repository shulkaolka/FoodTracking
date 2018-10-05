<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: olgal_000
  Date: 24.09.2018
  Time: 23:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Map</title>
</head>
<body>
<%
    out.println(request.getAttribute("user") + ", hello!!!");
    out.println("<a href=\"FoodServlet?command=logout\">Logout</a>");
%>
<div align="center">
    <h2>
        <a href="FoodServlet?command=listall">List All Food Products</a>

    </h2>
</div>
</body>
</html>
