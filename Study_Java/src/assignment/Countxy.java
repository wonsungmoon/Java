package src.assignment;

import java.util.Scanner;

public class Countxy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("x또는 y를 입력해주세요.(ex : xyyyxyyxxxxyxxyxx )");
        String[] input = sc.nextLine().split("");
        int total = 0;
        int xCounting = 0;
        for(int i = 0; i < input.length; i++) {

            if(input[i].equals("x")) {
                total += ++xCounting;
            }
            else {
                xCounting = 0;
            }
        }
        System.out.println(total);
    }

}
