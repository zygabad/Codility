package com.company;

import java.util.*;

/**
 * Place description here.
 *
 * @author Y08L@nykredit.dk
 */

public class Solution {

    public int solution(int[] a) {
        int result = 0;

        for (int i = 0; i < a.length; i++) {
            if ((i % 2) == 0) {
                result += a[i];
            } else {
                result -= a[i];
            }
        }

        return result;
    }

    public int solution2(int[] A) {
        Set<Integer> uniqueValues = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            Integer value = Integer.valueOf(A[i]);

            if (uniqueValues.contains(value)) {
                uniqueValues.remove(value);
            } else {
                uniqueValues.add(value);
            }
        }

        Object[] result = uniqueValues.toArray();

        return (Integer) result[0];
    }

    public int solution3(int[] A) {
        ArrayList<Integer> uniqueValues = new ArrayList<>();

        for (int primitiveValue : A) {
            Integer value = Integer.valueOf(primitiveValue);

            if (!uniqueValues.contains(value)) {
                uniqueValues.add(value);
            } else {
                uniqueValues.remove(value);
            }
        }

        return uniqueValues.get(0);
    }

    public int solution4(int[] A) {
        ArrayList<Integer> listValues = new ArrayList<>();

        for (int value : A) {
            listValues.add(Integer.valueOf(value));
        }

        Collections.sort(listValues);
        Object[] sortedValues = listValues.toArray();

        for (int i = 0; i < sortedValues.length; ) {
            Integer value = (Integer) sortedValues[i];
            int valuesCounter = 1;

            for (int j = i + 1; j < sortedValues.length; j++) {
                i = j;
                Integer valueToCompare = (Integer) sortedValues[j];

                if (value.equals(valueToCompare)) {
                    valuesCounter++;
                } else {
                    break;
                }
            }

            if ((valuesCounter % 2) != 0) {
                return value;
            }
        }

        return 0;
    }

    public int solution5(int[] A) {
        if (A.length == 1) {
            return A[0];
        }

        ArrayList<Integer> listValues = new ArrayList<>();

        for (int value : A) {
            listValues.add(Integer.valueOf(value));
        }

        Collections.sort(listValues);
        for (int i = 0; i < A.length - 1; i += 2) {
            if (!listValues.get(i).equals(listValues.get(i + 1))) {
                if (!listValues.get(i).equals(listValues.get(i + 2))) {
                    return listValues.get(i);
                }
            } else if (i + 2 == A.length - 1) {
                return listValues.get(A.length - 1);
            }
        }

        return 0;
    }

    //100% all on codility
    public int solution6(int[] A) {
        int result = 0;
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if (i == A.length - 1) {
                if (result == 0) {
                    result = A[i];
                    break;
                }
            } else if ((A[i] != A[i + 1]) && ((i + 1) % 2 != 0)) {
                result = A[i];
                break;
            }
        }
        return result;
    }

    public int solution7(int[] A) {
        Arrays.sort(A);

        for (int i = 0; i < A.length - 1; i += 2) {
            if (A[i] == A[i + 1]) {
                continue;
            } else {
                return A[i];
            }
        }

        return A[A.length - 1];
    }


    //FINAL SOLUTION !!!
    public int solution8(int[] A) {
        Arrays.sort(A);

        for (int i = 0; i < A.length - 1; i += 2) {
            if (A[i] != A[i + 1]) {
                return A[i];
            }
        }

        return A[A.length - 1];
    }

}