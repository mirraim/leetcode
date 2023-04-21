package org.mirraim;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

 * Example 1:
 * Input: nums = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Explanation: After squaring, the array becomes [16,1,0,9,100].
 * After sorting, it becomes [0,1,9,16,100].
 * Example 2:
 * Input: nums = [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 */
public class SortedSquares977 {
    private int[] negative;
    private int negCount;
    private int size;
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int el = nums[i];
            nums[i] = el * el;
        }
        Arrays.sort(nums);
        return nums;
    }

    private int square(int[] nums, int index) {
        return nums[index] * nums[index];
    }

    private void fillNegative(int[] nums) {
        int count = 0;
        while (nums[count] < 0) {
                negative[count] = square(nums, count);
                count++;
            if (count >= size) {
                break;
            }
        }
        this.negCount = count;
    }

    private int[] loops(int[] nums) {
        this.size = nums.length;
        negative = new int[size];
        fillNegative(nums);
        int positiveIndex = negCount;
        int negativeIndex = negCount - 1;
        int[] result = new int[size];
        if (negCount == size) {
            Arrays.sort(negative);
            return negative;
        }
        int current = square(nums, positiveIndex);
        for (int i = 0; i < size; i++) {
            if (negCount == 0 || negativeIndex < 0) {
                result[i] = square(nums, i);
            } else {
                if (negative[negativeIndex] >= current && positiveIndex != size) {
                    result[i] = current;
                    positiveIndex++;
                    if (positiveIndex < size) {
                        current = square(nums, positiveIndex);
                    }
                } else {
                    result[i] = negative[negativeIndex];
                    negativeIndex--;
                }
            }
        }
        return result;
    }

}
