<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <%
            String [] arrDan = request.getParameterValues("dan2");
            for(int i = 0; i < arrDan.length; i++) {
                out.println(arrDan[i] + "단<BR>");
                for(int j = 1; j <= 9; j++) {
                    out.println(arrDan[i] + " x " + j + " = " + Integer.parseInt(arrDan[i])*j + "<BR>");
                }
                out.println("<BR>");
            }
        %>
    </body>
</html>
