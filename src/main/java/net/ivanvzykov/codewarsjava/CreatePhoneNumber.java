package net.ivanvzykov.codewarsjava;

// https://www.codewars.com/kata/525f50e3b73515a6db000b83
public class CreatePhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        var leftGroup = new StringBuilder();
        for (int i = 0; i <= 2; i++) {
            leftGroup.append(numbers[i]);
        }

        var midGroup = new StringBuilder();
        for (int i = 3; i <= 5; i++) {
            midGroup.append(numbers[i]);
        }

        var rightGroup = new StringBuilder();
        for (int i = 6; i <= 9; i++) {
            rightGroup.append(numbers[i]);
        }

        return String.format("(%s) %s-%s", leftGroup, midGroup, rightGroup);
    }
}
