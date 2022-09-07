package src.problem_solving.problem_152p;

public class Order_sheetTest {

    public static void main(String[] args) {

        Order_sheet order_sheet1 = new Order_sheet();
        order_sheet1.Order_sheet_number = 201803120001L;
        order_sheet1.Order_sheet_ID = "abc123";
        order_sheet1.Order_sheet_date = "2018년3월12일";
        order_sheet1.Order_sheet_name = "홍길동";
        order_sheet1.Order_sheet_product_number = "PD0345-12";
        order_sheet1.Order_sheet_add = "서울시 영등포구 여의도동 20번지";

        order_sheet1.getOrder_sheet();

    }
}
