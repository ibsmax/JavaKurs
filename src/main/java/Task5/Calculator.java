package Task5;

public abstract class Calculator {
    public static Double per1;
    public static Double per2;

    public static Double getPer1() {
        return per1;
    }

    public static Double getPer2() {

        return per2;
    }

    public Calculator(Double per1, Double per2) {
        this.per1 = per1;
        this.per2 = per2;
    }

    public static Double GetResultAdditional(Double per1, Double per2) {

        return getPer1() + getPer2();
    }

    public static Double GetResultMultiplication(Double per1, Double per2) {
        return getPer1() * getPer2();
    }

    public static Double GetResultSubstraction(Double per1, Double per2) {
        return getPer1() - getPer2();
    }

    public static Double GetResultDivision(Double per1, Double per2) {
        return getPer1() / getPer2();
    }
}
