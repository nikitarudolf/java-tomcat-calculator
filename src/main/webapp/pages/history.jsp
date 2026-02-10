<!DOCTYPE html>
<html lang="ru">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html lang="en">
<head>
    <title>History</title>
</head>
<body>
<h3>History</h3>
<table border="1">
    <tr>
        <th>num1</th><th>num2</th><th>operation</th><th>result</th>
    </tr>
    <c:forEach var="calc" items="${history}">
        <tr>
            <td>${calc.a()}</td>
            <td>${calc.b()}</td>
            <td>${calc.operation()}</td>
            <td>${calc.result()}</td>
        </tr>
    </c:forEach>
</table>
<a href="${pageContext.request.contextPath}/">Back</a>
</body>
</html>
