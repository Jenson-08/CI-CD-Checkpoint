import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        double result = calculator.sum(5, 3);
        Assert.assertEquals(result, 8.0);
    }

    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();
        double result = calculator.subtraction(5, 3);
        Assert.assertEquals(result, 2.0);
    }

    @Test
    public void testMultiplication() {
        Calculator calculator = new Calculator();
        double result = calculator.multiplication(5, 3);
        Assert.assertEquals(result, 15.0);
    }

    @Test
    public void testDivision() {
        Calculator calculator = new Calculator();
        double result = calculator.division(6, 3);
        Assert.assertEquals(result, 2.0);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivisionByZero() {
        Calculator calculator = new Calculator();
        calculator.division(6, 0);
    }
}
