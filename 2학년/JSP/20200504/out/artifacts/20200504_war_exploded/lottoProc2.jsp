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

                boolean isFirst = true;
                for (int j = 0; j < lotto.length; j++) {
                    if (num == lotto[j]) {
                        isFirst = false;
                    }
                }
                if (isFirst == true) {
                    lotto[i] = num;
                } else {
                    i--;
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
