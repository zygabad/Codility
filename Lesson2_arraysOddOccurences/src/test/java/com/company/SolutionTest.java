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
    public void testDummy1() {
        //given
        int[] A = {1, 1, 2};

        //when
        int result = executeSolution(A);

        //then
        assertEquals(2, result);
    }

    @Test
    public void testDummy2() {
        //given
        int[] A = {2, 1, 1};

        //when
        int result = executeSolution(A);

        //then
        assertEquals(2, result);
    }

    @Test
    public void testDummy3() {
        //given
        int[] A = {1, 2, 1};

        //when
        int result = executeSolution(A);

        //then
        assertEquals(2, result);
    }

    @Test
    public void testDummy4() {
        //given
        int[] A = {1};

        //when
        int result = executeSolution(A);

        //then
        assertEquals(1, result);
    }

    @Test
    public void testAdvanced() {
        //given
        int[] A = {9, 3, 9, 3, 9, 7, 9};

        //when
        int result = executeSolution(A);

        //then
        assertEquals(7, result);
    }

    private int executeSolution(int[] A) {
        return new Solution().solution8(A);
    }
}
