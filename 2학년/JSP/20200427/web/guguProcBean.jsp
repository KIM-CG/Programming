<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
    <jsp:useBean id="gugu" class="ch10.Gugudan" scope="page" />
    <jsp:setProperty name="gugu" property="*" />
    구구단 : <br/><jsp:getProperty name="gugu" property="strGugudan"/>
</font>
</body>
</html>
