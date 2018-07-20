package com.codility;

/**
 * Place description here.
 *
 * @author Y08L@nykredit.dk
 */
//CODILITY 87 100 75
public class Solution4 {
    public int solution(int A, int B, int K) {
        int foundDivisibleNumber = 0;
        int lowestADivider = 0;
        int lowestBDivider = 0;
        if (K >= A && K <= B) {
            if (A / K == 0 && A != 0) {
                return B / K;
            }
            if (A == 0) {
                lowestBDivider = B / K;
                return lowestBDivider + 1;
            }
        }
        if (K < A) {
            if (A % K == 0) {
                lowestADivider = A / K;
            } else {
                lowestADivider = A / K + 1;
            }
            lowestBDivider = B / K;

            foundDivisibleNumber = lowestBDivider - lowestADivider + 1;
        }
        if (K > B && B == 0) {
            return 1;
        }
        return foundDivisibleNumber;
    }
}
