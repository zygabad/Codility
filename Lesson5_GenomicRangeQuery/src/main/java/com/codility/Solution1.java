package com.codility;

import java.util.Arrays;

/**
 * Place description here.
 *
 * @author Y08L@nykredit.dk
 */
//CODILITY 62 100(correctness) 0(performance) -> see bottom

public class Solution1 {
    public int[] solution(String S, int[] P, int[] Q){
        int[] result = new int[P.length];

        for (int i=0; i < P.length ; i++){
            String tempString = S;
            tempString = tempString.substring(P[i], Q[i]+1);
            tempString = tempString.replace('A', '1');
            tempString= tempString.replace('C', '2');
            tempString= tempString.replace('G', '3');
            tempString= tempString.replace('T', '4');
            char[] temp = tempString.toCharArray();
            Arrays.sort(temp);
            result[i] = Character.getNumericValue(temp[0]);
        }

        return result;
    }
}
/*
almost_all_same_letters
    GGGGGG..??..GGGGGG..??..GGGGGG ?TIMEOUT ERROR
    running time: >8.00 sec., time limit: 2.77 sec.
    1. 8.000 s TIMEOUT ERROR,  running time: >8.00 sec., time limit: 2.77 sec.
    2. 0.068 s OK
    ? large_random
    large random string, length ?TIMEOUT ERROR
    running time: >8.00 sec., time limit: 2.74 sec.
    1. 8.000 s TIMEOUT ERROR,  running time: >8.00 sec., time limit: 2.74 sec.
    ? extreme_large
    all max ranges ?TIMEOUT ERROR
    running time: >9.00 sec., time limit: 3.20 sec.
    1. 9.000 s TIMEOUT ERROR,  running time: >9.00 sec., time limit: 3.20 sec.*/
