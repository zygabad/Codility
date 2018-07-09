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
            if (leafPosition <= X && leafPosition >= 1) {
                if ((leafs[leafPosition - 1] == null)) {
                    leafs[leafPosition - 1] = i;
                }
            }
        }

        if (X <= A.length ) {
            for (Integer value : leafs) {
                if ((value != null) && (value + 1 > max)) {
                    max = value;
                } else {
                    max = -1;
                }
            }
        }

        return max;
    }

}


