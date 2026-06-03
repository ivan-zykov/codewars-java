package net.ivanvzykov.codewarsjava;

import java.util.Arrays;

//https://www.codewars.com/kata/578aa45ee9fd15ff4600090d
public class SortTheOdd {
    public static int[] sortArray(int[] array) {
        int countOfOdds = 0;
        for (int i : array) {
            if (i % 2 != 0) {
                countOfOdds++;
            }
        }

        var indexesOfOdds = new int[countOfOdds];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                indexesOfOdds[j++] = i;
            }
        }

        var arrayOfOddsSorted = new int[indexesOfOdds.length];
        for (int i = 0; i < indexesOfOdds.length; i++) {
            arrayOfOddsSorted[i] = array[indexesOfOdds[i]];
        }

        Arrays.sort(arrayOfOddsSorted);

        j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = arrayOfOddsSorted[j++];
            }
        }

        return array;
    }
}
