package sample2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void calculatorTest(){
        Calculator calculator = new Calculator();

        int result = calculator.add(4).add(5).subtract(3).out();

        Assertions.assertEquals(result,6);
    }
}
