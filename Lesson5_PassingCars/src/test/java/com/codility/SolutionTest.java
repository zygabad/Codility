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
        int[] A = {0, 1, 0, 1, 1};
        //when
        int result = solution(A);
        //then
        assertEquals(5, result);
    }

    @Test
    public void test1_N1() {
        //given
        int[] A = {0};
        //when
        int result = solution(A);
        //then
        assertEquals(0, result);
    }

    @Test
    public void test2_N1() {
        //given
        int[] A = {1};
        //when
        int result = solution(A);
        //then
        assertEquals(0, result);
    }

    @Test
    public void test3_N2() {
        //given
        int[] A = {1, 0};
        //when
        int result = solution(A);
        //then
        assertEquals(1, result);
    }

    @Test
    public void test4_N2() {
        //given
        int[] A = {1, 1};
        //when
        int result = solution(A);
        //then
        assertEquals(0, result);
    }

    @Test
    public void test5_N2() {
        //given
        int[] A = {0, 0};
        //when
        int result = solution(A);
        //then
        assertEquals(0, result);
    }

    @Test
    public void test6_N3() {
        //given
        int[] A = {1, 0, 1};
        //when
        int result = solution(A);
        //then
        assertEquals(1, result);
    }

    @Test
    public void test7_N3() {
        //given
        int[] A = {1, 1, 0};
        //when
        int result = solution(A);
        //then
        assertEquals(2, result);
    }

    @Test
    public void test8_N3() {
        //given
        int[] A = {1, 1, 1};
        //when
        int result = solution(A);
        //then
        assertEquals(0, result);
    }


    private int solution(int[] A) {
        return new Solution1().solution(A);
    }
}
