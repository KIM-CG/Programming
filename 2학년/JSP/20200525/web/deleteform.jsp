<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Main</title>
    </head>
    <body>
        <h2>회원정보삭제(폼)</h2>
        <form action="delete.jsp">
            아이디 : <input type="text" name="id"><br>
            비밀번호 : <input type="passwd" name="passwd"><br>
            <input type="submit" value="삭제">
            <input type="button" onclick="location.href='main.jsp';" value="메인으로">
        </form>
    </body>
</html>
