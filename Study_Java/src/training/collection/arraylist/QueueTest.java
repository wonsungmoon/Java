package src.training.collection.arraylist;

import java.util.ArrayList;

class MyQueue {
    private ArrayList<String> arrayQueue = new ArrayList<String>();

    public void enQueue(String data) {
        arrayQueue.add(data);
    } //큐의 맨 뒤에 추가

    public String deQueue() {
        int len = arrayQueue.size();
        if(len == 0) {
            System.out.println("큐가 비어있습니다");
            return null;
        }

        return(arrayQueue.remove(0)); //맨 앞의 자료 반환하고 배열에서 제거
    } //큐의 맨 앞에서 꺼냄
}

public class QueueTest {
    public static void main(String[] args) {

        MyQueue queue = new MyQueue();
        queue.enQueue("A");
        queue.enQueue("B");
        queue.enQueue("C");
        //아래 사진1 참고
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        //아래 사진2 참고
    }
}