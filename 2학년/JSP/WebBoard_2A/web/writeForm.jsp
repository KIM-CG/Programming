<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="color.jspf"%>
<html>
<html>
<head>
<title>게시판</title>
<link href="style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="script.js"></script>
</head>

<body bgcolor="<%=bodyback_c%>">
<p>글쓰기</p>
<form method="post" name="writeform" 
      action="writePro.jsp" onsubmit="return writeSave()">
<table>
   <tr bgcolor="<%=value_c%>">
    <td align="right" colspan="2">
	    <a href="list.jsp"> 글목록</a> 
   </td>
   </tr>
   <tr bgcolor="<%=value_c%>">
    <td  width="70" align="center">이 름</td>
    <td  width="330" align="left">
       <input type="text" size="10" maxlength="10" 
          name="writer" style="ime-mode:active;"></td><!--active:한글-->
  </tr>
  <tr bgcolor="<%=value_c%>">
    <td  width="70" align="center" >제 목</td>
    <td  width="330" align="left">
        <input type="text" size="38" name="subject">
    </td>
  </tr>
  <tr bgcolor="<%=value_c%>">
    <td  width="70" align="center">Email</td>
    <td  width="330" align="left">
       <input type="text" size="38" maxlength="30" name="email"
           style="ime-mode:inactive;" ></td><!--inactive:영문-->
  </tr>
  <tr bgcolor="<%=value_c%>">
    <td  width="70" align="center" >내 용</td>
    <td  width="330" align="left">
     <textarea name="content" rows="13" cols="40" 
              style="ime-mode:active;"></textarea> </td>
  </tr>
  <tr bgcolor="<%=value_c%>">
    <td  width="70" align="center" >비밀번호</td>
    <td  width="330" align="left">
     <input type="password" size="8" maxlength="12" 
             name="passwd" style="ime-mode:inactive;"> 
	 </td>
  </tr>
  <tr bgcolor="<%=value_c%>">
    <td colspan=2 align="center"> 
      <input type="submit" value="글쓰기" >  
      <input type="reset" value="다시작성">
      <input type="button" value="목록보기" OnClick="window.location='list.jsp'">
    </td>
  </tr>
</table>        
</form>    
</body>
</html>