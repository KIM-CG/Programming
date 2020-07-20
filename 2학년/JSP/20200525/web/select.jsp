<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*" %>
<html>
    <head>
        <title>Main</title>
    </head>
    <body>
        <table border="1">
            <tr>
                <td width="100">아이디</td>
                <td width="100">비밀번호</td>
                <td width="100">이름</td>
                <td width="100">등록일</td>
                <td width="100">기능</td>
            </tr>
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

                    String sql = "select * from `member`";
                    pstmt = conn.prepareStatement(sql);
                    rs = pstmt.executeQuery();
                    while (rs.next()) {
            %>
            <tr>
                <td><%=rs.getString("id")%></td>
                <td><%=rs.getString("passwd")%></td>
                <td><%=rs.getString("name")%></td>
                <td><%=rs.getTimestamp("reg_date")%></td>
                <td>
                    <input type="button" value="수정" onclick="location.href='updateform.jsp?id=<%=rs.getString("id")%>'">
                    <input type="button" value="삭제" onclick="location.href='delete.jsp?id=<%=rs.getString("id")%>&passwd=<%=rs.getString("passwd")%>'">
                </td>
            </tr>
            <%
                    }
                } catch (Exception e) {
                    out.println("Exception : " + e.getMessage());
                }
            %>
        </table>
        <input type="button" onclick="location.href='main.jsp';" value="메인으로">
    </body>
</html>