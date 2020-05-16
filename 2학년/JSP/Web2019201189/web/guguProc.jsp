<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title></title>
    </head>
    <body>
        <%
            String[] danlist = request.getParameterValues("dan");
            String strDan = "";

            for (int i = 0; i < danlist.length; i++) {
                int dan = Integer.parseInt(danlist[i]);
                strDan += "<tr>";
                strDan += "<td style='text-align:center;'>" + dan + "단</td><td>";
                for (int j = 1; j <= 9; j++) {
                    strDan += dan + "*" + j + "=" + (dan*j) + "<br/>";
                }
                strDan += "</td></tr>";
            }
        %>
        <h1>구구단 출력(처리)</h1>
        <table border="1" width="300">
            <%=strDan%>
        </table>
    </body>
</html>
