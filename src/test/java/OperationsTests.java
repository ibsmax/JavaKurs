import Task5.Calculator;
import org.junit.Assert;
import org.junit.Test;

import static Task5.Calculator.*;

public class OperationsTests {
    @Test
    public void AdditionResultTest() {
        per1 = 10.0;
        per2 = 5.0;
        Assert.assertEquals(15.0, GetResultAdditional(per1, per2), 0);
    }

    @Test
    public void SubtractionResultTest() {
        per1 = 10.0;
        per2 = 5.0;
        Assert.assertEquals(5.0, GetResultSubstraction(per1, per2), 0);
    }

    @Test
    public void MultiplicationResultTest() {
        per1 = 10.0;
        per2 = 5.0;
        Assert.assertEquals(50.0, GetResultMultiplication(per1, per2), 0);
    }

    @Test
    public void DivisionResultTest() {
        per1 = 10.0;
        per2 = 5.0;
        Assert.assertEquals(2.0, GetResultDivision(per1, per2), 0);
    }

    @Test
    public void DivisionZeroTest() {
        per1 = 10.0;
        per2 = 0.0;
        if (per2 == 0.0) {
            System.out.println("Попытка деления на ноль!");
        }
        Assert.assertEquals(true, GetResultDivision(per1, per2));
    }
}
