package src.assignment;

import java.util.Scanner;

public class CharCounting2Answer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자를 입력해주세요");

        String str = sc.next().toUpperCase();

        int[] arr = new int[26];
        int max = 0;
        char ch = '?';

        for (int i = 0; i < str.length(); i++) {
            arr[(int)str.charAt(i) - 65]++; // char A = 65 , Z= 90
        }

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                ch = (char) (i+65);
            }
            else if (max == arr[i]) {
                ch = '?';
            }
        }

        System.out.print(ch);
    }
}

