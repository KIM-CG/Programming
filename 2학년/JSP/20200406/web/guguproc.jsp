<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>구구단 출력</title>
</head>
<body>
    <h1>구구단 출력 ( 결과 )</h1>
    <%
        String[] colorlist = {"red", "purple", "green", "blue", "yellow"};
        String[] arrDan = request.getParameterValues("maindan");
        String vol1 = request.getParameter("vol");
        String vol2 = request.getParameter("vol2");
        String color = request.getParameter("color");
        int fsize = 0;
        if (vol1 != null && Integer.parseInt(vol2) == 0) {
            fsize = Integer.parseInt(vol1);
        } else if (vol2 != null && Integer.parseInt(vol1) == 0) {
            fsize = Integer.parseInt(vol2);
        } else if (vol1 != null && vol2 != null) {
            if (Integer.parseInt(vol1) >= Integer.parseInt(vol2)) {
                fsize = Integer.parseInt(vol1);
            } else {
                fsize = Integer.parseInt(vol2);
            }
        } else {
                fsize = 4;
        }
        if (color.equals("random")) {
            int index = (int) Math.floor(Math.random()*colorlist.length);
            color = colorlist[index];
        }
        for(int i = 0; i < arrDan.length; i++) {
            out.println("<p style='font-size:" + fsize + "px; color:" + color + "'>" + arrDan[i] + "단<BR></p>");
            for(int j = 1; j <= 9; j++) {
                out.println("<p style='font-size:" + fsize + "px; color:" + color + "'>" + arrDan[i] + " x " + j + " = " + Integer.parseInt(arrDan[i])*j + "</p>");
            }
            out.println("<p style='font-size:" + fsize + "px; color:" + color + "'><BR></p>");
        }
    %>
</body>
</html>
