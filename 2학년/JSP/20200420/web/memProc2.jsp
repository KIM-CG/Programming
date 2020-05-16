<%@ page import="example.HelloWorld" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
    <h1>회원가입(처리)</h1>
    <%

        int dan = 5;
        String strDan = "";
        for(int i = 1; i <= 9; i++) {
            strDan += dan + " x " + i + " = " + (dan*i) + "<br />";
        }
    %>
    <jsp:forward page="memProcForward.jsp" >
        <jsp:param name="dan" value="<%=dan%>" />
        <jsp:param name="strDan" value="<%=strDan%>" />
    </jsp:forward>
</body>
</html>
