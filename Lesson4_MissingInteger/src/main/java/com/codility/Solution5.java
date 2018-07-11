package com.codility;

import java.util.Arrays;

/**
 * Place description here.
 *
 * @author Y08L@nykredit.dk
 */
//CODILITY 100 100 100 !!!!!!!!!!! :)))))))))
public class Solution5 {
    public int solution(int[] A) {
        Arrays.sort(A);
        int minPositiveInteger = 0;

        for (int value : A) {
            if ((minPositiveInteger != value) && (value > 0)) {
                if (minPositiveInteger != value - 1) {
                    return minPositiveInteger + 1;
                } else {
                    minPositiveInteger = value;
                }
            }
        }

        return minPositiveInteger + 1;
    }
}




