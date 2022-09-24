package src.training.collection;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<String>();

        myList.add("A");
        myList.add("B");
        myList.add("C");
        //링크드 리트스에 요소 추가
        System.out.println(myList); //리스트 전체 출력

        myList.add(1, "D"); //링크드 리스트의 첫 번째 위치에 D추가
        System.out.println(myList);

        myList.addFirst("O"); //연결 리스트의 맨 앞에 0추가
        System.out.println(myList);

        System.out.println(myList.removeLast()); //연결 리스트의 맨 뒤 요소 삭제 후 해당 요소를 출력
        System.out.println(myList);
    }
}
