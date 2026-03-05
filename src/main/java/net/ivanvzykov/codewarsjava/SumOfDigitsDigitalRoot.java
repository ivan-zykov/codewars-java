package net.ivanvzykov.codewarsjava;

// https://www.codewars.com/kata/541c8630095125aba6000c00
public class SumOfDigitsDigitalRoot {
    public int digital_root(int n) {
        if (n < 10) {
            return n;
        }

        var sum = String.valueOf(n)
                .chars()
                .map(c -> c - '0')
                .sum();

        return digital_root(sum);
    }
}
