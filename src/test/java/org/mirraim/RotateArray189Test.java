package org.mirraim;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateArray189Test {

    @Test
    void rotate() {
        RotateArray189 service = new RotateArray189();
        int[] nums = new int[] {1,2,3,4,5,6,7};
        service.rotate(nums, 3);
        for (int el: nums) {
            System.out.print(el + " ");
        }
        Assertions.assertArrayEquals(new int[]{5,6,7,1,2,3,4}, nums);
    }

    @Test
    void rotate1() {
        RotateArray189 service = new RotateArray189();
        int[] nums = new int[] {-1,-100,3,99};
        service.rotate(nums, 2);
        Assertions.assertArrayEquals(new int[]{3,99,-1,-100}, nums);
    }

    @Test
    void rotate2() {
        RotateArray189 service = new RotateArray189();
        int[] nums = new int[] {1};
        service.rotate(nums, 1);
        Assertions.assertArrayEquals(new int[]{1}, nums);
    }

    @Test
    void rotate3() {
        RotateArray189 service = new RotateArray189();
        int[] nums = new int[] {1,2};
        service.rotate(nums, 2);
        Assertions.assertArrayEquals(new int[]{1,2}, nums);
    }

    @Test
    void rotate4() {
        RotateArray189 service = new RotateArray189();
        int[] nums = new int[] {1,2,3};
        service.rotate(nums, 2);
        Assertions.assertArrayEquals(new int[]{2,3,1}, nums);
    }

}