package org.mirraim;

/**
 * 1131. Maximum of Absolute Value Expression
 *
 * Given two arrays of integers with equal lengths, return the maximum value of:
 * |arr1[i] - arr1[j]| + |arr2[i] - arr2[j]| + |i - j|
 * where the maximum is taken over all 0 <= i, j < arr1.length
 *
 * solution pass 20/21 tests
 */

public class Task1131 {

    public int maxAbsValExpr(int[] arr1, int[] arr2) {
        int max = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i ; j < arr1.length; j++) {
                int a = Math.max(arr1[i] - arr1[j], arr1[j] - arr1[i]);
                int b = Math.max(arr2[i] - arr2[j], arr2[j] - arr2[i]);
                int c = Math.max(i - j, j - i);
                max =  Math.max(a + b + c, max);
            }
        }
        return max;
    }
}