package net.ivanvzykov.codewarsjava;

// https://www.codewars.com/kata/5679aa472b8f57fb8c000047
public class EqualSidesOfAnArray {
    public static int findEvenIndex(int[] arr) {
        long sumLeft = 0L;
        long sumRight = 0L;

        for (int num : arr) {
            sumRight += num;
        }

        for (int i = 0; i < arr.length; i++) {
            sumRight -= arr[i];
            if (sumLeft == sumRight) {
                return i;
            }
            sumLeft += arr[i];
        }

        return -1;
    }
}
