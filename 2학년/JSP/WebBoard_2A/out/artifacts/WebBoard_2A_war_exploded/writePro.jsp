<%@ page import="java.sql.Timestamp" %>
<%@ page import="ch13.board.BoardDBBean" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<% request.setCharacterEncoding("utf-8");%>

<html>
    <head>
        <title>Main</title>
    </head>
    <body>
        <jsp:useBean id="article" scope="page" class="ch13.board.BoardDataBean">
            <jsp:setProperty name="article" property="*"></jsp:setProperty>
        </jsp:useBean>
        <%
            article.setReg_date(new Timestamp(System.currentTimeMillis()));
            article.setIp(request.getRemoteAddr());

            BoardDBBean dbPro = BoardDBBean.getInstance();
            dbPro.insertArticle(article);

            response.sendRedirect("list.jsp");
        %>
    </body>
</html>
