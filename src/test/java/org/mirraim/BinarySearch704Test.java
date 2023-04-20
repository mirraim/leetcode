package org.mirraim;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearch704Test {

    @Test
    void search() {
        BinarySearch704 binarySearch = new BinarySearch704();
        int[] arr = new int[]{-1,0,3,5,9,12};

        assertEquals(4, binarySearch.search(arr, 9));
    }

    @Test
    void searchNotExisted() {
        BinarySearch704 binarySearch = new BinarySearch704();
        int[] arr = new int[]{-1,0,3,5,9,12};

        assertEquals(-1, binarySearch.search(arr, 2));
    }

    @Test
    void searchfirst() {
        BinarySearch704 binarySearch = new BinarySearch704();
        int[] arr = new int[]{2, 5};

        assertEquals(0, binarySearch.search(arr, 2));
    }
}