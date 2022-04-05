package org.mirraim;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RansomNote383Test {

    @Test
    void whenNotConstructThenFalse() {
        assertFalse(new RansomNote383().canConstruct("a", "b"));
    }

    @Test
    void whenPartiallyConstructThenFalse() {
        assertFalse(new RansomNote383().canConstruct("aa", "ab"));
    }

    @Test
    void whenConstructThenTrue() {
        assertTrue(new RansomNote383().canConstruct("aa", "aab"));
    }
}