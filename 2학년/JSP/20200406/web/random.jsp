<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="random.jsp">
        
    </form>
    <%
        String[] arrName = {"대", "혀", "니", "짭", "짭", "이"};
        String[] color = {"red", "blue", "green", "yellow", "black"};
        int index1 = (int) Math.floor(Math.random()*arrName.length);
        int index2 = (int) Math.floor(Math.random()*color.length);
    %>
    <span style="font-size : 50px; color:<%=color[index2]%>"><%=arrName[index1]%></span>
</body>
</html>
