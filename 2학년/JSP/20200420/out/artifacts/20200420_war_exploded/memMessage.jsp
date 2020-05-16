<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="euc-kr" %>
<html>
<head>
    <title></title>
</head>
<body>
    <h1>회원등록이 완료되었습니다.</h1>
    <%
        String name = request.getParameter("name");
        out.println("<h1>" + name + "님 환영합니다.</h1>");
    %>
</body>
</html>
