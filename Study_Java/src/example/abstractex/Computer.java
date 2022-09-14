package src.example.abstractex;

public abstract class Computer { //abstract 예약어 추가
    public abstract void display(); //더 이상 오류 없음
    public abstract void typing(); //더 이상 오류 없음
    public void turnOn() {
        System.out.println("전원을 켭니다.");
    }
    public void trunOff() {
        System.out.println("전원을 끕니다.");
    }
}
