package com.thilaka.a.introduction.to.array.c.plus.one;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(Arrays.toString(main.plusOne(new int[]{9,9,9})));
    }
    public int[] plusOne(int[] digits) {
        int inputLength = digits.length;

        for (int i = inputLength - 1; i >= 0; i--) {
            digits[i] = digits[i] + 1;
            if (digits[i] > 9) {
                digits[i] = 0;
            } else {
                return digits;
            }
        }
        int[] newDigits = new int[inputLength + 1];
        newDigits[0] = 1;
        for (int i = 0; i < inputLength; i++) {
            newDigits[i + 1] = digits[i];
        }
        return newDigits;

    }
}
