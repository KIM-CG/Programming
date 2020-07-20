<%@ page import="java.sql.*" %>
<%@ page import="javax.naming.*" %>
<%@ page import="javax.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
            <td width="100">성별</td>
            <td width="100">학과</td>
            <td width="100">취미</td>
            <td width="100">등록일</td>
            <td width="100">기능</td>
        </tr>
        <%
            Connection conn = null;
            PreparedStatement pstmt = null;
            ResultSet rs = null;

            try {
                Context initCix = new InitialContext();
                Context envCix = (Context)initCix.lookup("java:comp/env");
                DataSource ds = (DataSource)envCix.lookup("jdbc/basicjsp");
                conn = ds.getConnection();

                String sql = "select * from `member2`";
                pstmt = conn.prepareStatement(sql);
                rs = pstmt.executeQuery();
                while (rs.next()) {
        %>
            <tr>
                <td><%=rs.getString("fUserId")%></td>
                <td><%=rs.getString("fPasswd")%></td>
                <td><%=rs.getString("fUserName")%></td>
                <td><%=rs.getString("fSex")%></td>
                <td><%=rs.getString("fDepartment")%></td>
                <td><%=rs.getString("fHobby")%></td>
                <td><%=rs.getString("fRegdate")%></td>
                <td>
                    <input type="button" value="수정" onclick="location.href='memberUpdateForm.jsp?id=<%=rs.getString("fUserid")%>'">
                    <input type="button" value="삭제" onclick="location.href='memberDeleteForm.jsp?id=<%=rs.getString("fUserid")%>&passwd=<%=rs.getString("fPasswd")%>'">
                </td>
            </tr>
        <%
                }
            } catch (Exception e) {
                out.println("Exception : " + e.getMessage());
            } finally{
                    if(pstmt != null) try{pstmt.close();}catch(SQLException sqle){}
                    if(conn != null) try{conn.close();}catch(SQLException sqle){}
            }
        %>
    </table>
    <input type="button" onclick="location.href='index.jsp';" value="메인으로">
</body>
</html>
