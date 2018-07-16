package com.codility;

/**
 * Place description here.
 *
 * @author Y08L@nykredit.dk
 */
//CODILITY 70(all) 100(correctness) 40(performance)
//    The function should return ?1 if the number of pairs of passing cars exceeds 1,000,000,000.
////perf trsts: arge_random
//random, length = ~100,000 ?WRONG ANSWER
//    got 1248768710 expected -1

public class Solution2 {
    public int solution(int[] A) {
        int passingCounter = 0;
        int howManyAdd = 0;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] == 0) {
                howManyAdd++;
            }
            if (A[i + 1] != 0) {
                passingCounter = passingCounter + howManyAdd;
            }

        }
        return passingCounter;
    }
}
