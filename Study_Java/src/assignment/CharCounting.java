package src.assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class CharCounting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("문자를 입력해주세요");
        String input = sc.next();
        int maxCount = 0; //가장 많이 나온 단어가 나온 횟수를 저장할 변수
        char maxWord = 0; //가장 많이 나온 단어를 저장할 변수
        boolean includeWord = false; //이미 조회했던 단어인지를 알려주는 변수
        boolean questionMark = false; //물음표의 출력 여부를 저장할 변수

        ArrayList<Character> inputUsing = new ArrayList<Character>(); //이미 조회했던 단어들을 저장할 ArrayList 배열

        for(int i = 0; i < input.length(); i++) { //입력받은 문자열길이 만큼 반복문
            for(char x : inputUsing) { //이미 조회했던 단어인지 검색하기 위한 반복문
                if(input.charAt(i) == x ) { //이미 조회했었다면
                    includeWord = true; // includeWord에 true를 넣어줌
                    break; //그리고 반복문 탈출
                } else {
                    includeWord = false; //조회된 적이 없다면 false를 대입
                }
            }
            int Count = 0; //단어가 반복된 횟수를 저장할 변수
            for(int j = 0; j < input.length(); j++) { //입력받은 문자열길이 만큼 반복문
                if(includeWord == true) { //만약 포함된 단어라면
                    break; //반복문을 탈출
                }
                if(input.charAt(i) == input.charAt(j)){ //검색하는 단어와 동일하다면
                    Count += 1; //Count변수에 1씩 더함
                }
            }
            if(maxCount < Count) { //만약 횟수가 최대 횟수보다 많다면
                maxCount = Count; //maxCount에 Count를 대입
                maxWord = input.charAt(i); //maxWord에 그 문자를 대입
                questionMark = false; //questionMark에 flase를 대입
            }else if(maxCount == Count) { //만약 횟수가 최대 횟수와 동일하다면
                questionMark = true; //questionMark에 true를 대입
            }
            inputUsing.add((input.charAt(i))); //inputUsing 배열에 검색한 단어를 넣어줌
        }
        if (questionMark == true){ //만약 questionMark가 true라면 ?를 출력
            System.out.println("?");
        } else { //아니라면 maxWord와 maxCount를 출력
            System.out.println("가장 많이 나온 단어는 " + Character.toUpperCase(maxWord) + "이며, 횟수는 " + maxCount + "번 입니다.");
        }
    }
}
