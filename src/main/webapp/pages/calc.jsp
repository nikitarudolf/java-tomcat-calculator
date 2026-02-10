<%--
  Created by IntelliJ IDEA.
  User: nikit
  Date: 09.02.2026
  Time: 19:51
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
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
