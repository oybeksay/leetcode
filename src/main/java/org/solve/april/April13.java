package org.solve.april;

public class April13 {


    public static void main(String[] args) {

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int nMinIndex = 0;


        int index = 0;
        while (nMinIndex == n) {
            int num = nums1[index];

            if (num > nMinIndex) {
                // 1. nMinIndexni index ga set qilish
                // 2. qolgan itemlarni 1 qadam o'ngga surish
                // 3. mMinIndexni 1 ga oshirish


                nMinIndex++;
            }

            index++;
        }


    }
}
