package com.codility;

/**
 * Place description here.
 *
 * @author Y08L@nykredit.dk
 */
//CODILITY 75 75 75
public class Solution3 {
    public int solution(int A, int B, int K) {
        int foundDivisibleNumber = 0;
        int lowestADivider = 0;
        int lowestBDivider = 0;
        if (K >= A && K <= B) {
            return B / K;
        }
        if (K < A) {
            if (A % K == 0) {
                lowestADivider = A / K;
            } else {
                lowestADivider = A / K + 1;
            }
            lowestBDivider = B/K;

            foundDivisibleNumber = lowestBDivider -lowestADivider +1;
        }
        if (K >B && B ==0){
            return 1;
        }
        return foundDivisibleNumber;
    }

}
