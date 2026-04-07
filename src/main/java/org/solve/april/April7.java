package org.solve.april;

public class April7 {

    public static void main(String[] args) {
        System.out.println("addBinary(\"11\", \"1\") = " + addBinary("11", "1"));
        System.out.println("addBinary(\"1010\", \"1011\") = " + addBinary("1010", "1011"));
        System.out.println("addBinary(\"0\", \"0\") = " + addBinary("0", "0"));
    }


    public static String addBinary(String a, String b) {
        StringBuilder builder = new StringBuilder();

        char carry = '0';

        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry == '1') {
            char charA = '0';
            char charB = '0';

            if (i >= 0) {
                charA = a.charAt(i);
            }

            if (j >= 0) {
                charB = b.charAt(j);
            }

            int digitA = charA - '0';
            int digitB = charB - '0';
            int sum = digitA + digitB + (carry - '0');


            if (sum == 3) {
                builder.append("1");
                carry = '1';
            }
            if (sum == 2){
                builder.append("0");
                carry = '1';
            }

            if (sum == 1){
                builder.append("1");
                carry = '0';
            }
            if (sum == 0){
                builder.append("0");
                carry = '0';
            }

            i--;
            j--;
        }

        return builder.reverse().toString();
    }

}
