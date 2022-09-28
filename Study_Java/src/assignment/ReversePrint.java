package src.assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class ReversePrint {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요");
        String[] arr = sc.nextLine().split("");

        ArrayList<Integer> reverseList = new ArrayList<Integer>();
        for(int i = arr.length; i > 0; i--) {
            reverseList.add(Integer.parseInt(arr[i-1]));
        }
        System.out.println(reverseList);
    }
}
