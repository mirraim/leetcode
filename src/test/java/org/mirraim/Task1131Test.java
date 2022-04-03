package org.mirraim;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1131Test {
    @Test
    void maxAbsValExpr13() {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {-1,4,5,6};
        assertEquals(13, new Task1131().maxAbsValExpr(arr1, arr2));
    }

    @Test
    void maxAbsValExpr20() {
        int[] arr1 = {1,-2,-5,0,10};
        int[] arr2 = {0,-2,-1,-7,-4};
        assertEquals(20, new Task1131().maxAbsValExpr(arr1, arr2));
    }

    @Test
    void maxAbsValExpr28() {
        int[] arr1 = {10,5,2,-1,5,1};
        int[] arr2 = {-5,-4,2,9,-8,-5};
        assertEquals(28, new Task1131().maxAbsValExpr(arr1, arr2));
    }

    @Test
    void maxAbsValExpr21() {
        int[] arr1 = {0,7,5,-3,8,3,5,4};
        int[] arr2 = {-5,8,5,3,0,1,-5,0};
        assertEquals(21, new Task1131().maxAbsValExpr(arr1, arr2));
    }
}