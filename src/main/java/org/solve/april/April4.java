package org.solve.april;

import java.util.Arrays;

public class April4 {

    public static void main(String[] args) {
//        int[] nums = {1, 1, 2};
//        System.out.println("removeDuplicates(nums) = " + removeDuplicates(nums));
//        System.out.println("nums = " + Arrays.toString(nums));


        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println("removeElement(new int[]{0,1,2,2,3,0,4,2}, 2) = " + removeElement(nums, 2));
        System.out.println("nums = " + Arrays.toString(nums));

    }


    public static int removeDuplicates(int[] nums) {
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }


    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
