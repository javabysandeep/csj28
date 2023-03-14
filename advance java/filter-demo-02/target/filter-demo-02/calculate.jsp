<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator App</title>
</head>
<body>
<%
    int number1 = Integer.parseInt(request.getParameter("number1"));
    int number2 = Integer.parseInt(request.getParameter("number2"));
    String operation = request.getParameter("operation");
    String result = "";
    switch (operation) {
        case "+":
            result = String.valueOf(number1 + number2);
            break;
        case "-":
            result = String.valueOf(number1 - number2);
            break;
        case "*":
            result = String.valueOf(number1 * number2);
            break;
        case "/":
            result = String.valueOf(number1 / number2);
            break;
        case "%":
            result = String.valueOf(number1 % number2);
            break;
    }
    out.println(result);
%>
</body>
</html>
