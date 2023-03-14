<html>
<body>
<h2>Leap Year App</h2>
<%@page errorPage="error.jsp" %>
<%
    int year = Integer.parseInt(request.getParameter("year"));
    boolean isLeapYear = (year%400==0) || (year%100!=0 && year%4==0);
    out.println(isLeapYear?"Its Leap year":"Not a leap year");

%>


</body>
</html>
