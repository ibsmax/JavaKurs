package Task5.operations;

import Task5.Calculator;

public class Addition extends Calculator {


    public static void setPer1(Double per1) {
        Calculator.per1 = per1;
    }

    public static void setPer2(Double per2) {
        Calculator.per2 = per2;
    }

    public static Double getResult(Double per1, Double per2) {
        return getPer1() + getPer2();
    }

    public Addition(Double per1, Double per2) {
        super(per1, per2);
    }
}
