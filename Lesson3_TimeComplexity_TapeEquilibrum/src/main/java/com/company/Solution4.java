package com.company;

/**
 * Place description here.
 *
 * @author Y08L@nykredit.dk
 */

public class Solution4 {
    public int solution(int[] A) {
        int minimum = Integer.MAX_VALUE;
        int[] firstSum = new int[A.length - 1];
        int[] lastSum = new int[A.length - 1];
        int currentSum = 0;

        for (int i = 0; i < A.length - 1; i++) {
            currentSum += A[i];
            firstSum[i] = currentSum;
        }

        currentSum = 0;
        for (int i = A.length - 1; i > 0; i--) {
            currentSum += A[i];
            lastSum[i - 1] = currentSum;
        }

        for (int i = 0; i < A.length - 1; i++) {
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
