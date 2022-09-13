package src.example.inheritance;

public class VIPCustomer extends Customer { //VIPCustomer 클래스는 Customer 클래스를 상속받음
    private int agentID; //VIP 고객 상담원 아이디
    double saleRatio; //할인율

    public VIPCustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName); //상위 클래스 생성자 호출
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        this.agentID = agentID;
        //System.out.println("VIPCustomer(int String) 생성자 호출");
    }
    /*
    public VIPCustomer() {
        customerGrade = "VIP"; //상위 클래스에서 private 변수이므로 오류 발생
        bonusRatio = 0.05;
        saleRatio = 0.1;
        System.out.println("VIPCustomer() 생성자 호출 "); //하위 클래스 생성할 때 콘솔 출력문
    }
     */
    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio; //보너스 포인트 적립
        return price - (int)(price * saleRatio); //할인된 가격을 계산하여 변환
    } //재정의한 메서드

    public int getAgentID() {
        return agentID;
    }
}
