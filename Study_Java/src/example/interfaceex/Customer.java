package src.example.interfaceex;

public class Customer implements Buy, Sell {
    @Override
    public void sell() {
        System.out.println("판매하기");
    }

    @Override
    public void buy() {
        System.out.println("구매하기");
    }

    @Override
    public void order() {
        System.out.println("고객 판매 주문");
    } //디폴트 메서드 order()를 Customer 클래스에서 재정의함
}