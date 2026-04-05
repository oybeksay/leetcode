package org.solve.april;

public class April5 {

    public static void main(String[] args) {
        System.out.println("searchInsert(new int[]{1, 2, 3, 4, 5, 6},  7) = " + searchInsert(new int[]{1, 2, 3, 5, 6}, 4));
    }


    public static int strStr(String haystack, String needle) {
        int trustedCount = 0;
        int startIndex = 0;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(trustedCount)) {
                trustedCount++;
                if (trustedCount == needle.length())
                    return i - (trustedCount - 1);
            }else {
                startIndex++;
                i = startIndex - 1;
                trustedCount = 0;
            }
        }
        return -1;
    }

    public static int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int m = (r + l) / 2;
            if (nums[m] == target)
                return m;
            else if (nums[m] > target) {
                r = m - 1;
            }
            else {
                l = m + 1;
            }
        }

        return l;
    }
}
