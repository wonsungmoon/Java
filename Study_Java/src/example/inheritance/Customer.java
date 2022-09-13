package src.example.inheritance;

public class Customer {
    protected int customerID; //고객 아이디
    protected String customerName; //고객 이름
    protected String customerGrade; //고객 등급
    int bonusPoint; //보너스 포인트
    double bonusRatio; //적립 비율
    //멤버 변수
    public Customer() {
        customerGrade = "SILVER"; //기본 동급
        bonusRatio = 0.01; //보너스 포인트 기본 적립 비율
    } //디폴트 생성자
    
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio; //보너스 포인트 계산
        return price;
    } //보너스 포인트 적립, 지불 가격 계산 메서드
    
    public String showCustomerInfo() {
        return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는" + bonusPoint + "입니다.";
    } //고객 정보를 반환하는 메서드

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }
    //protected 예약어로 선언한 변수를 외부에서 사용할 수 있도록 get(), set() 메서드 추가
}