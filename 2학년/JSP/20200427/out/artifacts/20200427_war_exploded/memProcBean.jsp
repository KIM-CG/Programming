<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<jsp:useBean id="member" class="ch10.Member" />
<jsp:setProperty name="member" property="*" />

아이디 : <jsp:getProperty name="member" property="id" /><br />
비밀번호 : <jsp:getProperty name="member" property="pwd" /><br />
성별 : <jsp:getProperty name="member" property="gender" /><br />
학과 : <jsp:getProperty name="member" property="department" /><br />
취미 : <jsp:getProperty name="member" property="strhobby" /><br />

</body>
</html>
