<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<head>
<title>게시판</title>
<link href="style.css" rel="stylesheet" type="text/css">
</head>
<body>
<p>글내용 보기</p>
<form>
<table>  
  <tr height="30">
    <td align="center" width="125">글번호</td>
    <td align="center" width="125" align="center"></td>
    <td align="center" width="125">조회수</td>
    <td align="center" width="125" align="center"></td>
  </tr>
  <tr height="30">
    <td align="center" width="125">작성자</td>
    <td align="center" width="125" align="center"></td>
    <td align="center" width="125">작성일</td>
    <td align="center" width="125" align="center"></td>
  </tr>
  <tr height="30">
    <td align="center" width="125">글제목</td>
    <td align="center" width="375" align="center" colspan="3"></td>
  </tr>
  <tr>
    <td align="center" width="125">글내용</td>
    <td align="left" width="375" colspan="3"></td>
  </tr>
  <tr height="30">      
    <td colspan="4" align="right" > 
	  <input type="button" value="글수정">
	  <input type="button" value="글삭제">
      <input type="button" value="답글쓰기">
       <input type="button" value="글목록">
    </td>
  </tr>
</table>    
</form>      
</body>
</html>