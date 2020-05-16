<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title></title>
    </head>
    <body>
        <h1>수강정보입력</h1>
        <form action="memProc.jsp">
            <table border="1" width="400">
                <tr>
                    <td>이름</td>
                    <td><input type="text" name="name"></td>
                </tr>
                <tr>
                    <td>학번</td>
                    <td><input type="text" name="userid"></td>
                </tr>
                <tr>
                    <td>성별</td>
                    <td>
                        <input type="radio" name="gender" value="남">남
                        <input type="radio" name="gender" value="여">여
                    </td>
                </tr>
                <tr>
                    <td>학과</td>
                    <td>
                        <select name="department">
                            <option value="보안과">보안과</option>
                            <option value="보안과">수사과</option>
                            <option value="보안과">항공과</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>수강과목</td>
                    <td>
                        <input type="checkbox" name="subject" value="전산개론">전산개론
                        <input type="checkbox" name="subject" value="인터넷해킹과보안">인터넷해킹과보안
                        <input type="checkbox" name="subject" value="동물학">동물학
                    </td>
                </tr>
                <tr>
                    <td colspan="2" style="text-align: center"><input type="submit" value="등록"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
