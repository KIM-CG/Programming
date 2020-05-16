<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>회원등록 완료</title>
    </head>
    <body>
        <%
            request.setCharacterEncoding("UTF-8");
            String id = request.getParameter("id");
            String pwd = request.getParameter("pwd");
            String gender = request.getParameter("gender");
            String school = request.getParameter("school");
            String [] hobby = request.getParameterValues("hobby");
            String strhobby = " ";

            out.println("<h1>회원등록 완료</h1>");
            out.println("아이디 : " + id + "<BR />");
            out.println("비밀번호 : " + pwd + "<BR />");
            out.println("성별 : " + gender + "<BR />");
            out.println("학과 : " + school + "<BR />");
            out.print("취미1 : ");
            for (int i=0; i < hobby.length; i++) {
                if (i == (hobby.length - 1)) {
                    out.print(hobby[i]);
                } else {
                    out.print(hobby[i] + ", ");
                }
            }
            out.println("<br>");
            for (int i=0; i < hobby.length; i++) {
                if(i == (hobby.length-1)) {
                    strhobby += hobby[i];
                } else {
                    strhobby += hobby[i] + ", ";
                }
            }
            out.print("취미2 : " + strhobby);
        %>
    </body>
</html>
