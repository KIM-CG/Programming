<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>회원등록</title>
    </head>
    <body>
    <h1>회원등록 (처리)</h1>
    <%
        out.println("아이디 : " + request.getParameter("userID") + "<BR>");
        out.println("비밀번호 : " + request.getParameter("pwd") + "<BR>");
        String sex = request.getParameter("sex");
        if (sex.equals("man")) {
            out.println("성별 : 남자<BR>");
        } else if (sex.equals("girl")) {
            out.println("성별 : 여자<BR>");
        }
        out.println("학과 : " + request.getParameter("department") + "<BR>");
        String [] hobbylist = request.getParameterValues("hobby");
        out.print("취미 : ");
        for (int i = 0; i < hobbylist.length; i++) {
            if (i == hobbylist.length-1) {
                out.print(hobbylist[i]);
            } else {
                out.print(hobbylist[i] + ", ");
            }
        }
    %>
    </body>
</html>
