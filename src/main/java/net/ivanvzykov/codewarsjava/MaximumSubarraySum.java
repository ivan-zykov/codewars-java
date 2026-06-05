package net.ivanvzykov.codewarsjava;

//https://www.codewars.com/kata/54521e9ec8e60bc4de000d6c
public class MaximumSubarraySum {
    public static int sequenceSlow(int[] arr) {
        int maxSum = 0;

        int windowSize = arr.length;

        while (windowSize >= 1) {

            for (int i = 0; i + windowSize <= arr.length; i++) {
                int sum = 0;

                for (int j = i; j < i + windowSize; j++) {
                    sum += arr[j];
                }

                if (sum > maxSum) {
                    maxSum = sum;
                }
            }

            windowSize--;
        }

        return maxSum;
    }

    /**
     * Kadane’s algorithm
     */
    public static int sequence(int[] arr) {
        int maxSum = 0;
        int currSum = 0;

        for (int n : arr) {
            currSum = Math.max(0, currSum + n);
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }
}
