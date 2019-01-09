package com.basic.array;

public class FindPivotIndex {
    public static void main(String[] args) {
        int[] numbers = {1, 7, 3,5,6,5,5, 6};

        int[] num = {1,2,3};
        System.out.println(getPivotIndex(num));
    }

    public static int pivotIndexOfficial(int[] nums) {
        int sum = 0, leftsum = 0;
        for (int x: nums) sum += x;
        for (int i = 0; i < nums.length; ++i) {
            if (leftsum == sum - leftsum - nums[i])
                return i;
            leftsum += nums[i];
        }
        return -1;
    }


    private static int getPivotIndex(int[] numbers){
        int pivotIndex = -1;

        int sum = 0;
        for(int number : numbers){
             sum += number;
        }

        int halfSum = 0;
        for(int i = 0; i < numbers.length; i++){

            if(halfSum == sum - halfSum - numbers[i]){
                pivotIndex = i;
                break;
            }
            halfSum += numbers[i];
        }

        return pivotIndex;
    }
}
