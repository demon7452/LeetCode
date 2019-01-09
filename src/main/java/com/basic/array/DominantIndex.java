package com.basic.array;

public class DominantIndex {

    public static void main(String[] args) {

        int[] numbers = {0,0,0,3,2};

        System.out.println(getDominantIndex(numbers));
    }

    private static int getDominantIndex(int[] numbers){

        if(numbers.length == 0){
            return -1;
        }else if(1 == numbers.length){
            return 0;
        }

        int dominantIndex = -1;
        int max = 0;
        int secondMax = 0;

        for(int i = 0; i < numbers.length; i++){

            int number = numbers[i];

            if(max < number){
                secondMax = max;
                max = number;
                dominantIndex = i;
            }else if (secondMax < number){
                secondMax = number;
            }

        }

        if(secondMax *2 > max){
            return -1;
        }

        return dominantIndex;
    }

    public int dominantIndexOfficial(int[] nums) {
        int maxIndex = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] > nums[maxIndex])
                maxIndex = i;
        }
        for (int i = 0; i < nums.length; ++i) {
            if (maxIndex != i && nums[maxIndex] < 2 * nums[i])
                return -1;
        }
        return maxIndex;
    }
}
