import Task5.operations.Addition;
import Task5.operations.Division;
import Task5.operations.Multiplication;
import Task5.operations.Subtraction;
import org.junit.Assert;
import org.junit.Test;

import static Task5.Calculator.*;

public class OperationsTests {
    @Test
    public void AdditionResultTest() {
        per1 = 10.0;
        per2 = 5.0;
        Assert.assertEquals(15.0, Addition.getResult(per1, per2), 0);
    }
    @Test
    public void SubtractionResultTest() {
        per1 = 10.0;
        per2 = 5.0;
        Assert.assertEquals(5.0, Subtraction.getResult(per1, per2), 0);
    }
    @Test
    public void MultiplicationResultTest() {
        per1 = 10.0;
        per2 = 5.0;
        Assert.assertEquals(50.0, Multiplication.getResult(per1, per2), 0);
    }
    @Test
    public void DivisionResultTest() {
        per1 = 10.0;
        per2 = 5.0;
        Assert.assertEquals(2.0, Division.getResult(per1, per2), 0);
    }
}
