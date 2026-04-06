package org.solve.april;

public class April6 {

    public static void main(String[] args) {

    }

    public static int lengthOfLastWord(String s) {
        String[] args = s.trim().split(" ");
        return args[args.length - 1].length();
    }
}
