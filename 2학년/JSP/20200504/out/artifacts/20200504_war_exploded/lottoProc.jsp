<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title></title>
    </head>
    <body>
        <%
            int[] lotto = new int[6];
            String strLotto = "";
            for (int i = 0; i < lotto.length; i++) {
                int num = (int) (Math.random()*45+1);
                lotto[i] = num;
                for (int j = 0; j < i; j++) {
                    if (num == lotto[j]) {
                        i--;
                        break;
                    }
                }
            }

            for (int data:lotto) {
                strLotto += data + " ";
            }
        %>
        <font size="6">
            <%=strLotto%>
        </font>
    </body>
</html>
