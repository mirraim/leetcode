package org.mirraim;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {

    @Test
    void removeDuplicates() {
        RemoveDuplicates duplicates = new RemoveDuplicates();
        int[] nums = {1, 1, 2};
        assertEquals(2, duplicates.removeDuplicates(nums));
    }
}