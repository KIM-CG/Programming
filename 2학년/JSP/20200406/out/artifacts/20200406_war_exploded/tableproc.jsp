<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table border=1 width=380>
        <tr>
            <th>글번호</th>
            <th>글제목</th>
            <th>글내용</th>
        </tr>
    <%
        String loop = request.getParameter("loop");
        int loopi = Integer.parseInt(loop);
        for(int i=loopi; i > 0; i--) {
            out.println("<tr>");
            out.println("<td>" + i + "</td>");
            out.println("<td>제목" + i + "</td>");
            out.println("<td>내용" + i + "</td>");
            out.println("</tr>");
        }
    %>
    </table>
</body>
</html>
