<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <h1>d.jsp</h1>
        <%
            /*
                <jsp:forward> (ActionTag) :
                    1. request에 담겨있는 값을 사용할 수 있다.
                    2. 이동한 url이 보이지 않기 때문에 사용자는 확인할 수 없다.
                response.sendRedirect (Java Response) :
                    1. requset에 담겨있는 값을 사용할 수 없다. ( 새로 만들어진다. )
                    2. 이동한 url이 보이기 때문에 사용자가 확인할 수 있다.

             */
            response.sendRedirect("e.jsp");
        %>

        <jsp:forward page="e.jsp" ></jsp:forward>
    </body>
</html>
