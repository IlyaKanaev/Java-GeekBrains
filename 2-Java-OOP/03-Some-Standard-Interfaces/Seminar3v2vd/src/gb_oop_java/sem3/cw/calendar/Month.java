package gb_oop_java.sem3.cw.calendar;

public enum Month {
    JAN(1),
    FEB(2),
    MAR(3),
    APR(4),
    MAY(5),
    JUN(6),
    JUL(7),
    AVG(8),
    SEP(9),
    OKT(10),
    NOV(11, "Ноябрь"),
    DEC(12, "Декабрь");

    private int number;

    private String ruName;

    Month(int number) {
        this.number = number;
    }

    Month() {
    }

    Month(int number, String ruName) {
        this.number = number;
        this.ruName = ruName;
    }

    public int getNumber() {
        return number;
    }

    public String getRuName() {
        return ruName;
    }
}
