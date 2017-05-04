<%--
  Created by IntelliJ IDEA.
  User: sniak
  Date: 04.05.2017
  Time: 11:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Addlist</title>
</head>
<body>
<div class="container">

    <h1>All MainToDo</h1>

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
                <td>${addlist}</td>
                <td>${addlist.name}</td>
                <td>${addlist.dateTime}</td>
                <td>${addlist.descriotion}</td>
                <td>
                    <spring:url value="/jsp/${user.id}"        var="userUrl" />
                    <spring:url value="/jsp/${user.id}/delete" var="deleteUrl" />
                    <spring:url value="/jsp/${user.id}/update" var="updateUrl" />

                    <button class="btn btn-info"
                            onclick="location.href='${userUrl}'">Info</button>
                    <button class="btn btn-update"
                            onclick="location.href='${updateUrl}'">Update</button>
                    <button class="btn btn-delete"
                            onclick="this.disabled=true;post('${deleteUrl}')">Delete</button>
                </td>
            </tr>
        </c:forEach>
    </table>

</div>
</body>
</html>
