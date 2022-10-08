package src.assignment;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        int[] nums = { 3, 1, 5, 4, 2 };
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length - i - 1; j++) {
                if(nums[j] > nums[j+1]) {
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println("버블정렬 : " + Arrays.toString(nums));
    }
}

