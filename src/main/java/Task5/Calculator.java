package Task5;

public abstract class Calculator {
    public static Double per1;
    public static Double per2;

    public Calculator(Double per1, Double per2) {
        this.per1 = per1;
        this.per2 = per2;
    }

    public static Double getPer1() {
        return per1;
    }
    public static Double getPer2() {
        return per2;
    }

}
