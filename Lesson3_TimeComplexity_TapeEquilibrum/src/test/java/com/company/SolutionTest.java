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
    public void testCodility() {
        //given
        int[] A = {3, 1, 2, 4, 3};
        //when
        int result = executeSolution(A);
        //then
        assertEquals(1, result);
    }

    @Test
    public void testN2_1() {
        //given
        int[] A = {1, 2};
        //when
        int result = executeSolution(A);
        //then
        assertEquals(1, result);
    }

    @Test
    public void testN2_2() {
        //given
        int[] A = {2, 1};
        //when
        int result = executeSolution(A);
        //then
        assertEquals(1, result);
    }

    @Test
    public void testN2_3() {
        //given
        int[] A = {-4, 6};
        //when
        int result = executeSolution(A);
        //then
        assertEquals(10, result);
    }

    @Test
    public void testN2_4() {
        //given
        int[] A = {4, 6};
        //when
        int result = executeSolution(A);
        //then
        assertEquals(2, result);
    }

    @Test
    public void testN2_5() {
        //given
        int[] A = {-4, 6};
        //when
        int result = executeSolution(A);
        //then
        assertEquals(10, result);
    }

    @Test
    public void testN3_1() {
        //given
        int[] A = {1, 2, 3};
        //when
        int result = executeSolution(A);
        //then
        assertEquals(0, result);
    }

    @Test
    public void testN3_2() {
        //given
        int[] A = {3, 1, 2};
        //when
        int result = executeSolution(A);
        //then
        assertEquals(0, result);
    }

    @Test
    public void testN3_3() {
        //given
        int[] A = {-2, 6, -4};
        //when
        int result = executeSolution(A);
        //then
        assertEquals(4, result);
    }

    @Test
    public void testN4_1() {
        //given
        int[] A = {1, 2, 3, 4};
        //when
        int result = executeSolution(A);
        //then
        assertEquals(2, result);
    }

    @Test
    public void testN4_2() {
        //given
        int[] A = {-5, 4, -1, 10};
        //when
        int result = executeSolution(A);
        //then
        assertEquals(10, result);
    }
    
    private int executeSolution(int[] A) {
        return new Solution5().solution(A);
    }
}
