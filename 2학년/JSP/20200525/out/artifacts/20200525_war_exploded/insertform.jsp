<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Main</title>
    </head>
    <body>
        <h2>회원정보입력(폼)</h2>
        <form action="insert.jsp">
            아이디: <input type="text" name="id"><br>
            비밀번호: <input type="password" name="passwd"><br>
            이름: <input type="text" name="name"><br>
            <input type="submit" value="입력">
            <input type="button" onclick="location.href='updateform.jsp';" value="정보수정">
            <input type="button" onclick="location.href='main.jsp';" value="메인으로">
        </form>
    </body>
</html>
