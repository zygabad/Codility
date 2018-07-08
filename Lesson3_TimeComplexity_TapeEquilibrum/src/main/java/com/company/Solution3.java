package com.company;

/**
 * Place description here.
 *
 * @author Y08L@nykredit.dk
 */

public class Solution3 {
    public int solution(int[] A) {
        int minimum = Integer.MAX_VALUE;

        for (int i = 0; i < A.length - 1; i++) {
            int sumFirstPart = countFirstSum(A, i + 1);
            int sumLastPart = countLastSum(A, i + 1);
            int diff = Math.abs(sumFirstPart - sumLastPart);
            if (diff < minimum){
                minimum = diff;
            }

            if (minimum == 0) {
                return minimum;
            }
        }

        return minimum;
    }

    private int countFirstSum(int[] A, int p) {
        int sum = 0;
        for (int i = 0; i < p; i++) {
            sum += A[i];
        }

        return sum;
    }

    private int countLastSum(int[] A, int p) {
        int sum = 0;
        for (int i = 0; i < A.length - p; i++) {
            sum += A[p + i];
        }

        return sum;
    }

}
