<!DOCTYPE html>
<html lang="ru">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <title>Calculation</title>
</head>
<body>
<p>num1: ${lastCalc.a()}</p>
<p>num2: ${lastCalc.b()}</p>
<p>operation: ${lastCalc.operation()}</p>
<p>result: ${lastCalc.result()}</p>
<a href="${pageContext.request.contextPath}/">Back</a>
</body>
</html>
