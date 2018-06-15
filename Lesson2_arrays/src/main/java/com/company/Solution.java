package com.company;

/**
 * Place description here.
 *
 * @author Y08L@nykredit.dk
 */

public class Solution {
    public int[] solution(int[] A, int K) {
        int[] result = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            int newIndex = (i + K) % A.length;
            result[newIndex] = A[i];
        }

        return result;
    }
}