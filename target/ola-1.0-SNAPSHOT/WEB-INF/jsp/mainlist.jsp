<%--
  Created by IntelliJ IDEA.
  User: sniak
  Date: 04.05.2017
  Time: 1:52
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>MainList</title></head>
<body>
<div class="container">
    <h1>All MainToDo</h1>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>#ID</th>
            <th>Name</th>
            <th>Data_Time</th>
            <th>Description</th>
            <th>Period</th>
            <th>Notification</th>
        </tr>
        </thead>
        <c:forEach var="mainlist" items="${MainToDo}">
            <tr>
                <td>${mainlist.mainId}</td>
                <td>${mainlist.name}</td>
                <td>${mainlist.dateTime}</td>
                <td>${mainlist.descriotion}</td>
                <td>${mainlist.period}</td>
                <td>${mainlist.notification}</td>
                <td>
                    <spring:url value="/jsp/${mainlist.mainId}"        var="userUrl" />
                    <spring:url value="/jsp/${mainlist.mainId}/delete" var="deleteUrl" />
                    <spring:url value="/jsp/${mainlist.mainId}/update" var="updateUrl" />
                    <button class="btn btn-info"
                            onclick="location.href='${userUrl}'">Info</button>
                    <button class="btn btn-update"
                            onclick="location.href='${updateUrl}'">Update</button>
                    <button class="btn btn-delete"
                            onclick="location.href='${deleteUrl}'">Delete</button>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
