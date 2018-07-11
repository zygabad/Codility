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
        int[] A = {3, 6, 4, 1, 2};
        //when
        int result = solution(A);
        //then
        assertEquals(5, result);
    }

    @Test
    public void test5_2() {
        //given
        int[] A = {-3, -6, 4, 1, 2};
        //when
        int result = solution(A);
        //then
        assertEquals(3, result);
    }

    @Test
    public void test6_1() {
        //given
        int[] A = {1, 2, 3, 4, 35, 45};
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

    @Test
    public void testCodility_3_1() {
        //given
        int[] A = {-1, 0, 1};
        //when
        int result = solution(A);
        //then
        assertEquals(2, result);
    }

    @Test
    public void testCodility_3_2() {
        //given
        int[] A = {90, 91, 92, 93};
        //when
        int result = solution(A);
        //then
        assertEquals(1, result);
    }

    private int solution(int[] A) {
        return new Solution5().solution(A);
    }

}
