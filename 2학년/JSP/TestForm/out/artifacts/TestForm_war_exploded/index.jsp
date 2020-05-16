<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.SQLException" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title></title>
    </head>
    <body>
        <%
            Connection conn;
            try {
                String url = "jdbc:mysql://localhost:3306/jspdb?serverTimezone=UTC";
                conn = DriverManager.getConnection(url, "root", "wjdqhdks");
                out.println("연결 성공");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        %>
    </body>
</html>
