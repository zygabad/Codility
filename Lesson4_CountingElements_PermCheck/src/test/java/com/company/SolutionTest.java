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
    public void TestN1_1() {
        //given
        int[] A = {1};
        //when
        int result = solution(A);
        //then
        assertEquals(result, 1);
    }

    @Test
    public void TestN3_0() {
        //given
        int[] A = {18, 1, 3};
        //when
        int result = solution(A);
        //then
        assertEquals(result, 0);
    }


    @Test
    public void TestN3_1() {
        //given
        int[] A = {1, 2, 3};
        //when
        int result = solution(A);
        //then
        assertEquals(result, 1);
    }

    @Test
    public void TestN4_codility1() {
        //given
        int[] A = {4, 1, 3, 2};
        //when
        int result = solution(A);
        //then
        assertEquals(result, 1);
    }

    @Test
    public void TestN3_codility0() {
        //given
        int[] A = {4, 1, 3};
        //when
        int result = solution(A);
        //then
        assertEquals(result, 0);
    }

    @Test
    public void TestN3_same() {
        //given
        int[] A = {1, 1, 3};
        //when
        int result = solution(A);
        //then
        assertEquals(result, 0);
    }

    @Test
    public void TestN1_notone() {
        //given
        int[] A = {2};
        //when
        int result = solution(A);
        //then
        assertEquals(result, 0);
    }


    private int solution(int[] A) {
        return new Solution7().solution(A);
    }
}
