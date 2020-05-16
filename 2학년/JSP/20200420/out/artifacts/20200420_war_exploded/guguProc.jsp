<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>구구단 출력 (처리)</h1>
    <%
        String [] danlist = request.getParameterValues("dan");
        String strdan = "";
        for (int i = 0; i < danlist.length; i++) {
            int dan = Integer.parseInt(danlist[i]);
            for (int j = 1; j <= 9; j++) {
                strdan += dan + " X " + j + " = " + (dan*j) + "<br />";
            }
            strdan += "<br />";
        }
    %>

    <%= strdan%>
</body>
</html>
