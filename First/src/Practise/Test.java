package src.Practise;

public class Test {
        public static void main(String[] args){
            int n = 20;
            int n2 = 0;
            divide(n,n2);
        }
        public static void divide(int num1, int num2) {
            if (num2 == 0) {
                System.out.println("나누는 수가 0이 될 수 없습니다.");
                return; //함수 수행 종료
            } else {
                int result = num1 / num2;
                System.out.println(num1 + "/" + num2 + "=" + result + "입니다.");
        }
    }

}


