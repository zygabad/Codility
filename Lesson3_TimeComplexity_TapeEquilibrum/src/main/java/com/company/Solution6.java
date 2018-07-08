package com.company;

/**
 * Place description here.
 *
 * @author Y08L@nykredit.dk
 */

public class Solution6 {
    public int solution(int[] A) {
        int minimum = Integer.MAX_VALUE;
        int N = A.length - 1;
        int[] firstSum = new int[N];
        int[] lastSum = new int[N];
        firstSum[0] = A[0];
        lastSum[N - 1] = A[N];

        for (int i = 1; i < N; i++) {
            firstSum[i] = firstSum[i - 1] + A[i];
            lastSum[N - 1 - i] = lastSum[N - i] + A[N - i];
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
