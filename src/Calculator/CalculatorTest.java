package Calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by fabalcu97 on 05/04/17.
 */
public class CalculatorTest {
    @Test
    public void div() throws Exception {
        Calculator tester = new Calculator();
        assertEquals(0, tester.div(10, 0));

    }

    @Test
    public void mult() throws Exception {
        Calculator tester = new Calculator();
        assertEquals(156.54999999999998, tester.mult(10.1, 15.5));

    }
}