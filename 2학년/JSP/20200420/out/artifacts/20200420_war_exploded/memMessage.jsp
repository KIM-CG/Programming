<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="euc-kr" %>
<html>
<head>
    <title></title>
</head>
<body>
    <h1>ȸ������� �Ϸ�Ǿ����ϴ�.</h1>
    <%
        String name = request.getParameter("name");
        out.println("<h1>" + name + "�� ȯ���մϴ�.</h1>");
    %>
</body>
</html>
