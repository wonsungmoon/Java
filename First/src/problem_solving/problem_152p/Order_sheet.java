package src.problem_solving.problem_152p;

public class Order_sheet {
    long Order_sheet_number ;
    String Order_sheet_ID;
    String Order_sheet_date;
    String Order_sheet_name;
    String Order_sheet_product_number;
    String Order_sheet_add;

    public void setOrder_sheet_number(long number) {Order_sheet_number = number;}
    public void setOrder_sheet_ID(String ID) {Order_sheet_ID = ID;}
    public void setOrder_sheet_date(String date) {Order_sheet_date = date;}
    public void setOrder_sheet_name(String name) {Order_sheet_name = name;}
    public void setOrder_sheet_product_number(String product_number) {Order_sheet_product_number = product_number;}
    public void setOrder_sheet_add(String add) {Order_sheet_add = add;}

    void getOrder_sheet() {
        System.out.println(Order_sheet_number);
        System.out.println(Order_sheet_ID);
        System.out.println(Order_sheet_date);
        System.out.println(Order_sheet_name);
        System.out.println(Order_sheet_product_number);
        System.out.println(Order_sheet_add);
        return;
    }
}
