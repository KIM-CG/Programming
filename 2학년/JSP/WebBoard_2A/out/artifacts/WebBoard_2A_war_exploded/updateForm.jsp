<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<title>게시판</title>
<link href="style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="script.js"></script>
</head>
<body>
<p>글수정</p>
<br>
<form>
<table>
  <tr>
    <td  width="70" align="center">이 름</td>
    <td align="left" width="330">
       <input type="text" size="10" maxlength="10" name="writer" style="ime-mode:active;">
	   <input type="hidden" name="num">
	</td>
  </tr>
  <tr>
    <td  width="70" align="center" >제 목</td>
    <td align="left" width="330">
       <input type="text" size="40" maxlength="50" name="subject" style="ime-mode:active;">
    </td>
  </tr>
  <tr>
    <td width="70" align="center">Email</td>
    <td align="left" width="330">
       <input type="text" size="40" maxlength="30" name="email" style="ime-mode:inactive;">
    </td>
  </tr>
  <tr>
    <td width="70" align="center" >내 용</td>
    <td align="left" width="330">
     <textarea name="content" rows="13" cols="40" style="ime-mode:active;"></textarea>
    </td>
  </tr>
  <tr>
    <td width="70" align="center" >비밀번호</td>
    <td align="left" width="330" >
     <input type="password" size="8" maxlength="12" 
               name="passwd" style="ime-mode:inactive;">
     
	 </td>
  </tr>
  <tr>      
   <td colspan=2 align="center"> 
     <input type="submit" value="글수정" >  
     <input type="reset" value="다시작성">
     <input type="button" value="목록보기">
   </td>
 </tr>
 </table>
</form>
</body>
</html>