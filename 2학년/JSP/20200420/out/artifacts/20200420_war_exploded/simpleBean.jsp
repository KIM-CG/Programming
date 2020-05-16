<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="test" class="ch10.SimpleBean" scope="page" />
<jsp:setProperty name="test" property="message" value="빈을 쉽게 정복하자!" />
<html>
<head>
    <title></title>
</head>
<body>
    Message: <jsp:getProperty name="test" property="message" />
</body>
</html>
