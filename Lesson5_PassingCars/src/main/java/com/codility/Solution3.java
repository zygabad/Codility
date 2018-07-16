package com.codility;

/**
 * Place description here.
 *
 * @author Y08L@nykredit.dk
 */
//CODILITY 100 100 100 !!!!!!!!!!!!!
public class Solution3 {
    public int solution(int[] A) {
        int passingCounter = 0;
        int howManyAdd = 0;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] == 0) {
                howManyAdd++;
            }
            if (A[i + 1] != 0) {
                if (passingCounter < 1000000000) {
                    passingCounter = passingCounter + howManyAdd;
                } else {
                    return -1;
                }
            }
        }
        return passingCounter;
    }
}