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
        assertEquals(0, executeSolution(1, 1, 1));
    }

    @Test
    public void testDummy2() {
        assertEquals(0, executeSolution(1, 1, 2));
    }

    @Test
    public void testDummy3() {
        assertEquals(1, executeSolution(1, 2, 1));
    }

    @Test
    public void testDummy4() {
        assertEquals(1, executeSolution(1, 2, 2));
    }

    @Test
    public void testDummy5() {
        assertEquals(1, executeSolution(1, 3, 5));
    }

    @Test
    public void testDummy6() {
        assertEquals(2, executeSolution(1, 3, 1));
    }

    @Test
    public void testDummy7() {
        assertEquals(9, executeSolution(1, 10, 1));
    }

    @Test
    public void testCodility() {
        assertEquals(3, executeSolution(10, 85, 30));
    }

    @Test
    public void testAdvanced() {
        assertEquals(10, executeSolution(12, 62, 5));
    }

    private int executeSolution(int X, int Y, int D) {
        return new Solution().solution5(X, Y, D);
    }

}