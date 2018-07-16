package com.codility;

/**
 * Place description here.
 *
 * @author Y08L@nykredit.dk
 */
//CODILITY 60 80 40
/*
My 8 test passed - I HAVE WRONG TESTS!!!
The following issues have been detected: wrong answers.
For example, for the input [1, 0] the solution returned a wrong answer (got 1 expected 0).

double
two elements ?WRONG ANSWER
got 1 expected 0

large_random
random, length = ~100,000 ?WRONG ANSWER
got 1248768710 expected -1

large_big_answer
0..01..1, length = ~100,000 ?WRONG ANSWER
got -1794967296 expected -1
1. 0.156 s WRONG ANSWER,  got -1794967296 expected -1
2. 0.108 s OK

large_alternate
0101..01, length = ~100,000 ?WRONG ANSWER
got 1250025000 expected -1
1. 0.156 s WRONG ANSWER,  got 1250025000 expected -1
2. 0.136 s OK
 */


public class Solution1 {
    public int solution(int[] A) {
        int passingCounter = 0;
        int howManyAdd = 0;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[0] == 0) {
                if (A[i + 1] != 0) {
                    passingCounter = passingCounter + 1 + howManyAdd;
                } else {
                    howManyAdd++;
                }
            } else {
                if (A[i + 1] != 1) {
                    passingCounter = passingCounter + 1 + howManyAdd;
                } else {
                    howManyAdd++;

                }
            }
        }
        return passingCounter;
    }
}
