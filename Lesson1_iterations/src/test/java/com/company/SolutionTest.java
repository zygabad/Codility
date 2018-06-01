package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
private int number;
private static int POSITIVE_INT = 1;
private static int NEGATIVE_INT = -1;
private static String BINARY_NINE = "1001";
private static String BINARY_529 = "1000010001";





    @Test
    public void testPositiveInteger(){
        //given
        Solution solution = new Solution(1);

        //when

        //then
        assertEquals(true, solution.positiveInteger(POSITIVE_INT));
        assertEquals(false, solution.positiveInteger(NEGATIVE_INT));
    }


    @Test
    public void testBinaryRepresentation(){
        //given
        Solution solution = new Solution(9);

        //when
        //then
        assertEquals("1001",solution.convertToBinary(9));

    }

    @Test
    public void testBinaryGap(){
        //given
        Solution solution = new Solution(9);

        //when
        //then
        assertEquals(3,solution.binaryGap(561892));
        assertEquals(2,solution.binaryGap(9));
        assertEquals(4,solution.binaryGap(529));
        assertEquals(1,solution.binaryGap(20));
        assertEquals(0,solution.binaryGap(15));
        assertEquals(0,solution.binaryGap(32));
        assertEquals(5,solution.binaryGap(1041));

    }

}
