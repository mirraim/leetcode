package org.mirraim;
/**
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 *
 * The overall run time complexity should be O(log (m+n)).
 *
 * Example 1:
 *
 * Input: nums1 = [1,3], nums2 = [2]
 * Output: 2.00000
 * Explanation: merged array = [1,2,3] and median is 2.
 *
 * Example 2:
 *
 * Input: nums1 = [1,2], nums2 = [3,4]
 * Output: 2.50000
 * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 */
public class TwoSortedArraysMedian4 {
    private int[] nums1;
    private int[] nums2;
    private int size;
    int indexFirst = 0;
    int indexSecond = 0;
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        this.size =  nums1.length + nums2.length;
        if(size % 2 == 0) {
            return findAvg();
        }
        return findMedian();
    }

    private double findAvg() {
        int median = size / 2;
        int prev = min();
        int current = prev;
        for (int i = 1; i <= median; i++) {
            current = getcurrent();
           if (i < median) {
               prev = current;
           }
        }
        return (prev + current) / 2.0;
    }

    private double findMedian() {
        int median = size / 2;
        int current = min();
        for (int i = 1; i <= median; i++) {
           current = getcurrent();
        }
        return current;
    }

    private int getcurrent() {
        int current;
        if (indexFirst < nums1.length) {
            if (indexSecond < nums2.length) {
                current = min();
            } else {
                current = nums1[indexFirst];
                indexFirst++;
            }
        } else {
            current = nums2[indexSecond];
            indexSecond++;
        }
        return current;
    }

    private int min() {
        int rsl;
        if (nums1.length == 0) {
            return nums2[indexSecond++];
        }
        if (nums2.length == 0) {
            return nums1[indexFirst++];
        }
        if (nums1[indexFirst] > nums2[indexSecond]) {
            rsl = nums2[indexSecond];
            indexSecond++;
        } else {
            rsl = nums1[indexFirst];
            indexFirst++;
        }
        return  rsl;
    }

}
