package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Place description here.
 *
 * @author Y08L@nykredit.dk
 */
//CODILITY SCORE 83% on Corectness and 83% performance
public class Solution1 {
    public int solution(int[] A) {
        int result = 0;
        Arrays.sort(A);
        if (A[0] == 1 && A[A.length-1]==A.length){
            return 1;
        }

        return result;
    }
}
