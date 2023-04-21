package org.mirraim;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SortedSquares977Test {

    @Test
    void sortedSquares() {
        SortedSquares977 service = new SortedSquares977();
        List<Integer> expected = List.of(0,1,9,16,100);
        int[] result = service.sortedSquares(new int[]{-4,-1,0,3,10});
        List<Integer> rsl = new ArrayList<>();
        for(int el : result) {
            rsl.add(el);
        }
        assertEquals(expected, rsl);
    }

    @Test
    void sortedSquares1() {
        SortedSquares977 service = new SortedSquares977();
        List<Integer> expected = List.of(4,9,9,49,121);
        int[] result = service.sortedSquares(new int[]{-7,-3,2,3,11});
        List<Integer> rsl = new ArrayList<>();
        for(int el : result) {
            rsl.add(el);
        }
        assertEquals(expected, rsl);
    }

    @Test
    void sortedSquares2() {
        SortedSquares977 service = new SortedSquares977();
        List<Integer> expected = List.of(1);
        int[] result = service.sortedSquares(new int[]{-1});
        List<Integer> rsl = new ArrayList<>();
        for(int el : result) {
            rsl.add(el);
        }
        assertEquals(expected, rsl);
    }

    @Test
    void sortedSquares3() {
        SortedSquares977 service = new SortedSquares977();
        List<Integer> expected = List.of(1,4,9,25);
        int[] result = service.sortedSquares(new int[]{-5,-3,-2,-1});
        List<Integer> rsl = new ArrayList<>();
        for(int el : result) {
            rsl.add(el);
        }
        assertEquals(expected, rsl);
    }

    @Test
    void sortedSquares4() {
        SortedSquares977 service = new SortedSquares977();
        List<Integer> expected = List.of(0, 4);
        int[] result = service.sortedSquares(new int[]{-2, 0});
        List<Integer> rsl = new ArrayList<>();
        for(int el : result) {
            rsl.add(el);
        }
        assertEquals(expected, rsl);
    }
}