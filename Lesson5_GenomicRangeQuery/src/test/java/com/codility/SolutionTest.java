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
        assertArrayEquals(new int[]{2, 4, 1}, result);
    }

    @Test
    public void test1() {
        //given
        String S = "CGA";
        int[] P = {0, 1, 2};
        int[] Q = {0, 2, 2};
        //when
        int[] result = executeSolution(S, P , Q);
        //done
        assertArrayEquals(new int[]{2, 1, 1}, result);
    }

    @Test
    public void test2() {
        //given
        String S = "GGGGGGGGGGG";
        int[] P = {0, 1, 2};
        int[] Q = {0, 2, 2};
        //when
        int[] result = executeSolution(S, P , Q);
        //done
        assertArrayEquals(new int[]{3, 3, 3}, result);
    }

    private int[] executeSolution(String s, int[] p, int[] q) {
        return new Solution4().solution(s, p, q);
    }

}
