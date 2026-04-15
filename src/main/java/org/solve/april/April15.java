package org.solve.april;


public class April15 {

    public static void main(String[] args) {

        System.out.println("c === " + closestTarget(new String[]{"hsdqinnoha","mqhskgeqzr","zemkwvqrww","zemkwvqrww","daljcrktje","fghofclnwp","djwdworyka","cxfpybanhd","fghofclnwp","fghofclnwp"}, "zemkwvqrww", 8));

    }


    public static int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int minDis = -1;

        for (int i = 0; i < n; i++) {
            if (words[i].equals(target)) {
                int straightDist = Math.abs(i - startIndex);

                int circularDist = n - straightDist;

                int currentMin = Math.min(straightDist, circularDist);

                if (minDis == -1 || currentMin < minDis) {
                    minDis = currentMin;
                }
            }
        }

        return minDis;
    }


}
