package net.ivanvzykov.codewarsjava;

// https://www.codewars.com/kata/5541f58a944b85ce6d00006a
public class ProductOfConsecutiveFibNumbers {
    public static long[] productFib(long prod) {
        long a = 0L;
        long b = 1L;

        while (a * b < prod) {
            b += a;
            a = b - a;
        }

        long isEqual = a * b == prod ? 1L : 0L;

        return new long[]{a, b, isEqual};
    }
}
