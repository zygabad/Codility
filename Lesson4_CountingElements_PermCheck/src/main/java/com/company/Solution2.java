package com.company;

import java.util.Arrays;

/**
 * Place description here.
 *
 * @author Y08L@nykredit.dk
 */
//CODILITY CORETNESS 66% PERF 100% ALL 83%. Wrong: extreme_min_max , single element got 1 expected 0
public class Solution2 {
    public int solution(int[] A) {
        int result = 1;
        Arrays.sort(A);
        if (A.length == 1) {
            return 1;
        }
        if (A[0] == 1 && A[A.length - 1] == A.length) {
            for (int i = 0; i < A.length - 1; i++) {
                if (A[i] + 1 != A[i + 1]) {
                    return 0;
                }
            }
            if (A[A.length - 1] != A[A.length - 2] + 1) {
                return 0;
            }

        } else {
            return 0;
        }

        return result;
    }
}
