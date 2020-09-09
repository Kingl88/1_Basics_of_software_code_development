package Tasks;

import java.math.BigInteger;

public class Task34 {
    public static BigInteger multiply() {
        BigInteger sum = BigInteger.ONE;
        for (int i = 1; i <= 200; i++) {
            sum=sum.multiply(BigInteger.valueOf(i*i));
        }
        return sum;
    }
}
