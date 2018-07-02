import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {

    @BeforeClass                        //выполнит 1 раз перед запуском этого класса
    public static void classInit() {
        System.out.println("Before all tests");
    }

    @Before                         //что-то перед вызовом каждого метода
    public void init() {
        System.out.println("Before each method");
    }


    @Test
    public void sum() {
        int result = Calculator.sum(5, 3);
        assertEquals(8, result);         //что ожидаем, что получаем
    }

    @Test
    public void sub() {
        assertEquals(5, Calculator.sub(10, 5));
    }

    @Test
    public void mul() {
        int result = Calculator.mul(4, 5);
        assertEquals(20, result);
    }

    @Test
    public void mulWithZero() {
        int result = Calculator.mul(0, 5);
        assertEquals(0, result);
        // assertThat(Calculator.mul(0,5).....);  //почитать, удобно с коллекцие и стрингами
    }

    @Test(timeout = 1000L)                  //лимит на выполнение теста
    public void div() throws InterruptedException {
        assertEquals(3, Calculator.div(9.0, 3.0), 0.1);
        //    Thread.sleep(1500);
    }

    @Test(expected = ArithmeticException.class)
    public void divForZero() {
        Calculator.div(0.0, 0.0);
    }


    @Test
    @Ignore                                 //игнорируется этот тест, если он пока не реализован
    public void test() throws Exception {
    }


    @Test
    public void divP() throws Exception {
        int result = Calculator.divP(5, 3);
        assertEquals(2, result);
    }


    @After                         //что-то после вызовом каждого метода
    public void afterInit() {
        System.out.println("After each method");
    }

    @AfterClass                  //выполнит 1 раз после всех методов этого класса
    public static void classAfterInit() {
        System.out.println("After all tests");
    }


}