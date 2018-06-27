package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Place description here.
 *
 * @author Y08L@nykredit.dk
 */

public class SolutionTest {

    @Test
    public void testN1_1() {
        //given
        int[] A = {1};
        //when
        int result = new Solution().solution(A);
        //then
        assertEquals(2, result);
    }

    @Test
    public void testN1_2() {
        //given
        int[] A = {2};
        //when
        int result = new Solution().solution(A);
        //then
        assertEquals(1, result);
    }

    @Test
    public void testN2_1() {
        //given
        int[] A = {1, 2};
        //when
        int result = new Solution().solution(A);
        //then
        assertEquals(3, result);
    }

    @Test
    public void testN2_2() {
        //given
        int[] A = {1, 3};
        //when
        int result = new Solution().solution(A);
        //then
        assertEquals(2, result);
    }

    @Test
    public void testN2_3() {
        //given
        int[] A = {3, 1};
        //when
        int result = new Solution().solution(A);
        //then
        assertEquals(2, result);
    }

    @Test
    public void testN2_4() {
        //given
        int[] A = {2, 3};
        //when
        int result = new Solution().solution(A);
        //then
        assertEquals(1, result);
    }

    @Test
    public void testN2_5() {
        //given
        int[] A = {3, 2};
        //when
        int result = new Solution().solution(A);
        //then
        assertEquals(1, result);
    }

    @Test
    public void testN3_1() {
        //given
        int[] A = {1, 2, 3};
        //when
        int result = new Solution().solution(A);
        //then
        assertEquals(4, result);
    }

    @Test
    public void testN3_2() {
        //given
        int[] A = {4, 2, 3};
        //when
        int result = new Solution().solution(A);
        //then
        assertEquals(1, result);
    }

    @Test
    public void testN3_3() {
        //given
        int[] A = {1, 4, 3};
        //when
        int result = new Solution().solution(A);
        //then
        assertEquals(2, result);
    }

    @Test
    public void testN4_Codility() {
        //given
        int[] A = {2, 3, 1, 5};
        //when
        int result = new Solution().solution(A);
        //then
        assertEquals(4, result);
    }
}
