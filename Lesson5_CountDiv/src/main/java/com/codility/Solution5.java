package com.codility;

/**
 * Place description here.
 *
 * @author Y08L@nykredit.dk
 */
//CODILITY 100 100 100!!!
public class Solution5 {
    public int solution(int A, int B, int K) {
        int ADivider = A / K;
        int BDivider = B / K;
        if (A == 0) {
            return BDivider + 1;
        }
        if (B == 0) {
            return 1;
        }
        if (K >= A && K <= B) {
            return BDivider;
        }
        if (K < A) {
            if (A % K == 0) {
                return BDivider - ADivider + 1;
            } else {
                return BDivider - ADivider;
            }

        }

        return 0;
    }

}
