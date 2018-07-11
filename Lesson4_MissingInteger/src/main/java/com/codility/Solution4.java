package com.codility;

import java.util.Arrays;
import java.util.TreeSet;

/**
 * Place description here.
 *
 * @author Y08L@nykredit.dk
 */
//CODILITY 77 100(coretness) 50(perf)
public class Solution4 {
    public int solution(int[] A) {
        Arrays.sort(A);
        int minPositiveInteger = 0;
        TreeSet<Integer> uniquePositiveValues = new TreeSet<>();
        for (int value : A) {
            if ((!uniquePositiveValues.contains(value)) && (value > 0)) {
                uniquePositiveValues.add(value);
            }
        }

        for (Integer value : uniquePositiveValues) {
            if (!uniquePositiveValues.contains(1) && value > 1) {
                return 1;
            } else if (minPositiveInteger != value - 1) {
                return minPositiveInteger + 1;
            } else {
                minPositiveInteger = value;
            }
        }
        return minPositiveInteger + 1;
    }
}
