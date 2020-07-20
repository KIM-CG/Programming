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
            request.setCharacterEncoding("utf8");

            String id = request.getParameter("id");
            String passwd = request.getParameter("passwd");

            Connection conn = null;
            PreparedStatement pstmt=null;
            try{
                Context initCix = new InitialContext();
                Context envCix = (Context)initCix.lookup("java:comp/env");
                DataSource ds = (DataSource)envCix.lookup("jdbc/basicjsp");
                conn = ds.getConnection();

                String sql= "delete from `member2` where fUserId=? and fPasswd=?";
                pstmt=conn.prepareStatement(sql);
                pstmt.setString(1, id);
                pstmt.setString(2, passwd);
                pstmt.execute();
                response.sendRedirect("./memberList.jsp");
            }catch(Exception e){
                out.println("Exception : "+ e.getMessage());
            }finally{
                if(pstmt != null) try{pstmt.close();}catch(SQLException sqle){}
                if(conn != null) try{conn.close();}catch(SQLException sqle){}
            }
        %>
    </body>
</html>
