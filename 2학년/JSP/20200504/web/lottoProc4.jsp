<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title></title>
    </head>
    <body>
        <%
            int startnum = Integer.parseInt(request.getParameter("start"));
            int endnum = Integer.parseInt(request.getParameter("end"));
            int loopnum = Integer.parseInt(request.getParameter("num"));
            int maxCount = (endnum-startnum+1);
            if (maxCount <= loopnum) {

            }
            ArrayList<Integer> ar = new ArrayList<>();

            for (int i = 0; i < 6; i++) {
                int rannum = (int) (Math.random()*45+1);
                if (ar.contains(rannum)) {
                    i--;
                } else {
                    ar.add(rannum);
                }
            }

            for (int data:ar) {
                out.println(data + ", ");
            }
        %>
    </body>
</html>
