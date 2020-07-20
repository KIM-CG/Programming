<%@ page import="java.sql.*" %>
<%@ page import="javax.sql.*" %>
<%@ page import="javax.naming.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Main</title>
</head>
<body>
<table border="1">
  <tr>
    <th width="50">인덱스</th>
    <th width="100">메뉴</th>
    <th width="100">바로가기</th>
  </tr>
    <%
      String [] menus = {"회원등록", "회원수정", "회원삭제", "회원목록"};
      String [] links = {"./memberRegForm.jsp","./memberUpdateForm.jsp","./memberDeleteForm.jsp", "./memberList.jsp"};
      for(int i = 0; i <= 3; i++) {
        out.println("<tr>");
        out.println("<td align=center>" + (i+1) + "</td>");
        out.println("<td align=center>" + menus[i] + "</td>");
        out.println("<td align=center><a href=" + links[i] + ">바로가기</a></td>");
        out.println("</tr>");
      }
    %>
</table>
</body>
</html>