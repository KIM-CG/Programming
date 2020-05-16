
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <form action="test3.jsp" method="get">
      <select name="dan1">
        <option value="2">2단</option>
        <option value="3">3단</option>
        <option value="4">4단</option>
        <option value="5">5단</option>
        <option value="6">6단</option>
        <option value="7">7단</option>
        <option value="8">8단</option>
        <option value="9">9단</option>
      </select>
      <input type="submit" value="선택전송하기">
    </form>
    <form action="test3.jsp" method="get">
      <input type="checkbox" name="dan2" value="2">2단
      <input type="checkbox" name="dan2" value="3">3단
      <input type="checkbox" name="dan2" value="4">4단
      <input type="checkbox" name="dan2" value="5">5단
      <input type="checkbox" name="dan2" value="6">6단
      <input type="checkbox" name="dan2" value="7">7단
      <input type="checkbox" name="dan2" value="8">8단
      <input type="checkbox" name="dan2" value="9">9단
      <input type="submit" value="체크전송하기">
    </form>
  </body>
</html>
