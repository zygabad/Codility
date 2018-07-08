package com.company;

import java.util.Arrays;

/**
 * Place description here.
 *
 * @author Y08L@nykredit.dk
 */
//CODILITY 100% IN ALL SOCRES - 100 CORETNESS and 100% in PERF
public class Solution3 {
    public int solution(int[] A) {
        int result = 1;
        Arrays.sort(A);
        if (A.length == 1) {
            if (A[0] != 1) {
                return 0;
            } else {
                return 1;
            }
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
