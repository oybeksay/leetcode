package org.solve.april;

public class April14 {

    public static void main(String[] args) {
        System.out.println("isPowerOfTwo(10) = " + isPowerOfTwo(10));
        System.out.println("isPowerOfTwo(8) = " + isPowerOfTwo(8));
    }


    public static boolean isPowerOfTwo(int n) {
        if (n == 2 || n == 1) return true;

        while (n > 2) {
            if (n % 2 != 0)
                return false;

            n /= 2;

            if (n == 2)
                return true;
        }
        return false;
    }

}
