package net.ivanvzykov.codewarsjava;

// https://www.codewars.com/kata/5287e858c6b5a9678200083c
public class DoesMyNumberLookBigInThis {
    public static boolean isNarcissistic(int number) {
        int numOfDigits = 0;

        int numberCopy = number;

        while (numberCopy > 0) {
            numOfDigits++;
            numberCopy /= 10;
        }

        double sumOfPowers = 0;

        numberCopy = number;

        while (numberCopy > 0) {
            sumOfPowers += Math.pow(numberCopy % 10, numOfDigits);
            numberCopy /= 10;
        }

        return (int) sumOfPowers == number;
    }
}
