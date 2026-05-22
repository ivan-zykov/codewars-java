package net.ivanvzykov.codewarsjava;

// https://www.codewars.com/kata/5552101f47fc5178b1000050
public class PlayingWithDigits {
    public static long digPow(int n, int p) {
        int countOfDigits = (int) Math.log10(n) + 1;

        int nCopy = n;

        double sumOfPowers = 0L;
        while (n > 0) {
            int digit = n % 10;
            sumOfPowers += Math.pow(digit, p + countOfDigits - 1);
            n /= 10;
            countOfDigits--;
        }

        return sumOfPowers % nCopy == 0 ? (long) sumOfPowers / nCopy : -1;
    }
}
