<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*" %>
<html>
    <head>
        <title></title>
    </head>
    <body>
        <h1>JDBC 드라이버 테스트</h1>
        <%
            try {
                Connection conn = null;
                String link = "jdbc:mysql://localhost:3306/basicjsp?serverTimezone=UTC";
                String uid = "jspid";
                String pwd = "jsppass";
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(link, uid, pwd);
                out.println("제대로 연결되었습니다.");
            } catch (Exception e) {
                out.println(e);
            }
        %>
    </body>
</html>
