package com.basic.array;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] numbers = {0,0,1,1,1,2,2,3,3,4};

// nums 是以“引用”方式传递的。也就是说，不对实参做任何拷贝
        int len = removeDuplicatesOfficial(numbers);

// 在函数里修改输入数组对于调用者是可见的。
// 根据你的函数返回的长度, 它会打印出数组中该长度范围内的所有元素。
        for (int i = 0; i < len; i++) {
            System.out.print(numbers[i]);
        }
    }

    private static int removeDuplicatesOfficial(int[] nums){
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    private static int removeDuplicates(int[] numbers){

        Set<Integer> numberSet = new HashSet<Integer>();
        for(int num : numbers){
            numberSet.add(num);
        }
        Iterator<Integer> iterator = numberSet.iterator();

        int[] numberResult =  new int[numberSet.size()];
        int i = 0;
        while (iterator.hasNext()){
            numberResult[i] = iterator.next();
            i++;
        }

        numbers = numberResult;
        return numbers.length;
    }
}
