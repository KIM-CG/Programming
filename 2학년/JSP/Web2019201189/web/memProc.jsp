<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title></title>
    </head>
    <body>
        <%
            String name = request.getParameter("name");
            String userid = request.getParameter("userid");
            String gender = request.getParameter("gender");
            String department = request.getParameter("department");
            String[] subject  = request.getParameterValues("subject");
            String strsubject = "";
            for (int i = 0; i < subject.length; i++) {
                strsubject += subject[i] + " ";
            }
        %>
        <font size="6">
            이름 : <%=name%><br/>
            학번 : <%=userid%><br/>
            성별 : <%=gender%><br/>
            학과 : <%=department%><br/>
            과목 : <%=strsubject%><br/>
        </font>
    </body>
</html>
