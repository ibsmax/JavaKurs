import Task5.Calculator;
import org.junit.Assert;
import org.junit.Test;

import java.util.InputMismatchException;

import static Task5.Calculator.*;

public class ExceptionTest {
    @Test(expected = NullPointerException.class)
    public void NullPointerExceptionTest() {
        Double a = null;
        Double b = null;
        GetResultAdditional(a, b);
    }
}
