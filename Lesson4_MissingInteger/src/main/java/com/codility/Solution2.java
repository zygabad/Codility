package com.codility;

import java.util.Arrays;

/**
 * Place description here.
 *
 * @author Y08L@nykredit.dk
 */

public class Solution2 {
    public int solution(int[] A) {

        Arrays.sort(A);

        for (int i = 0; i < A.length; i++) {
            if (i < A.length - 1 && A[i] > 0) {
                if (A[i + 1] != A[i] && A[i + 1] - 1 != A[i]) {
                    return A[i] + 1;
                }
            }
        }

        if (A[A.length - 1] <= 0) {
            return 1;
        }
        return A[A.length - 1] + 1;
    }
}