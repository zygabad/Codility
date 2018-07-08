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
    public void testN3_1() {
        //given
        int[] A = {1, 2, 3};
        int X = 3;
        //when
        int result = executeSolution(X, A);
        //then
        assertEquals(2, result);
    }

    @Test
    public void testN3_2() {
        //given
        int[] A = {2, 1, 3};
        int X = 3;
        //when
        int result = executeSolution(X, A);
        //then
        assertEquals(2, result);
    }

    @Test
    public void testN3_3() {
        //given
        int[] A = {2, 1, 3};
        int X = 2;
        //when
        int result = executeSolution(X, A);
        //then
        assertEquals(1, result);
    }

    @Test
    public void testN3_4() {
        //given
        int[] A = {2, 1, 3};
        int X = 4;
        //when
        int result = executeSolution(X, A);
        //then
        assertEquals(-1, result);
    }

    @Test
    public void testN3_5() {
        //given
        int[] A = {1, 1, 2};
        int X = 2;
        //when
        int result = executeSolution(X, A);
        //then
        assertEquals(2, result);
    }

    @Test
    public void testN3_6() {
        //given
        int[] A = {2, 1, 1};
        int X = 3;
        //when
        int result = executeSolution(X, A);
        //then
        assertEquals(-1, result);
    }

    @Test
    public void testN3_7() {
        //given
        int[] A = {1, 1, 1};
        int X = 1;
        //when
        int result = executeSolution(X, A);
        //then
        assertEquals(0, result);
    }

    @Test
    public void testN1_1() {
        //given
        int[] A = {1};
        int X = 1;
        //when
        int result = executeSolution(X, A);
        //then
        assertEquals(0, result);
    }

    @Test
    public void testN1_2() {
        //given
        int[] A = {1};
        int X = 2;
        //when
        int result = executeSolution(X, A);
        //then
        assertEquals(-1, result);
    }

    @Test
    public void testCodility() {
        //given
        int[] A = {1, 3, 1, 4, 2, 3, 5, 4};
        int X = 5;
        //when
        int result = executeSolution(X, A);
        //then
        assertEquals(6, result);
    }

    private int executeSolution(int X, int[] A) {
        return new Solution1().solution(X, A);
    }
}
