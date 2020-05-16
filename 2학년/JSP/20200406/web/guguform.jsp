<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>구구단 출력 (폼)</h1>
    <form action="guguproc.jsp" method="get">
        출력단 :
        <input type="checkbox" name="maindan" value="2">2단
        <input type="checkbox" name="maindan" value="3">3단
        <input type="checkbox" name="maindan" value="4">4단
        <input type="checkbox" name="maindan" value="5">5단
        <input type="checkbox" name="maindan" value="6">6단
        <input type="checkbox" name="maindan" value="7">7단
        <input type="checkbox" name="maindan" value="8">8단
        <input type="checkbox" name="maindan" value="9">9단<br />
        폰트크기 :
        <input type="range" name="vol" min="0" max="20"><br />
        폰트크기(CSS) :
        <input type="text" name="vol2"><br />
        색깔 :
        <input type="checkbox" name="color" value="red">빨간색
        <input type="checkbox" name="color" value="blue">파란색
        <input type="checkbox" name="color" value="green">초록색
        <input type="checkbox" name="color" value="random">랜덤색<br />
        <input type="submit" vlaue="확인">
    </form>
</body>
</html>
