package src.assignment;

import java.util.Scanner;

public class CharCounting2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("문자를 입력해주세요");
        String input = sc.next().toUpperCase();

        String wordUsing = "";
        for(int i = 0; i < input.length(); i++){
            boolean includeNum = false;
            for(int j = 0; j < wordUsing.length(); j++) {
                if(input.charAt(i) == wordUsing.charAt(j)) {
                    includeNum = true;
                }
            }
            if (includeNum == false) {
                wordUsing = wordUsing + input.charAt(i);
            }
        }
        int [][] array = new int[wordUsing.length()][2];

        for(int i = 0; i < wordUsing.length(); i++) {
            array[i][0] = wordUsing.charAt(i);
            int Count = 0;
            for(int j = 0; j < input.length(); j++) {
                if (array[i][0] == input.charAt(j)) {
                    Count += 1;
                }
            }
            array[i][1] = Count;
        }
        int maxNum = 0;
        char maxWord = 0;
        boolean sameNum = false;
        for(int i = 0; i < array.length; i++) {
            if(maxNum < array[i][1]) {
                maxNum = array[i][1];
                maxWord = (char)array[i][0];
                sameNum = false;
            } else if (maxNum == array[i][1]) {
                sameNum = true;
            }
        }
        if(sameNum == false) {
            System.out.println("가장 많이 반복된 알파벳은 " + maxWord + "이며, 반복된 횟수는 " + maxNum + "입니다.");
        } else {
            System.out.println("?");
        }
    }
}
