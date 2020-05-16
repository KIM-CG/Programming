<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>구구단 출력 (폼)</h1>
    <form action="guguProc.jsp">
        <table>
            <tr>
            <tr>
               <th colspan="8">구구단 출력</th>
            </tr>
                <th><input type="checkbox" name="dan" value="2">2단</th>
                <th><input type="checkbox" name="dan" value="3">3단</th>
                <th><input type="checkbox" name="dan" value="4">4단</th>
                <th><input type="checkbox" name="dan" value="5">5단</th>
                <th><input type="checkbox" name="dan" value="6">6단</th>
                <th><input type="checkbox" name="dan" value="7">7단</th>
                <th><input type="checkbox" name="dan" value="8">8단</th>
                <th><input type="checkbox" name="dan" value="9">9단</th>
            </tr>
            <tr>
                <th colspan="8"><input type="submit" value="제출"></th>
            </tr>
        </table>
    </form>
</body>
</html>
