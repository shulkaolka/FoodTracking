<%@ page import="models.Product" %>
<%@ page import="java.util.ArrayList" %>
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
<div align="center">
    <form name="SearchForm" method="POST" action="FoodServlet">
        <input type="hidden" name="command" value="search" />
        Enter food name:<br />
        <input type="text" name="searchfield" value="" />
        <br />
        <input type="submit" value="Search" />
    </form>
    <table border="1" cellpadding="5">
        <caption><h2>List of Food</h2></caption>
        <tr>
            <th>Food Name</th>
            <th>Proteins</th>
            <th>Fats</th>
            <th>Carbohidrates</th>
            <th>Calorie</th>
        </tr>
        <c:forEach var="product" items="${productsFound}">
            <tr>
                <td><c:out value="${product.foodName}" /></td>
                <td><c:out value="${product.proteins}" /></td>
                <td><c:out value="${product.fats}" /></td>
                <td><c:out value="${product.carbohidrates}" /></td>
                <td><c:out value="${product.calorie}" /></td>
                <td>
                    <a href="FoodServlet?id=<c:out value='${product.id}' />?command=add">Add to me</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
