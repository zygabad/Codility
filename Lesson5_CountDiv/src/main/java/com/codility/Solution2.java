package com.codility;

/**
 * Place description here.
 *
 * @author Y08L@nykredit.dk
 */
//CODILITY 62 50 75
/*For example, for the input [0, 0, 11] the solution returned a wrong answer (got 0 expected 1).
    xtreme_endpoints
    verify handling of range endpoints, multiple runs ?WRONG ANSWER
    got 7 expected 8
    ig_values3
    A = 0, B = MAXINT, K in {1,MAXINT} ?WRONG ANSWER
    got 2000000000 expected 2000000001*/

public class Solution2 {
    public int solution(int A, int B, int K) {
        int foundDivisibleNumber = 0;
        int lowestADivider = 0;
        int lowestBDivider = 0;
        if (K >= A && K <= B) {
            return B / K;
        }
        if (K < A) {
            if (A % K == 0) {
                lowestADivider = A / K;
            } else {
                lowestADivider = A / K + 1;
            }
                lowestBDivider = B/K;

            foundDivisibleNumber = lowestBDivider -lowestADivider +1;
        }
        return foundDivisibleNumber;
    }
}
/*
A12   B21   K = 2
12 13 14 15 16 17 18 19 20 21
k2 result =5  2*6 2*7 2*8 2*9 2*10
k3 result =4 3*4  3*5 3*6 3*7
k4 result =3  4*3 4*4 4*5


A5  B 9 K 3
5 6 7 8 9
A 2   B 6    K 2
2 3 4 5 6
result 3

if ()

A2   B6      K3
2 3 4 5 6               jesli w zbiorze miedzy A i B to czy B jest podzielne - jesli tak to ile z dzielenia - jak 2 to 2 jak 3 to wynik3
result 2
 i B/K = 2
if (K >= A && K <= B)
result = B/A  albo B/K
dzielenie mod


A2   B 6     K4
2 3 4 5 6
result 1
-------------

A6   B9   K3
6 7 8 9
result 2

if (K < A) {
B podzielne i A podzielne .....suma tez podzielna przez K

A6   B9   K8
6 7 8 9
result 1
 */


