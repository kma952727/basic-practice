package typecasting;

import java.math.BigDecimal;

public class Operation {
    public static void main(String[] args)
    {
        System.out.println(overflowCheck(Integer.MAX_VALUE -1, Integer.MAX_VALUE -1));

    }

    static int overflowCheck(int a, int b)
    {
        long result = (long)a + (long)b;
        if((int)result != result)
            throw new RuntimeException("overflow value");
        return (int)result;
    }

    static void overflowCheck2(int a, int b)
    {
        try {
            int result = Math.multiplyExact(a, b);
        }catch (ArithmeticException ex) {
            // too big
        }
    }
}