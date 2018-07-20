package com;

import com.codility.Solution5;
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
        int A = 6;
        int B = 11;
        int K = 2;
        //when
        int restult = executeSolution(A, B, K);
        //then
        assertEquals(3, restult);
    }

    @Test
    public void testN2_K2_1() {
        //given
        int A = 1;
        int B = 2;
        int K = 2;
        //when
        int restult = executeSolution(A, B, K);
        //then
        assertEquals(1, restult);
    }

    @Test
    public void testN2_K2_2() {
        //given
        int A = 1;
        int B = 1;
        int K = 2;
        //when
        int restult = executeSolution(A, B, K);
        //then
        assertEquals(0, restult);
    }

    @Test
    public void testN2_K2_3() {
        //given
        int A = 10;
        int B = 10;
        int K = 5;
        //when
        int restult = executeSolution(A, B, K);
        //then
        assertEquals(1, restult);
    }

    @Test
    public void testN2_K2_31() {
        //given
        int A = 10;
        int B = 10;
        int K = 5;
        //when
        int restult = executeSolution(A, B, K);
        //then
        assertEquals(1, restult);
    }

    @Test
    public void testCodility2() {
        //given
        int A = 0;
        int B = 0;
        int K = 11;
        //when
        int restult = executeSolution(A, B, K);
        //then
        assertEquals(1, restult);
    }

    @Test
    public void testN10_K2_1() {
        //given
        int A = 12;
        int B = 21;
        int K = 2;
        //when
        int restult = executeSolution(A, B, K);
        //then
        assertEquals(5, restult);
    }

    @Test
    public void testN10_K3_1() {
        //given
        int A = 12;
        int B = 21;
        int K = 3;
        //when
        int restult = executeSolution(A, B, K);
        //then
        assertEquals(4, restult);
    }

    @Test
    public void testN10_K4_1() {
        //given
        int A = 12;
        int B = 21;
        int K = 4;
        //when
        int restult = executeSolution(A, B, K);
        //then
        assertEquals(3, restult);
    }

    @Test
    public void testN10_K22_1() {
        //given
        int A = 12;
        int B = 21;
        int K = 22;
        //when
        int restult = executeSolution(A, B, K);
        //then
        assertEquals(0, restult);
    }

    @Test
    public void testCodility3() {
        //given
        int A = 0;
        int B = 14;
        int K = 2;
        //when
        int restult = executeSolution(A, B, K);
        //then
        assertEquals(8, restult);
    }

    @Test
    public void testN9_K4() {
        //given
        int A = 6;
        int B = 14;
        int K = 4;
        //when
        int restult = executeSolution(A, B, K);
        //then
        assertEquals(2, restult);
    }

    /*
    A12   B21   K = 2
        12 13 14 15 16 17 18 19 20 21
    k2 result =5  2*6 2*7 2*8 2*9 2*10
    k3 result =4 3*4  3*5 3*6 3*7
    k4 result =3  4*3 4*4 4*5

    A0   B14   K = 2
    0 1 2 3 4 5 6 7 8 9 10 11 12 13 14
    k2 result =8
    k1 result =14
    k=3 result = 4?

    A3   B14   K = 4
    3 4 5 6 7 8 9 10 11 12 13 14
    result = 3   14/4 = 3


A6 B14 k=2
    6 7 8 9 10 11 12 13 14
    k=2 result=5                 return BDivider - ADivider + 1; lub Bdivider -K
    k=3 result=3                 return BDivider - ADivider + 1;
    k=4 result=2            return BDivider - ADivider + 1 +1;

*/

    private int executeSolution(int A, int B, int K) {
        return new Solution5().solution(A, B, K);
    }
}
