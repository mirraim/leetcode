package org.mirraim;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSortedArraysMedian4Test {

    @Test
    void findMedianSortedArrays() {
        TwoSortedArraysMedian4 service = new TwoSortedArraysMedian4();
        assertEquals(2, service.findMedianSortedArrays(new int[]{1,3}, new int[]{2}));
    }

    @Test
    void findMedianSortedArrays2() {
        TwoSortedArraysMedian4 service = new TwoSortedArraysMedian4();
        assertEquals(2.5, service.findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}));
    }

    @Test
    void findMedianSortedArrays3() {
        TwoSortedArraysMedian4 service = new TwoSortedArraysMedian4();
        assertEquals(1, service.findMedianSortedArrays(new int[]{}, new int[]{1}));
    }
}