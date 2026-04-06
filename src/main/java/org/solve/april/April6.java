package org.solve.april;

import java.util.Arrays;

public class April6 {

    public static void main(String[] args) {
        System.out.println("plusOne(new int[]{1, 2, 3}) = " + Arrays.toString(plusOne(new int[]{0})));
        System.out.println("plusOne(new int[]{1, 2, 4, 9}) = " + Arrays.toString(plusOne(new int[]{1, 2, 4, 9})));
        System.out.println("plusOne(new int[]{1, 9, 9, 9}) = " + Arrays.toString(plusOne(new int[]{1, 9, 9, 9})));

    }

    public static int lengthOfLastWord(String s) {
        String[] args = s.trim().split(" ");
        return args[args.length - 1].length();
    }

    public static int[] plusOne(int[] digits) {
        int carry = 1;

        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == 0 && digits[i] == 9 && carry == 1) {
                int[] newDigits = new int[digits.length + 1];
                newDigits[0] = 1;
                return newDigits;
            }
            int result = digits[i] + carry;
            if (result < 10) {
                carry = 0;
                digits[i] = result;
            }else {
                carry = 1;
                digits[i] = 0;
            }
        }
        return digits;
    }

}
