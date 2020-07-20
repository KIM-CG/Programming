<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*" %>
<html>
    <head>
        <title>Main</title>
    </head>
    <body>
        <h2>회원정보수정(폼)</h2>
        <%
            String userId = request.getParameter("id");
        %>
        <form action="updateform.jsp">
            조회할 아이디 : <input type="text" name="id" value="<%=userId%>">
            <input type="submit" value="조회">
            <input type="button" onclick="location.href='main.jsp';" value="메인으로">
        </form>
        <%
            Connection conn = null;
            PreparedStatement pstmt = null;
            ResultSet rs = null;

            try {
                String jdbcUrl = "jdbc:mysql://localhost:3306/basicjsp";
                String dbId = "jspid";
                String dbPwd = "jsppass";
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(jdbcUrl, dbId, dbPwd);

                String sql = "select * from member where id=?";
                pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, userId);
                rs = pstmt.executeQuery();
                if (rs.next()) {
        %>
        <form action="update.jsp" method="post">
            아이디: <input readonly type="text" value="<%=rs.getString("id")%>" name="id" maxlength="12"><br>
            비밀번호: <input type="password" name="passwd" value="<%=rs.getString("passwd")%>"><br>
            이름: <input type="text" name="name" value="<%=rs.getString("name")%>"><br>
            <input type="submit" value="수정">
        </form>
        <%
                } else {
        %>
                <h2>조회한 ID는 등록되지 않았습니다.</h2>
        <%
                }
            } catch (Exception e) {
                out.println("Exception : " + e.getMessage());
            } finally {
                if(pstmt != null){try {pstmt.close();}catch (SQLException sqle) {}}
                if(conn != null){try {conn.close();}catch (SQLException sqle) {}}
            }
        %>
    </body>
</html>