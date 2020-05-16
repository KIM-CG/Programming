<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String [] fColor = {"red", "green", "blue"};
        String strGugu = "";
        for(int dan=2; dan <= 9; dan++) {
            int size = (int) (Math.random()*10)+5;
            int number = (int) (Math.random()*3);
            strGugu += ("<font size=" + size + " color=" + fColor[number] + ">");
            strGugu += (dan + "단<br>");
            for(int i=1; i <= 9; i++) {
                strGugu += (dan + " x " + i + " = " + (dan*i) + "<br>");
            }
            strGugu += "</font>";
        }
        out.println(strGugu);
    %>
</body>
</html>
