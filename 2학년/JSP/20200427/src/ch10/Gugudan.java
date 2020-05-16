package ch10;

public class Gugudan {
    private int dan;
    private int fsize;
    private String strGugudan;

    public void setDan(int dan) {
        this.dan = dan;
    }

    public String getStrGugudan() {
        strGugudan = " <font size=" + fsize + ">";
        for (int i = 1; i <= 9; i++) {
            strGugudan += (dan + " x " + i + " = " + (dan*i) + "<br />");
        }
        strGugudan += "</font>";
        return strGugudan;
    }

    public void setFsize(int fsize) {
        this.fsize = fsize;
    }
}
