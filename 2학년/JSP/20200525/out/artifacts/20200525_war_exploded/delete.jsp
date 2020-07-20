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

                String sql = "delete from `member` where id=? and passwd=?";
                pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, userId);
                pstmt.setString(2, passwd);
                pstmt.execute();
                response.sendRedirect("select.jsp");
            } catch (SQLException e) {
                out.println(e.getMessage());
            }
        %>
    </body>
</html>
