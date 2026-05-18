package net.ivanvzykov.codewarsjava;

// https://www.codewars.com/kata/556deca17c58da83c00002db
public class TribonacciSequence {
    public double[] tribonacci(double[] s, int n) {
        var result = new double[n];

        System.arraycopy(s, 0, result, 0, Math.min(s.length, n));

        for (int i = 3; i < result.length; i++) {
            var newValue = result[i - 1] + result[i - 2] + result[i - 3];
            result[i] = newValue;
        }

        return result;
    }
}
