package org.mirraim;

/**
 * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 * Example 1:
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * Example 2:
 * Input: nums = [-1,-100,3,99], k = 2
 * Output: [3,99,-1,-100]
 */
public class RotateArray189 {

    public void rotate(int[] nums, int k) {
        int size = nums.length;
        if (size > 1){
            if (k >= size) {
                k = k % size;
            }
            int[] temp = new int[k];
            for (int i = 0; i < k; i++) {
                temp[i] = nums[size + i - k];
            }
            for (int i = nums.length - 1; i >= k; i--) {
                nums[i] = nums[i - k];
            }
            for (int i = 0; i < k; i++) {
                nums[i] = temp[i];
            }
        }
    }
}
