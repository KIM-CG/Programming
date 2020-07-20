<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Main</title>
    </head>
    <body>
        <form action="memberDeleteProc.jsp">
            <%
                request.setCharacterEncoding("utf8");
                try {
                    String id = request.getParameter("id");
                    String passwd = request.getParameter("passwd");
                    if (id.isEmpty() || passwd.isEmpty()) {
            %>
                        아이디 : <input type="text" name="id"><br>
                        비밀번호 : <input type="password" name="passwd">
            <%
                    } else {
            %>
                        아이디 : <input type="text" name="id" value="<%=request.getParameter("id")%>"><br>
                        비밀번호 : <input type="password" name="passwd" value="<%=request.getParameter("passwd")%>">
            <%
                    }
                } catch(Exception e) {
            %>
                아이디 : <input type="text" name="id"><br>
                비밀번호 : <input type="password" name="passwd">
            <%
                }
            %>
            <br><input type="submit" value="회원삭제">
        </form>
        <input type="button" onclick="location.href='index.jsp';" value="메인으로">
    </body>
</html>
