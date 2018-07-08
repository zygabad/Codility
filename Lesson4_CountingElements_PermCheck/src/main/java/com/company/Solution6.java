package com.company;

/**
 * Place description here.
 *
 * @author Y08L@nykredit.dk
 */

public class Solution6 {
    public int solution(int[] A) {
        int[] uniqueValuesCounter = new int[A.length];

        for (int value : A) {
            int index = value - 1;
            if (index < 0 || index >= A.length) {
                return 0;
            }

            uniqueValuesCounter[index]++;
            if (uniqueValuesCounter[index] > 1) {
                return 0;
            }
        }

        return 1;
    }
}
