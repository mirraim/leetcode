package org.mirraim;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CombinationSum39Test {

    @Test
    void combinationSum() {
        int[] combination = {2,3,6,7};
        int target = 7;
        List<List<Integer>> expected = List.of(List.of(2,2,3), List.of(7));
        assertEquals(expected, new CombinationSum39().combinationSum(combination, target));
    }
}