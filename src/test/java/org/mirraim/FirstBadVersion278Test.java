package org.mirraim;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FirstBadVersion278Test {

    @Test
    void firstBadVersion() {
        FirstBadVersion278 firstBadVersion = new FirstBadVersion278();
        firstBadVersion.setVersions(List.of(false, false, false, true, true));
        assertEquals(4, firstBadVersion.firstBadVersion(5));
    }

    @Test
    void firstBadVersionfirst() {
        FirstBadVersion278 firstBadVersion = new FirstBadVersion278();
        firstBadVersion.setVersions(List.of(true));
        assertEquals(1, firstBadVersion.firstBadVersion(1));
    }

    @Test
    void firstBadVersionLast() {
        FirstBadVersion278 firstBadVersion = new FirstBadVersion278();
        firstBadVersion.setVersions(List.of(false, true));
        assertEquals(2, firstBadVersion.firstBadVersion(2));
    }

    @Test
    void firstBadVersionTwo() {
        FirstBadVersion278 firstBadVersion = new FirstBadVersion278();
        firstBadVersion.setVersions(List.of(true, true, true));
        assertEquals(1, firstBadVersion.firstBadVersion(3));
    }
}