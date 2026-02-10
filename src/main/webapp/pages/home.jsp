<%--
  Created by IntelliJ IDEA.
  User: nikit
  Date: 09.02.2026
  Time: 19:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
<form action="${pageContext.request.contextPath}/calc" method="post">
    num 1: <label>
    <input type="text" name="num1">
</label><br>
    num 2: <label>
    <input type="text" name="num2">
</label><br>
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
