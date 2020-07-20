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
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        String department = request.getParameter("department");
        String [] hobbys = request.getParameterValues("hobby");
        String hobby = "";
        for (int i = 0; i < hobbys.length; i++) {
            hobby += (hobbys[i] + " ");
        }
        Timestamp register=new Timestamp(System.currentTimeMillis());

        Connection conn = null;
        PreparedStatement pstmt=null;
        try{
            Context initCix = new InitialContext();
            Context envCix = (Context)initCix.lookup("java:comp/env");
            DataSource ds = (DataSource)envCix.lookup("jdbc/basicjsp");
            conn = ds.getConnection();

            String sql= "insert into member2 (fUserId, fPasswd, fUserName, fSex, fDepartment, fHobby, fRegdate) values (?,?,?,?,?,?,?)";
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1, id);
            pstmt.setString(2,passwd);
            pstmt.setString(3,name);
            pstmt.setString(4,gender);
            pstmt.setString(5,department);
            pstmt.setString(6,hobby);
            pstmt.setTimestamp(7,register);
            pstmt.executeUpdate();
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
