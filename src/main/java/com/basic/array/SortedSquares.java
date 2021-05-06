package com.basic.array;

import java.util.List;

public class SortedSquares {
    public static void main(String[] args) {

        System.out.println( -3 * -2);
    }

    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        for (int i = 0, j = n-1, p = j; i <= j;) {
            if (nums[i] * nums[i] > nums[j] * nums[j]) {
                result[p] = nums[i] * nums[i];
                i++;
            }else {
                result[p] = nums[j] * nums[j];
                j--;
            }
            p--;
        }
        return result;
    }
}
