package org.mirraim;

import java.util.*;

/**
 * 1260. Shift 2D Grid
 * Given a 2D grid of size m x n and an integer k. You need to shift the grid k times.
 * <p>
 * In one shift operation:
 * <p>
 * Element at grid[i][j] moves to grid[i][j + 1].
 * Element at grid[i][n - 1] moves to grid[i + 1][0].
 * Element at grid[m - 1][n - 1] moves to grid[0][0].
 * Return the 2D grid after applying shift operation k times.
 */
public class Shift2DGreed1260 {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        LinkedList <Integer> flow = new LinkedList<>();
        int innerSize = grid[0].length;
        int gridSize = grid.length * innerSize;
        int limit = gridSize - (k % gridSize);
        Arrays.stream(grid)
                .flatMapToInt(Arrays::stream)
                .skip(limit)
                .forEach(flow::add);
        Arrays.stream(grid)
                .flatMapToInt(Arrays::stream)
                .limit(limit)
                .forEach(flow::add);
        System.out.println();
        List<List<Integer>> result = new ArrayList<>();
        Iterator<Integer> iterator = flow.iterator();
        for (int i = 0; i < flow.size() / innerSize; i++) {
            List<Integer> current = new ArrayList<>();
            for (int j = 0; j < innerSize; j++) {
                current.add(iterator.next());
            }
            result.add(current);
        }
        return result;
    }
}
