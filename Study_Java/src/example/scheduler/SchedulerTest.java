package src.example.scheduler;

import java.io.IOException;

public class SchedulerTest {
    public static void main(String[] args) throws IOException /*문자를 입력받는 System.in.read()를 사용하려면 IOException에서 오류를 처리해야 합니다. 지금은 이 정도로만 이해하고 14장과 15장에서 자세히 설명하겠습니다. */ {
        System.out.println("전화 상담 할당 방식을 선택하세요.");
        System.out.println("R : 한명씩 차례로 할당 ");
        System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당 ");
        System.out.println("P : 우선순위가 높은 고객 먼저 할당");

        int ch = System.in.read(); //할당 방식을 입력받아 ch 변수에 대입
        Scheduler scheduler = null;

        if(ch == 'R' || ch == 'r') {
            scheduler = new RoundRobin();
        } //입력받은 값이 R 또는 r이면 RoundRobin 클래스 생성
        else if(ch == 'L' || ch == 'l') {
            scheduler = new LeastJob();
        } //입력받은 값이 L 또는 l이면 LeastJob 클래스 생성
        else if(ch == 'P' || ch == 'p') {
            scheduler = new PriorityAllocation();
        } //입력받은 값이 P 또는 p이면 PriorityAllocation 클래스 생성
        else {
            System.out.println("지원되지 않는 기능입니다.");
            return;
        }

        scheduler.getNextCall();
        scheduler.sendCallToAgent();
        //어떤 정책인가와 상관없이 인터페이스에 선언하 메서드 호출
    }
}