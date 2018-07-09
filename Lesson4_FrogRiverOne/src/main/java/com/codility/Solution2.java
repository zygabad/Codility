package com.codility;

/**
 * Place description here.
 *
 * @author Y08L@nykredit.dk
 */

public class Solution2 {
    public int solution(int X, int[] A) {
        Integer[] leaves = new Integer[X];
        int maxTime = -1;

        for (int i = 0; i < A.length; i++) {
            int leafIndex = A[i] - 1;
            if (leaves[leafIndex] == null) {
                leaves[leafIndex] = i;
            }
        }

        for (Integer value : leaves){
            if (value == null){
                return -1;
            } else if (value > maxTime) {
                maxTime = value;
            }
        }

        return maxTime;
    }
}
