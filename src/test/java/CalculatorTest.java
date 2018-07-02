import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void sum() {
        int result = Calculator.sum(5,3);
        assertEquals(8,result);         //что ожидаем, что получаем
    }

    @Test
    public void sub() {


    }

    @Test
    public void mul() {
        int result = Calculator.mul(4,5);
        assertEquals(20,result);
    }
    @Test
    public void mulWithZero() {
        int result = Calculator.mul(0,5);
        assertEquals(0,result);
    }

    @Test
    public void div() {
    }

    @Test(expected = ArithmeticException.class)
    public void divForZero() {
        Calculator.div(0.0,0.0);
    }
}