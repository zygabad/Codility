package com.codility;

/**
 * Place description here.
 *
 * @author Y08L@nykredit.dk
 */

public class Solution4 {
    public int[] solution(int N, int[] A) {
        int[] countersArray = new int[N];
        int maxCounterState = 0;
        int minValue = 0;

        for (int value : A) {
            if (value == N + 1) {
                minValue = maxCounterState;
            } else if (value <= N && value >= 1) {
                int index = value - 1;
                if (countersArray[index] < minValue){
                    countersArray[index] = minValue;
                }
                countersArray[index]++;
                if (maxCounterState < countersArray[index]) {
                    maxCounterState = countersArray[index];
                }
            }
        }

        for (int i = 0; i < countersArray.length; i++ ){
            if (countersArray[i] < minValue){
                countersArray[i] = minValue;
            }
        }

         return countersArray;
    }
}
