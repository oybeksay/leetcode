package org.solve.april;

public class April8 {

    public static void main(String[] args) {
        System.out.println("climbStairs(3) = " + climbStairs(3));
        System.out.println("climbStairs(4) = " + climbStairs(4));
        System.out.println("climbStairs(5) = " + climbStairs(5));
    }


    public static int mySqrt(int x) {
        long left = 0;
        long right = x;

        while (left <= right) {
            long middle = (left + right) / 2;

            long item = middle * middle;

            if (item == x){
                return (int) middle;
            }
            if (item > x)
                right = middle - 1;
            else {
                left = middle + 1;
            }
        }
        return (int) right;
    }


    public static int climbStairs(int n) {
        if (n == 1 || n == 2) return n;
        return fib( n - 1) + fib(n - 2);
    }

    private static int fib(int n) {
        if (n == 1 || n == 2)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
}


