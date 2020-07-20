<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*" %>
<html>
    <head>
        <title>Main</title>
    </head>
    <body>

    <%
        request.setCharacterEncoding("UTF-8");
        String userId = request.getParameter("id");
        String passwd = request.getParameter("passwd");
        String name = request.getParameter("name");
    %>
    <%
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            String jdbcUrl = "jdbc:mysql://localhost:3306/basicjsp";
            String dbId = "jspid";
            String dbPwd = "jsppass";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(jdbcUrl, dbId, dbPwd);

            String sql = "update `member` set passwd=?,name=? where id=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, passwd);
            pstmt.setString(2, name);
            pstmt.setString(3, userId);
            pstmt.execute();
            out.println("수정이 완료되었습니다.");
            response.sendRedirect("select.jsp");
        } catch (Exception e) {
            out.println(e.getMessage());
        }
    %>
    </body>
</html>