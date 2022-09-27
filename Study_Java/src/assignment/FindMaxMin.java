package src.assignment;

import java.util.Scanner;

public class FindMaxMin {
    public static void main(String[] main) {
        int maxNum = -1;
        int minNum = 99999;
        String nums;

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요.(ex : 20 30 40 50 )");
        nums = sc.nextLine();
        String[] arr = nums.split(" ");
        for (String x : arr) {
            int num = Integer.parseInt(x);
            if (maxNum < num) {
                maxNum = num;
            }
            if (minNum > num) {
                minNum = num;
            }
        }
        System.out.println("최댓값은 " + maxNum + "입니다.");
        System.out.println("최솟값은 " + minNum + "입니다.");
    }
}
