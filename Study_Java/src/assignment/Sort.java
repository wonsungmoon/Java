package src.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        String[] input;

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요.(ex : 20 30 40 50 )");
        input = sc.nextLine().split(" ");
        int[] nums = new int[input.length];
        for(int i=0; i<input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        Scanner sortChoice = new Scanner(System.in);
        System.out.println("원하는 정렬 방식을 선택해주세요.(번호로 선택)");
        System.out.println("1. 선택정렬");
        System.out.println("2. 삽입정렬");
        System.out.println("3. 버블정렬");
        String input2;
        input2 = sortChoice.next();
        System.out.println(input2);
        switch (input2) {
            case "1" -> {
                for(int i = 0; i < nums.length; i++) {
                    int MinIndex = i;
                    for(int j = i + 1; j < nums.length; j++) {
                        if(nums[MinIndex] > nums[j])
                            MinIndex = j;
                    }
                    int temp = nums[MinIndex];
                    nums[MinIndex] = nums[i];
                    nums[i] = temp;
                }
                System.out.println("선택정렬 : " + Arrays.toString(nums));
            }
            case "2" -> {
                for(int end = 1; end < nums.length; end++) {
                    for(int i = end; i > 0; i--){
                        if(nums[i-1] > nums[i]){
                            int temp = nums[i-1];
                            nums[i-1] = nums[i];
                            nums[i] = temp;
                        }
                    }
                }
                System.out.println("삽입정렬 : " + Arrays.toString(nums));
            }
            case "3" -> {
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
            default -> System.out.println("선택불가한 번호입니다.");
        }

        /* 선택 정렬
        for(int i = 0; i < nums.length; i++) {
            int MinIndex = i;
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[MinIndex] > nums[j])
                    MinIndex = j;
                }
                int temp = nums[MinIndex];
                nums[MinIndex] = nums[i];
                nums[i] = temp;
            }
        System.out.println("선택정렬 : " + Arrays.toString(nums));
        */
        
        /* //삽입 정렬
        for(int end = 1; end < nums.length; end++) {
            for(int i = end; i > 0; i--){
                if(nums[i-1] > nums[i]){
                    int temp = nums[i-1];
                    nums[i-1] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        System.out.println("삽입정렬 : " + Arrays.toString(nums));
        */
        
        /* 버블 정렬
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
        */

        /* 오름차순, 내림차순 정렬
        Arrays.sort(nums);
        System.out.println("오름차순 정렬 : " + Arrays.toString(nums));

        Integer[] numsArr = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(numsArr, Comparator.reverseOrder());
        System.out.println("내림차순 정렬 : " + Arrays.toString(numsArr));
        */
    }
}
