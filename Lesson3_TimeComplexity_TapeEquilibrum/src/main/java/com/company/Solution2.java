package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Place description here.
 *
 * @author Y08L@nykredit.dk
 */

public class Solution2 {
    public int solution(int[] A) {
        ArrayList<Integer> diffList = new ArrayList<>();

        // first step
        for (int i = 0; i < A.length - 1; i++) {
            int sumFirstPart = countFirstSum(A, i + 1);
            int sumLastPart = countLastSum(A, i + 1);
            int diff = Math.abs(sumFirstPart - sumLastPart);
            diffList.add(diff);
        }

        // second step
        return findMinElement(diffList);
    }

    private int countFirstSum(int[] A, int p) {
        int sum = 0;
        for (int i = 0; i < p; i++) {
            sum += A[i];
        }

        return sum;
    }

    private int countLastSum(int[] A, int p) {
        int sum = 0;
        for (int i = 0; i < A.length - p; i++) {
            sum += A[p + i];
        }

        return sum;
    }

    private int findMinElement(List<Integer> list) {
        Integer minimum = Integer.MAX_VALUE;

        for (Integer value : list) {
            if (value.compareTo(minimum) < 0) {
                minimum = value;
            }
        }

        return minimum;
    }
}
