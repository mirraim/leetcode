package org.mirraim;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HammingTest {

    @Test
    void calc() {
        String rsl = Hamming.calc("01000 00110", 5);
        assertEquals("01100", rsl);
    }

    @Test
    void calc1() {
        String rsl = Hamming.calc("00000 11111", 5);
        assertEquals("01010", rsl);
    }

    @Test
    void calc2() {
        String rsl = Hamming.calc("00001 00111", 5);
        assertEquals("00011", rsl);
    }

    @Test
    void calc3() {
        String rsl = Hamming.calc("00 01", 2);
        assertEquals("00", rsl);
    }
}