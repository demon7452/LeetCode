package com.basic.array;

public class MaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;

        int count = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
            }else {
                max = Math.max(count, max);
                count = 0;
            }
        }
        return max;
    }
}
