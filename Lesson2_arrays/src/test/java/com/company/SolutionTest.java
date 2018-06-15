package com.company;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertArrayEquals;

/**
 * Place description here.
 *
 * @author Y08L@nykredit.dk
 */

public class SolutionTest {

    @Test
    public void test0(){
        //given
        int[] A = {1, 2, 3, 4};
        int K = 0;
        int[] expectedResult = {1, 2, 3, 4};

        //when
        int[] result = new Solution().solution(A, K);

        //then
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void test1(){
        //given
        int[] A = {0, 0, 0};
        int K = 1;
        int[] expectedResult = {0, 0, 0};

        //when
        int[] result = new Solution().solution(A, K);

        //then
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void test2(){
        //given
        int[] A = {1, 2, 3, 4};
        int K = 4;
        int[] expectedResult = {1, 2, 3, 4};

        //when
        int[] result = new Solution().solution(A, K);

        //then
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void test3() {
        //given
        int[] A = {3, 8, 9, 7, 6};
        int K = 3;
        int[] expectedResult = {9, 7, 6, 3, 8};

        //when
        int[] result = new Solution().solution(A, K);

        //then
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void test4() {
        //given
        int[] A = {3, 8, 9, 7, 6};
        int K = 1;
        int[] expectedResult = {6, 3, 8, 9, 7};

        //when
        int[] result = new Solution().solution(A, K);

        //then
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void test5() {
        //given
        int[] A = {3, 8, 9, 7, 6};
        int K = 5;
        int[] expectedResult = {3, 8, 9, 7, 6};

        //when
        int[] result = new Solution().solution(A, K);

        //then
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void test6() {
        //given
        int[] A = {3, 8, 9, 7, 6};
        int K = 6;
        int[] expectedResult = {6, 3, 8, 9, 7};

        //when
        int[] result = new Solution().solution(A, K);

        //then
        assertArrayEquals(expectedResult, result);
    }
}
