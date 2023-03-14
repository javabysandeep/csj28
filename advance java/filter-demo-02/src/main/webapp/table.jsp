<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Number table</title>
</head>
<body>
<h1>Tables from 1 to 30 </h1>
<table border:"1px solid">
    <%
        for (int row = 1; row <= 10; row++) {
    %>
    <tr>
        <% for (int column = 1; column <= 30; column++) {

        %>
        <td>
            <%=row * column%>
        </td>
        <%} %>
    </tr>

    <%}%>
</table>
</body>
</html>
