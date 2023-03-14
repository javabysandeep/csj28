<%@ page import="java.time.LocalDate" %>
<html>
<body>
<h4>Age Calculator App</h4>
<%@page errorPage="error.jsp" %>
<%
    LocalDate dateOfBirth = LocalDate.parse(request.getParameter("dateOfBirth"));
    LocalDate today = LocalDate.now();
    out.println("Your age in years : "+(today.getYear()-dateOfBirth.getYear()));
    out.println("Day on the date of birth : "+(dateOfBirth.getDayOfMonth()));
    out.println("Day on the date of birth : "+(dateOfBirth.getDayOfWeek()));

%>


</body>
</html>
