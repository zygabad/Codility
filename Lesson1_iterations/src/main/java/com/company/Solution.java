package com.company;

public class Solution {
    private int N;
    private String binaryRepresentation;
    private int binaryGap;

    public Solution(int n) {
        N = n;
        this.binaryRepresentation = binaryRepresentation;
    }

    public boolean positiveInteger(int N) {
        if (N >=0) {
            return true;
        }
        return false;
    }

    public String convertToBinary(int N){
        return binaryRepresentation = Integer.toBinaryString(N);
    }

    public int binaryGap(int N){
        binaryGap = 0;
        binaryRepresentation = convertToBinary(N);
        int counter = 0;

        for (int i =1; i<binaryRepresentation.length();i++) {
            if (binaryRepresentation.charAt(i) == '0') {
                counter++;
            } else if (binaryRepresentation.charAt(i) == '1') {
                if (counter> binaryGap) {
                    binaryGap = counter;
                }
                counter = 0;


            }
        }
        return binaryGap;
    }
}
