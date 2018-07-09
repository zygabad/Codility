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
    public void test5_1() {
        //given
        int[] A = { 3, 6, 4, 1, 2};
        //when
        int result = solution(A);
        //then
        assertEquals(5, result);
    }

    @Test
    public void testCodility_1() {
        //given
        int[] A = {1, 3, 6, 4, 1, 2};
        //when
        int result = solution(A);
        //then
        assertEquals(5, result);
    }

    @Test
    public void testCodility_2() {
        //given
        int[] A = {1, 2, 3};
        //when
        int result = solution(A);
        //then
        assertEquals(4, result);
    }

    @Test
    public void testCodility_3() {
        //given
        int[] A = {-1, -3};
        //when
        int result = solution(A);
        //then
        assertEquals(1, result);
    }

    private int solution(int[] A) {
        return new Solution2().solution(A);
    }

}
