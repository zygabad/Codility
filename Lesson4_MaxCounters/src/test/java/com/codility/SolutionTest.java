package com.codility;

import org.junit.Test;

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
        int[] retult = executeSolution(N, A);
        //then
        assertEquals(retult, expectedArray);
    }

    private int[] executeSolution(int N, int[] A) {
        return new Solution1().solution(N, A);
    }
}
