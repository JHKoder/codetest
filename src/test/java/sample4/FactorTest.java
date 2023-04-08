package sample4;


import org.junit.jupiter.api.Test;

import java.math.BigInteger;

public class FactorTest {

    @Test
    void factor(){
        ReFactor factor = new ReFactor();

        BigInteger result = factor.factorial( BigInteger.valueOf(1_000_000));

        System.out.println(result);
    }
}
