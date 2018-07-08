package com.company;

import java.util.HashSet;
import java.util.Set;

/**
 * Place description here.
 *
 * @author Y08L@nykredit.dk
 */

public class Solution5 {
    public int solution(int[] A) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        Set<Integer> uniqueValues = new HashSet<>();

        for (int value : A) {
            if (uniqueValues.contains(value)){
                return 0;
            }
            uniqueValues.add(value);

            if(value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }

        if (min == 1 && max == A.length) {
            return 1;
        }

        return 0;
    }

}
