package org.mirraim;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReadingTest {

    @Test
    void read() {
        assertEquals(Reading.read(List.of("5", "4 1 3 0 2")), 10.0, 0.1);
    }

    @Test
    void read1() {
        assertEquals(Reading.read(List.of("2", "-1 -2")), 1.5, 0.1);
    }
}