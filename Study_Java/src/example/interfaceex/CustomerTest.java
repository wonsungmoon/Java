package src.example.interfaceex;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();

        Buy buyer = customer;
        buyer.buy();
        buyer.order(); //재정의된 메서드 호출됨

        Sell seller = customer;
        seller.sell();
        seller.order(); //재정의된 메서드 호출됨

        if(seller instanceof Customer) {
            Customer customer2 = (Customer)seller;
            customer2.buy();
            customer2.sell();
        }
        customer.order(); //재정의된 메서드 호출됨
    }
}
