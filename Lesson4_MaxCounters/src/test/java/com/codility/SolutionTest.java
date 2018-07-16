package com.codility;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Place description here.
 *
 * @author Y08L@nykredit.dk
 */

public class SolutionTest {

    @Test
    public void test_codility() {
        //given
        int[] A = {3, 4, 4, 6, 1, 4, 4};
        int N = 5;
        int[] expectedArray = {3, 2, 2, 4, 2};
        //when
        int[] retsult = executeSolution(N, A);
        //then
        assertArrayEquals(retsult, expectedArray);
    }

    private int[] executeSolution(int N, int[] A) {
        return new Solution4().solution(N, A);
    }
}
