package org.mirraim;

public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        int size = nums.length;
        int count = 0;
        int current = nums[0];

        for (int i = 1; i < size; i++) {
            int temp = nums[i];
            if (temp != current) {
                count++;
                current = temp;
                nums[count] = current;
            }
        }
        return ++count;
    }
}
