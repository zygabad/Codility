package com.codility;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Place description here.
 *
 * @author Y08L@nykredit.dk
 */

public class SolutionTest {

    @Test
    public void testCodility() {
        //given
        String S = "CAGCCTA";
        int[] P = {2, 5, 0};
        int[] Q = {4, 5, 6};
        //when
        int[] result = executeSolution(S, P , Q);
        //done
        assertArrayEquals(result, new int[]{2, 4, 1});
    }

    private int[] executeSolution(String s, int[] p, int[] q) {

        return p;
    }

}
