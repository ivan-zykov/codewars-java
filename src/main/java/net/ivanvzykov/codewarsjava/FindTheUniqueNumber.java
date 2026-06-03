package net.ivanvzykov.codewarsjava;

//https://www.codewars.com/kata/585d7d5adb20cf33cb000235
public class FindTheUniqueNumber {
    public static double findUniq(double[] arr) {
        double common = (arr[0] == arr[1] || arr[0] == arr[2]) ? arr[0] : arr[1];

        for (double n : arr) {
            if (n != common) {
                return n;
            }
        }

        throw new IllegalArgumentException("Failed to find unique number in input array.");
    }
}
