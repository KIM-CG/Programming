<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
    <%
        request.setCharacterEncoding("utf-8");
        String dan = request.getParameter("dan");
        String strDan = request.getParameter("strDan");
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
        out.print("<br /> 구구단 : " + dan + "단<br />");
        out.print(strDan);
    %>
</body>
</html>
