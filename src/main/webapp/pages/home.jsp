<!DOCTYPE html>
<html lang="ru">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <title>Title</title>

</head>
<body>
<form action="${pageContext.request.contextPath}/calc" method="post">
    <label>
    <input type="text" name="num1" />
         num 1
    </label>
    <br>
     <label>
    <input type="text" name="num2">
         num 2
    </label>
    <br>
    <label>
        <select name="operation">
            <option value="sum">Sum (+)</option>
            <option value="sub">Subtract (-)</option>
            <option value="mul">Multiply (*)</option>
            <option value="div">Divide (/)</option>
        </select>
    </label>
    <input type="submit" value="Calculate">
</form>
<a href="${pageContext.request.contextPath}/history">Show history</a>
</body>
</html>
