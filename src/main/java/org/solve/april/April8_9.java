package org.solve.april;

import java.util.HashMap;
import java.util.Map;

public class April8_9 {

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

        if (n == 1 || n == 2 || n == 3)
            return n;

        Map<Integer, Integer> ks = new HashMap<>();

        for (int i = 1; i < n; i++) {
            if (i == 1 || i == 2 || i == 3)
                ks.put(i, i);
            else {
                Integer item1 = ks.get(i - 1);
                Integer item2 = ks.get(i - 2);
                ks.put(i, item1 + item2);
            }
        }

        return ks.get(n - 1) + ks.get(n - 2);
    }


}


