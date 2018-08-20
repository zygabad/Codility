package com.company;

/**
 * Place description here.
 *
 * @author Y08L@nykredit.dk
 */

public class Solution {
    public int solution1(int X, int Y, int D) {
        int distance = Y - X;
        if (distance == 0) {
            return 0;
        }
        if (distance <= D) {
            return 1;
        }
        if ((distance % D) != 0) {
            return (distance / D) + 1;
        }

        return distance / D;
    }

    public int solution2(int X, int Y, int D) {
        int distance = Y - X;

        if ((distance % D) != 0) {
            return (distance / D) + 1;
        }

        return distance / D;
    }

    public int solution3(int X, int Y, int D) {
        int distance = Y - X;
        int frogJumpsCounter = distance / D;

        if ((distance % D) != 0) {
            frogJumpsCounter++;
        }

        return frogJumpsCounter;
    }

    public int solution4(int X, int Y, int D) {
        double distance = Y - X;

        return (int)Math.ceil(distance / D);
    }

    public int solution5(int X, int Y, int D) {

        return (int)Math.ceil((double)(Y - X) / D);
    }

    public int solution6(int X, int Y, int D) {
        double distance = (double)(Y - X);
        double jumpsNeeded = distance / D;

        return (int)Math.ceil(jumpsNeeded);
    }
}
