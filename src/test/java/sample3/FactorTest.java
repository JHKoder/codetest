package sample3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorTest {

    @Test
    void factor(){
        Factor factor = new Factor();

        long result = factor.factorial(4);

        Assertions.assertEquals(result,24);
    }
}
