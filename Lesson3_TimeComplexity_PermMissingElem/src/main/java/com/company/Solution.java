package com.company;

/**
 * Place description here.
 *
 * @author Y08L@nykredit.dk
 */

public class Solution {
    public int solution(int[] A) {
        int sumOfAll = A.length + 1;
        int currentSum = 0;

        for (int i = 0; i < A.length; i++) {
            currentSum += A[i];
            sumOfAll += i + 1;
        }

        return sumOfAll - currentSum;
    }
}
