<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title></title>
    </head>
    <body>
        <%
            String id = request.getParameter("id");
            String pwd = request.getParameter("pwd");
            String gender = request.getParameter("gender");
            String department = request.getParameter("department");
            String[] hobby = request.getParameterValues("hobby");
            String strname = "";
            strname += ("아이디 : " + id + "<br />");
            strname += ("비밀번호 : " + pwd + "<br />");
            strname += ("성별 : " + gender + "<br />");
            strname += ("학과 : " + department + "<br />");
            for (int i = 0; i < hobby.length; i++) {
                strname += (hobby[i] + " ");
            }
        %>
        <p><%= strname %></p>
    </body>
</html>
