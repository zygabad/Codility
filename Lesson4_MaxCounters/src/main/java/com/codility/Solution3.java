package com.codility;

import java.util.Arrays;

/**
 * Place description here.
 *
 * @author Y08L@nykredit.dk
 */

public class Solution3 {
    public int[] solution(int N, int[] A) {
        int[] countersArray = new int[N];
        int maxCounterState = 0;

        for (int value : A) {
            if (value == N + 1) {
                Arrays.fill(countersArray, maxCounterState);
            } else if (value <= N && value >= 1) {
                countersArray[value - 1]++;
                if (maxCounterState < countersArray[value - 1]) {
                    maxCounterState = countersArray[value - 1];
                }
            }
        }
        return countersArray;
    }
}
