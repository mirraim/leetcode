package org.mirraim;

public class SearchInsertPosition35 {
    int target;
    int[] nums;
    public int searchInsert(int[] nums, int target) {

        if (nums[0] > target) {
            return 0;
        }
        this.target = target;
        this.nums = nums;
        return rec(0, nums.length - 1);
    }

    private int rec(int begin, int end) {
        int med = begin + (end - begin) / 2;

        if (nums[med] == target) {
            return med;
        }
        if (nums[med] < target) {
            if (med == end || nums[med + 1] > target) {
                return med + 1;
            }
            return rec(med + 1, end);
        }
        return rec(begin, med);
    }
}
