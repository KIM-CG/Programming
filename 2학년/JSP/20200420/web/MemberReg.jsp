<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="regBean1" class="ch07.Member" scope="page" />
<jsp:setProperty name="regBean1" property="*" />
<jsp:setProperty name="regBean1" property="mem_phone" param="phone" />

<html>
<head>
    <title></title>
</head>
<body>
    <form action="MemberReg.jsp" method="get">
        <p>이름 : <input type="text" id="text1" name="mem_name"></p>
        <p>전화번호 : <input type="text" id="text2" name="phone"></p>
        <p>이메일 : <input type="text" id="text3" name="mem_email"></p>
        <p><input type="submit" value="확인"></p>
    </form>
    <font size="6">
        작성내용 :
        <p>이름 : <jsp:getProperty name="regBean1" property="mem_name"/></p>
        <p>전화번호 : <jsp:getProperty name="regBean1" property="mem_phone"/></p>
        <p>이메일 : <jsp:getProperty name="regBean1" property="mem_email"/></p>
    </font>

</body>
</html>
