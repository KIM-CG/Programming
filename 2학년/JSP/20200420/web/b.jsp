<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title></title>
    </head>
    <body>
        <h1>b.JSP</h1>
    <%
        request.setCharacterEncoding("utf-8");
        out.println(request.getParameter("uid") + "님 환영합니다.");
    %>
    </body>
</html>
