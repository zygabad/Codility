package com.company;

import java.util.Arrays;

/**
 * Place description here.
 *
 * @author Y08L@nykredit.dk
 */
//refactoring Sulution 4
public class Solution7 {
    public int solution(int[] A) {
        Arrays.sort(A);
        int N = A.length;

        if (A[0] != 1 || A[N - 1] != N) {
            return 0;
        }

        for (int i = 0; i < N - 1; i++) {
            if (A[i] + 1 != A[i + 1]) {
                return 0;
            }
        }

        return 1;
    }
}
