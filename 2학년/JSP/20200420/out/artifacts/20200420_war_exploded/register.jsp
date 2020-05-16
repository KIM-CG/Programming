<%@ page import="java.net.URLEncoder" %>
<%@ page contentType="text/html;charset=euc-kr" language="java" %>
<html>
<head>
    <title>회원가입 결과</title>
</head>
<body>
    <h1>회원가입 결과</h1>
    <%
        String userid = request.getParameter("id");
        String password = request.getParameter("pwd");
        String sex = request.getParameter("sex");
        String department = request.getParameter("department");
        String [] hobby = request.getParameterValues("hobby");

        out.println("아이디 : " + userid + "<br />");
        out.println("비밀번호 : " + password + "<br />");
        out.println("성별 : " + sex + "<br />");
        out.println("학과 : " + department + "<br />");
        out.print("취미 : ");
        for (int i = 0; i < hobby.length; i++) {
            if ((i+1) == hobby.length ) {
                out.print(hobby[i]);
            } else {
                out.print(hobby[i] + ", ");
            }
        }
    %>

    <%
        response.sendRedirect("memMessage.jsp?name=" + userid);
    %>
</body>
</html>
