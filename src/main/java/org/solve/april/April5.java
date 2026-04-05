package org.solve.april;

public class April5 {

    public static void main(String[] args) {
        System.out.println("strStr(\"mississippi\", \"issip\") = " + strStr("aaaaab", "aaab"));
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

}
