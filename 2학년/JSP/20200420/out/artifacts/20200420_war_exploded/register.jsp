<%@ page import="java.net.URLEncoder" %>
<%@ page contentType="text/html;charset=euc-kr" language="java" %>
<html>
<head>
    <title>ȸ������ ���</title>
</head>
<body>
    <h1>ȸ������ ���</h1>
    <%
        String userid = request.getParameter("id");
        String password = request.getParameter("pwd");
        String sex = request.getParameter("sex");
        String department = request.getParameter("department");
        String [] hobby = request.getParameterValues("hobby");

        out.println("���̵� : " + userid + "<br />");
        out.println("��й�ȣ : " + password + "<br />");
        out.println("���� : " + sex + "<br />");
        out.println("�а� : " + department + "<br />");
        out.print("��� : ");
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
