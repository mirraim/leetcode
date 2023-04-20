package org.mirraim;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToDealTest {

    @Test
    void check() {
        BestTimeToDeal bestTimeToDeal = new BestTimeToDeal();

        int rsl = bestTimeToDeal.maxProfit(new int[]{7,1,5,3,6,4});
        assertEquals(7, rsl);
    }
}