package com.company;

/**
 * Place description here.
 *
 * @author Y08L@nykredit.dk
 */

public class Solution5 {
    public int solution(int[] A) {
        int minimum = Integer.MAX_VALUE;
        int N = A.length - 1;
        int[] firstSum = new int[N];
        int[] lastSum = new int[N];
        int currentSumFirst = 0;
        int currentSumLast = 0;

        for (int i = 0; i < N; i++) {
            currentSumFirst += A[i];
            firstSum[i] = currentSumFirst;
            currentSumLast += A[N - i];
            lastSum[N - 1 - i] = currentSumLast;
        }

        for (int i = 0; i < N; i++) {
            int diff = Math.abs(firstSum[i] - lastSum[i]);
            if (diff < minimum) {
                minimum = diff;
            }

            if (minimum == 0) {
                return minimum;
            }
        }

        return minimum;
    }

}
