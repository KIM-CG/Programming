<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <h1>a.JSP</h1>
        <jsp:include page="b.jsp">
            <jsp:param name="uid" value="DaeHyuni JJabJJabei" />
        </jsp:include>
        <h1>안녕하세요!</h1>
    </body>
</html>
