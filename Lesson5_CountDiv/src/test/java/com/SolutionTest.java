package com;

import com.codility.Solution1;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Place description here.
 *
 * @author Y08L@nykredit.dk
 */

public class SolutionTest {

    @Test
    public void testCodility(){
        //given
        int A = 6;
        int B = 11;
        int K = 2;
        //when
        int restult = executeSolution(A, B, K);
        //then
        assertEquals(3, restult);
    }

    private int executeSolution(int A, int B, int K) {
        return new Solution1().solution(A,B,K);
    }
}
