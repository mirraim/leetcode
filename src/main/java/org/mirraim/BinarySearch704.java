package org.mirraim;

/**
 * Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * Example 1:
 *
 * Input: nums = [-1,0,3,5,9,12], target = 9
 * Output: 4
 * Explanation: 9 exists in nums and its index is 4
 * Example 2:
 *
 * Input: nums = [-1,0,3,5,9,12], target = 2
 * Output: -1
 * Explanation: 2 does not exist in nums so return -1
 */
public class BinarySearch704 {
    public int search(int[] nums, int target) {
        int med = nums.length / 2;
        int begin = 0;
        int end = nums.length - 1;
        int result = -1;
        while(true) {
            if (nums[med] == target) {
                result = med;
                break;
            }
            if (nums[begin] == target) {
                result = begin;
                break;
            }
            if (nums[end] == target) {
                result = end;
                break;
            }
            if (nums[med] < target) {
                begin = med;
                med = begin + (end - begin) / 2;

                if (begin == med) {break;}
            } else {
               end = med;
               med = (end + 1) / 2;
               if (end == med) {break;}
            }
        }
        return result;
    }
}
