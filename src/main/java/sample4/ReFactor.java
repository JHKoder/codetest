package sample4;

import java.math.BigInteger;

public class ReFactor {
    public BigInteger factorial(int num) {
        BigInteger result = BigInteger.valueOf(1);
        for (int i = 2; i <= num; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
