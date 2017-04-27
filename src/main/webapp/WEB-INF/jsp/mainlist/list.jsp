<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html lang="ru">


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

        <c:forEach var="Mainlist" items="${Mainlist}">
            <tr>
                <td>${Mainlist.id}</td>
                <td>${Mainlist.name}</td>
                <td>${Mainlist.data_time}</td>
                <td>${Mainlist.description}</td>
                <td>${Mainlist.period}</td>
                <td>${Mainlist.norification}</td>
                <td>
                    <spring:url value="/users/${Mainlist.id}"        var="userUrl" />
                    <spring:url value="/users/${Mainlist.id}/delete" var="deleteUrl" />
                    <spring:url value="/users/${Mainlist.id}/update" var="updateUrl" />

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
