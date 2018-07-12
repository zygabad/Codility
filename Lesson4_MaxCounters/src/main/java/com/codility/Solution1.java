package com.codility;

/**
 * Place description here.
 *
 * @author Y08L@nykredit.dk
 */

public class Solution1 {
    public int[] solution(int N, int[] A) {
        int[] countersArray = new int[N];
        int counterState = 0;

        for (int value : A) {
            if (value <= N && value >= 1 && value != N + 1) {
                countersArray[value - 1]++;
                counterState = countersArray[value - 1]++;
            } else if (value == N + 1) {
                //int counterState = countersArray[value - 1];
                for (int i = 0; i < countersArray.length; i++) {
                    countersArray[i] = counterState;
                }
            }
        }

        return countersArray;
    }
}
