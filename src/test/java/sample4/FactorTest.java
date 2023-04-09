package sample4;


import org.junit.jupiter.api.Test;

import java.math.BigInteger;

public class FactorTest {

    @Test
    void factor(){
        ReFactor factor = new ReFactor();

        System.out.println(factor.factorial(1_000_000));
    }
}
