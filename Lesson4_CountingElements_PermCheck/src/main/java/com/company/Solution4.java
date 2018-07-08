package com.company;

import java.util.Arrays;

/**
 * Place description here.
 *
 * @author Y08L@nykredit.dk
 */

public class Solution4 {
    public int solution(int[] A) {
        Arrays.sort(A);
        int N = A.length;

        if (A[0] == 1 && A[N - 1] == N) {
            if (N == 1) {
                return 1;
            }

            for (int i = 0; i < N - 1; i++) {
                if (A[i] + 1 != A[i + 1]) {
                    return 0;
                }
            }

            return 1;
        }

        return 0;
    }
}
