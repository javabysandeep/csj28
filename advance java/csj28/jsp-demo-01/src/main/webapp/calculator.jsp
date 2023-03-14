<html>
<body>
<h2>Calculator App</h2>
<%@page errorPage="error.jsp" %>
<%
    int number1 = Integer.parseInt(request.getParameter("number1"));
    int number2 = Integer.parseInt(request.getParameter("number2"));
    String operation = request.getParameter("operation");

    switch (operation) {
        case "+":
            out.println("Addition " + (number1 + number2));
            break;
        case "-":
            out.println("Substraction " + (number1 - number2));
            break;
        case "*":
            out.println("Multiplication " + (number1 * number2));
            break;
        case "/":
            out.println("Division : Quotient " + (number1 / number2));
            break;
        case "%":
            out.println("Division : Remainder " + (number1 % number2));
            break;
        default:out.println("Invalid operation"); break;
    }
%>


</body>
</html>
