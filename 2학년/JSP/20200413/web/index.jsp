<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>회원가입</title>
  </head>
  <body>
  <form action="register.jsp" method="get">
    이름 : <input type="text" name="id">
    <br>
    비밀번호 : <input type="password" name="pwd">
    <br>
    성별 :
    <input type="radio" name="gender" value="남자">남
    <input type="radio" name="gender" value="여자">여
    <br>
    학과 :
    <select name="school">
      <option value="보안과">보안과</option>
      <option value="애견과">애견과</option>
      <option value="항공과">항공과</option>
    </select>
    <br>
    취미 :
    <input type="checkbox" name="hobby" value="야구">야구
    <input type="checkbox" name="hobby" value="농구">농구
    <input type="checkbox" name="hobby" value="축구">축구
    <input type="submit" value="등록">
  </form>
  </body>
</html>
