package net.ivanvzykov.codewarsjava;

// https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec
public class PersistentBugger {
    public static int persistence(long n) {
        int count = 0;

        while (n >= 10) {
            long multiplication = 1L;

            while (n > 0) {
                multiplication *= n % 10L;
                n /= 10;
            }

            n = multiplication;
            count++;
        }

        return count;
    }
}
