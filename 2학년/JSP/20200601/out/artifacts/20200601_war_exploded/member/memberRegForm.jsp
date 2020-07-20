<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Main</title>
</head>
<body>
    <h1>회원등록</h1>
    <form action="memberRegProc.jsp">
        <table border="1">
            <tr>
                <td>아이디</td>
                <td><input type="text" name="id"></td>
            </tr>
            <tr>
                <td>비밀번호</td>
                <td><input type="password" name="passwd"></td>
            </tr>
            <tr>
                <td>이름</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>성별</td>
                <td>
                    <input type="radio" name="gender" value="남자">남
                    <input type="radio" name="gender" value="여자">여
                </td>
            </tr>
            <tr>
                <td>학과</td>
                <td>
                    <select name="department">
                        <option value="보안과">보안과</option>
                        <option value="항공과">항공과</option>
                        <option value="수사과">수사과</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>취미</td>
                <td>
                    <input type="checkbox" name="hobby" value="농구">농구
                    <input type="checkbox" name="hobby" value="야구">야구
                    <input type="checkbox" name="hobby" value="축구">축구
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="회원등록"></td>
            </tr>
        </table>
    </form>
    <input type="button" onclick="location.href='index.jsp';" value="메인으로">
</body>
</html>
