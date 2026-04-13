package net.ivanvzykov.codewarsjava;

// https://www.codewars.com/kata/52685f7382004e774f0001f7
public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        var min = 60;
        var hr = min * min;

        var hours = seconds / hr;
        seconds %= hr;

        var minutes = seconds / min;
        seconds %= min;

        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
