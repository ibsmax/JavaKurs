package Task5;

public class Calculator {
    public static Double per1;
    public static Double per2;

    public static void setPer1(Double per1) {
        Calculator.per1 = per1;
    }

    public static void setPer2(Double per2) {
        Calculator.per2 = per2;
    }

    public static Double getPer1(){
        return per1;
    }

    public static Double getPer2(){
        return  per2;
    }

    public static Double GetResultAdditional(Double per1, Double per2) {
        return per1 + per2;
    }

    public static Double GetResultMultiplication(Double per1, Double per2) {
        return per1 * per2;
    }

    public static Double GetResultSubstraction(Double per1, Double per2) {
        return per1 - per2;
    }

    public static Double GetResultDivision(Double per1, Double per2) {
        return per1 / per2;
    }

}
