package org.mirraim;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TasksTest {

    @Test
    void deadline() {
        assertEquals(10, Tasks.deadline(List.of("6 5 10", "1 2 3 4 5 6")));
    }

    @Test
    void deadline2() {
        assertEquals(27, Tasks.deadline(List.of("5 7 12", "5 22 17 13 8")));
    }
}