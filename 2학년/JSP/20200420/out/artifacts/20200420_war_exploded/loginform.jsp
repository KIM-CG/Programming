<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>회원가입 양식</title>
  </head>
  <body>
    <h1>회원가입</h1>
    <form action="register.jsp">
      <table width="300">
        <tr>
          <th>아이디</th>
          <td><input type="text" name="id"></td>
        </tr>
        <tr>
          <th>비밀번호</th>
          <td><input type="password" name="pwd"></td>
        </tr>
        <tr>
          <th>성별</th>
          <td>남자<input type="radio" name="sex" value="남자"><br />여자 <input type="radio" name="sex" value="여자"></td>
        </tr>
        <tr>
          <th>학과</th>
          <td><select name="department">
            <option value="보안과">보안과</option>
            <option value="수사과">수사과</option>
            <option value="애완동물과">애완동물과</option>
            <option value="항공서비스과">항공서비스과</option>
          </select></td>
        </tr>
        <tr>
          <th>취미</th>
          <td><input type="checkbox" name="hobby" value="축구"> 축구
            <input type="checkbox" name="hobby" value="야구"> 야구
            <input type="checkbox" name="hobby" value="농구"> 농구</td>
        </tr>
        <tr>
          <th colspan="2"><input type="submit" value="회원가입"></th>
        </tr>
      </table>
    </form>
  </body>
</html>
