<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title></title>
    </head>
    <body>
        <form action="memProcBean.jsp">
            <table width="300">
                <tr>
                    <th>ID</th>
                    <td><input type="text" name="id"></td>
                </tr>
                <tr>
                    <th>PW</th>
                    <td><input type="password" name="pwd"></td>
                </tr>
                <tr>
                    <th>성별</th>
                    <td>
                        <input type="radio" name="gender" value="남자">남자
                        <input type="radio" name="gender" value="여자">여자
                    </td>
                </tr>
                <tr>
                    <th>학과</th>
                    <td>
                        <select name="department">
                            <option value="보안과">보안과</option>
                            <option value="수사과">수사과</option>
                            <option value="애동과">애동과</option>
                            <option value="항공과">항공과</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <th>취미</th>
                    <td>
                        <input type="checkbox" name="hobby" value="축구">축구
                        <input type="checkbox" name="hobby" value="농구">농구
                        <input type="checkbox" name="hobby" value="야구">야구
                    </td>
                </tr>
                <tr>
                    <th colspan="2"><input type="submit" value="등록"></th>
                </tr>
            </table>
        </form>
    </body>
</html>
