package com.codility;

public class Solution4 {
    public int[] solution(String S, int[] P, int[] Q) {
        int[] result = new int[P.length];
        char[] charArray = S.toCharArray();
        int[] digits = new int[charArray.length];
        int[] sums = new int[charArray.length];
        int sumCounter = 0;

        for (int i = 0; i < charArray.length; i++) {
            char letter = charArray[i];

            switch (letter) {
                case 'A':
                    digits[i] = 1;
                    sumCounter = sumCounter + 1;
                    sums[i] = sumCounter;
                    break;
                case 'C':
                    digits[i] = 2;
                    sumCounter = sumCounter + 2;
                    sums[i] = sumCounter;
                    break;
                case 'G':
                    digits[i] = 3;
                    sumCounter = sumCounter + 3;
                    sums[i] = sumCounter;
                    break;
                case 'T':
                    digits[i] = 4;
                    sumCounter = sumCounter + 4;
                    sums[i] = sumCounter;
                    break;
            }
        }


        for (int i = 0; i < P.length; i++) {
            //String tempString = S;
            //  tempString = tempString.substring(P[i], Q[i] + 1);
            int min = Integer.MAX_VALUE;
            int sliceRange = Q[i] - P[i];
            for (int j = 0; j <= sliceRange ; j++) {
                if (digits[Q[i]-j] <= min) {
                    min = digits[Q[i]-j];
                }
            }
            result[i] = min;

        }
        return result;
    }
}
