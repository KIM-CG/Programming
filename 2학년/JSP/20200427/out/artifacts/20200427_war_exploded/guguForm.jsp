<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
    <h1>구구단 출력(폼)</h1>
    <form action="guguProcBean.jsp">
        단 : <input type="text" name="dan">
        폰트 : <select name="fsize">
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
            <option value="6">6</option>
            <option value="7">7</option>
            <option value="8">8</option>
        </select>
        <input type="submit" value="출력">
    </form>
</body>
</html>
