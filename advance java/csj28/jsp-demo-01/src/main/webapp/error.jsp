<html>
<body>
<h2>Exception Handler Page</h2>
<%@page isErrorPage="true" %>
    <h1 style="color: red">
       Error occurred due to <%=exception.getMessage()%>
    </h1>


</body>
</html>
