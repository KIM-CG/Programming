<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title></title>

    </head>
    <body>
        <%
            String strgugu = "<table width='900'>";
            for (int i =1 ; i <= 9; i++) {
                strgugu += "<tr>";
                for (int dan = 2; dan <= 9; dan++) {
                    strgugu += ("<td>" + dan + " x " + i + " = " + dan*i + "</td>");
                }
                strgugu += "</tr>";
            }
            out.println(strgugu);
        %>
    </body>
</html>
