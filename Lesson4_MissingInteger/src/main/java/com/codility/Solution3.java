package com.codility;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Place description here.
 *
 * @author Y08L@nykredit.dk
 */
//CODILITY 55 80 25
public class Solution3 {
    public int solution(int[] A) {
        Arrays.sort(A);
        int minPositiveInteger = 0;
        Set<Integer> uniquePositiveValues = new HashSet<>();
//hash set wrzuca nie po kolei te wartosci wiec ponizszy algorytm sie nie sprawdza
        for (int value : A) {
            if ((!uniquePositiveValues.contains(value)) && (value > 0)) {
                uniquePositiveValues.add(value);
            }
        }

        for (Integer value : uniquePositiveValues) {
            if (!uniquePositiveValues.contains(1) && value > 1) {
                return 1;
            } else if (minPositiveInteger != value - 1) {
                return value - 1;
            } else {
                minPositiveInteger = value;
            }
        }
        return minPositiveInteger + 1;
    }
}
