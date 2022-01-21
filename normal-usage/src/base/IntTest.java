package base;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class IntTest {
    public static void main(String[] args) {
        int a = 1;
        double b = 1d;
        float c = 1f;
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b == c);
        System.out.println(a + b + c);
        System.out.println("========");
        BigDecimal aa = new BigDecimal("1");
        BigDecimal ab = new BigDecimal("2.1");
        System.out.println(aa.add(ab));
        System.out.println(aa.subtract(ab));
        System.out.println(aa.multiply(ab));
        System.out.println(aa.divide(ab, 2, RoundingMode.HALF_UP));
//        System.out.println(aa.divide(ab, 2, BigDecimal.ROUND_HALF_UP));
    }
}
