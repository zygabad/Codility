package com.codility;

/**
 * Place description here.
 *
 * @author Y08L@nykredit.dk
 */
//TODO performance to improove from 0 to 100
public class Solution3 {
    public int[] solution(String S, int[] P, int[] Q) {
        int[] result = new int[P.length];

        for (int i = 0; i < P.length; i++) {
            String tempString = S;
            tempString = tempString.substring(P[i], Q[i] + 1);
            if (tempString.contains("A")) {
                result[i] = 1;
            } else if (tempString.contains("C")) {
                result[i] = 2;
            } else if (tempString.contains("G")) {
                result[i] = 3;
            } else if (tempString.contains("T")) {
                result[i] = 4;
            }
        }

        return result;
    }
}
