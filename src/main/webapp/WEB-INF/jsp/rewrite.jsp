<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
<head>
    <title>Редактирование</title>
</head>
<body>
<h2> Редактирование задачи</h2>
<form:form modelAttribute="task" action="/mainlist/update" method="POST">
    <table>
        <tr>
            <td><form:label path="mainId">ID</form:label></td>
            <td><form:input path="mainId"/></td>
        </tr>
        <tr>
            <td><form:label path="name">Название</form:label></td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td><form:label path="dateTime">Время</form:label></td>
            <td><form:input path="dateTime"/></td>
        </tr>
        <tr>
            <td><form:label path="descriotion">Описание</form:label></td>
            <td><form:input path="descriotion"/></td>
        </tr>
        <tr>
            <td><form:label path="importance">Важность</form:label></td>
            <td><form:input path="importance"/></td>
        </tr>
        <tr>
            <td><form:label path="period">Период</form:label></td>
            <td><form:input path="period"/></td>
        </tr>
        <tr>
            <td><form:label path="notification">Оповещение</form:label></td>
            <td><form:input path="notification"/></td>
        </tr>


        <tr>
            <td><input type="submit" value="Update"/></td>
        </tr>
    </table>
</form:form>


</body>
</html>
