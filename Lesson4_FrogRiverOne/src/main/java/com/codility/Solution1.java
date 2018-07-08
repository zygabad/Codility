package com.codility;

/**
 * Place description here.
 *
 * @author Y08L@nykredit.dk
 */

public class Solution1 {
    public int solution(int X, int[] A) {
        Integer[] leafs = new Integer[X];
        int max = -1;

        for (int i = 0; i < A.length; i++) {
            int leafPosition = A[i];
            if ((leafs[leafPosition - 1] == null) && (A[i] <= X && A[i] > 1)) {
                leafs[leafPosition - 1] = i;
            }
        }

        for (Integer value : leafs) {
            if ((value != null)&&(value + 1 > max)) {
                    max = value;
                }
            }

        return max;
    }

    }


