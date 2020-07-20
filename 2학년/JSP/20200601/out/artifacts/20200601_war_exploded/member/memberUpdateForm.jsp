<%@ page import="java.sql.*" %>
<%@ page import="javax.naming.*" %>
<%@ page import="javax.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Main</title>
    </head>
    <body>
        <%
            String id = request.getParameter("id");

            Connection conn = null;
            PreparedStatement pstmt = null;
            ResultSet rs = null;

            try{
                Context initCix = new InitialContext();
                Context envCix = (Context)initCix.lookup("java:comp/env");
                DataSource ds = (DataSource)envCix.lookup("jdbc/basicjsp");
                conn = ds.getConnection();

                String sql = "select * from member2 where fUserId=?";
                pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, id);
                rs = pstmt.executeQuery();
                if (rs.next()) {
        %>
        <form action="memberUpdateProc.jsp">
            <table border="1">
                <tr>
                    <td>아이디</td>
                    <td><input readonly type="text" value="<%=rs.getString("fUserId")%>" name="id" maxlength="12"></td>
                </tr>
                <tr>
                    <td>비밀번호</td>
                    <td><input type="password" name="passwd" value="<%=rs.getString("fPasswd")%>"></td>
                </tr>
                <tr>
                    <td>이름</td>
                    <td><input type="text" name="name" value="<%=rs.getString("fUserName")%>"></td>
                </tr>
                <tr>
                    <td>성별</td>
                    <td>

                        <%
                            if (rs.getString("fSex").equals("남자")) {
                                out.println("성별: <input type=\"radio\" name=\"gender\" value=\"남자\" checked>남" +
                                        "<input type=\"radio\" name=\"gender\" value=\"여자\">여<br>");
                            } else {
                                out.println("성별: <input type=\"radio\" name=\"gender\" value=\"남자\">남" +
                                        "<input type=\"radio\" name=\"gender\" value=\"여자\" checked>여<br>");
                            }
                        %>
                    </td>
                </tr>
                <tr>
                    <td>학과</td>
                    <td>
                        <select name="department">
                            <%
                                if (rs.getString("fDepartment").equals("보안과")) {
                                    out.println("<option value=\"보안과\" selected>보안과</option>" +
                                            "<option value=\"항공과\">항공과</option>" +
                                            "<option value=\"수사과\">수사과</option>");
                                } else if (rs.getString("fDepartment").equals("항공과")) {
                                    out.println("<option value=\"보안과\">보안과</option>" +
                                            "<option value=\"항공과\" selected>항공과</option>" +
                                            "<option value=\"수사과\">수사과</option>");
                                } else {
                                    out.println("<option value=\"보안과\">보안과</option>" +
                                            "<option value=\"항공과\">항공과</option>" +
                                            "<option value=\"수사과\" selected>수사과</option>");
                                }
                            %>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>취미</td>
                    <td>
                        <%
                            String hobbys = rs.getString("fHobby");
                            if (hobbys.equals("농구 ")) {
                                out.println("<input type=\"checkbox\" name=\"hobby\" value=\"농구\" checked>농구" +
                                        "<input type=\"checkbox\" name=\"hobby\" value=\"야구\">야구" +
                                        "<input type=\"checkbox\" name=\"hobby\" value=\"축구\">축구");
                            } else if (hobbys.equals("야구 ")) {
                                out.println("<input type=\"checkbox\" name=\"hobby\" value=\"농구\">농구" +
                                        "<input type=\"checkbox\" name=\"hobby\" value=\"야구\" checked>야구" +
                                        "<input type=\"checkbox\" name=\"hobby\" value=\"축구\">축구");
                            } else if (hobbys.equals("축구 ")) {
                                out.println("<input type=\"checkbox\" name=\"hobby\" value=\"농구\">농구" +
                                        "<input type=\"checkbox\" name=\"hobby\" value=\"야구\">야구" +
                                        "<input type=\"checkbox\" name=\"hobby\" value=\"축구\" checked>축구");
                            } else if (hobbys.equals("농구 야구 ")) {
                                out.println("<input type=\"checkbox\" name=\"hobby\" value=\"농구\" checked>농구" +
                                        "<input type=\"checkbox\" name=\"hobby\" value=\"야구\" checked>야구" +
                                        "<input type=\"checkbox\" name=\"hobby\" value=\"축구\">축구");
                            } else if (hobbys.equals("농구 축구 ")) {
                                out.println("<input type=\"checkbox\" name=\"hobby\" value=\"농구\" checked>농구" +
                                        "<input type=\"checkbox\" name=\"hobby\" value=\"야구\">야구" +
                                        "<input type=\"checkbox\" name=\"hobby\" value=\"축구\" checked>축구");
                            } else if (hobbys.equals("야구 축구 ")) {
                                out.println("<input type=\"checkbox\" name=\"hobby\" value=\"농구\">농구" +
                                        "<input type=\"checkbox\" name=\"hobby\" value=\"야구\" checked>야구" +
                                        "<input type=\"checkbox\" name=\"hobby\" value=\"축구\" checked>축구");
                            } else if (hobbys.equals("농구 야구 축구 ")) {
                                out.println("<input type=\"checkbox\" name=\"hobby\" value=\"농구\" checked>농구" +
                                        "<input type=\"checkbox\" name=\"hobby\" value=\"야구\" checked>야구" +
                                        "<input type=\"checkbox\" name=\"hobby\" value=\"축구\" checked>축구");
                            } else {
                                out.println("<input type=\"checkbox\" name=\"hobby\" value=\"농구\">농구" +
                                        "<input type=\"checkbox\" name=\"hobby\" value=\"야구\">야구" +
                                        "<input type=\"checkbox\" name=\"hobby\" value=\"축구\">축구");
                            }
                        %>
                    </td>
                </tr>
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="회원수정"></td>
                </tr>
            </table>
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
        <input type="button" onclick="location.href='index.jsp';" value="메인으로">
    </body>
</html>
