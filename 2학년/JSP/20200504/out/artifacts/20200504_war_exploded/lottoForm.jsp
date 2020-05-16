<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title></title>
    </head>
    <body>
        <h1>로또번호</h1>
        <form action="lottoProc.jsp">
            시작번호 : <input type="text" name="start"> <br/>
            끝번호 : <input type="text" name="end"> <br/>
            추출개수 : <input type="text" name="num"> <br/>
            <input type="submit" value="로또 번호 추첨">
        </form>
    </body>
</html>
