<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>회원가입</title>
  </head>
  <body>
    <h1>Register</h1>
    <form action="registerlocal.jsp" motho="get">
      아이디: <input type="text" name=userID><br>
      비밀번호: <input type="password" name="pwd"><br>
      성별: <input type="radio" name="sex" value="man">남
      <input type="radio" name="sex" value="woman">여<br>
      학과 : <select name="department">
      <option value="컴공과">컴공과</option>
      <option value="보안과">보안과</option>
      <option value="애동과">애동과</option>
      </select><br>
      <input type="checkbox" name="hobby" value="야구">야구
      <input type="checkbox" name="hobby" value="농구">농구
      <input type="checkbox" name="hobby" value="축구">축구
      <input type="submit" value="등록">
    </form>
  </body>
</html>
