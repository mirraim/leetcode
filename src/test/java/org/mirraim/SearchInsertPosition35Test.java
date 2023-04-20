package org.mirraim;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPosition35Test {
    int[] nums = new int[]{1,3,5,6};

    @Test
    void searchInsertOne() {
        SearchInsertPosition35 searchInsertPosition = new SearchInsertPosition35();
        assertEquals(2, searchInsertPosition.searchInsert(nums, 5));
    }

    @Test
    void searchInsertTwo() {
        SearchInsertPosition35 searchInsertPosition = new SearchInsertPosition35();
        assertEquals(1, searchInsertPosition.searchInsert(nums, 2));
    }

    @Test
    void searchInsertThree() {
        SearchInsertPosition35 searchInsertPosition = new SearchInsertPosition35();
        assertEquals(4, searchInsertPosition.searchInsert(nums, 7));
    }

    @Test
    void searchInsertFour() {
        SearchInsertPosition35 searchInsertPosition = new SearchInsertPosition35();
        assertEquals(0, searchInsertPosition.searchInsert(nums, -1));
    }
}