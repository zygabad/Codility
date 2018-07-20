package com.codility;

/**
 * Place description here.
 *
 * @author Y08L@nykredit.dk
 */
//CODILITY 12 25 0 - this is first algorithm - done in 5 min in train with 1 codility test
    //CODILITY  after corrected condition in for loop (<=) 50 100 (correctness) 0 (perf)
public class Solution1 {
    public int solution(int A, int B, int K) {
        int foundDivisibleNumber = 0;
        for (int i = 0; i <= B - A; i++) {
            if ((A + i) % K ==0){
                foundDivisibleNumber++;
            }
        }

        return foundDivisibleNumber;
    }
}
