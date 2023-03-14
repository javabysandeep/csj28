<html>
<body>
<h2>Hello World! JSP</h2>

<%--
    Scriptlet Tag : <% service method %>
    Declaration Tag: <%! class level code %>
    Expression Tag :<%=%> service method
--%>
<table style="border-color: black">
    <%
        for (int row = 1; row <= 10; row++) {
    %>
    <tr>
     <% for (int column = 1; column <=50 ; column++) {
     %>
        <td><% out.print(row*column);%></td>
    <% }%>
    </tr>
    <%
        }
    %>

</table>

</body>
</html>
