package org.mirraim;

import java.util.*;

/**
 * 39. Combination Sum
 *
 * Given an array of distinct integers candidates and a target integer target,
 * return a list of all unique combinations of candidates where the chosen numbers sum to target.
 * You may return the combinations in any order.
 *
 * The same number may be chosen from candidates an unlimited number of times.
 * Two combinations are unique if the frequency of at least one of the chosen numbers is different.
 *
 * It is guaranteed that the number of unique combinations that sum up to target is
 * less than 150 combinations for the given input.
 */
public class CombinationSum39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Set<List<Integer>> resultSet = new HashSet<>();

        for (int candidate : candidates) {
            List<Integer> combination = new LinkedList<>();
            combination.add(candidate);
            if (candidate == target) {
                resultSet.add(combination);
            }
            checkSum(resultSet, combination, candidates, target, candidate);
        }
        return new ArrayList<>(resultSet);
    }

    private void checkSum(Set<List<Integer>> resultSet, List<Integer> combination,
                                        int[] candidates, int target, int sum) {
        for (int candidate : candidates) {
            int temp = sum + candidate;
            if (temp <= target) {
                List<Integer> currComby = new LinkedList<>(combination);
                currComby.add(candidate);
                if (temp == target) {
                    Collections.sort(currComby);
                    resultSet.add(currComby);
                } else {
                    checkSum(resultSet, currComby, candidates, target, temp);
                }
            }
        }
    }
}
