<%--
  Created by IntelliJ IDEA.
  User: sniak
  Date: 04.05.2017
  Time: 11:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Addlist</title>
</head>
<body>
<div class="container">
    <h1>AddToDo</h1>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>#ID</th>
            <th>Main_ID</th>
            <th>NAME</th>
            <th>Description</th>
        </tr>
        </thead>
        <c:forEach var="addlist" items="${AddToDo}">
            <tr>
                <td>${addlist.addId}</td>
                <td>${addlist.mainlistId}</td>
                <td>${addlist.addName}</td>
                <td>${addlist.addDescription}</td>
            </tr>
        </c:forEach>
        <spring:url value="/mainlist"        var="mainlist" />
        <button class="btn btn-info"
                onclick="location.href='${mainlist}'">На главную</button>


    </table>
</div>
</body>
</html>
