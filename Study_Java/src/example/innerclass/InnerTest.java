package src.example.innerclass;

class OutClass {
    private int num = 10;
    private static int sNum = 20;

    private InClass inClass;

    public OutClass() {
        inClass = new InClass();
    }

    class InClass {
        int inNum = 100;

        void inTest() {
            System.out.println("OutClass num = " + num + "(외부 크래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수)");
        }
    }
    public void usingClass() {
        inClass.inTest();
    }

    static class InStaticClass { //정적 내부 클래스
        int inNum = 100; //정적 내부 클래스의 인스턴스 변수
        static int sInNum = 200; //정적 내부 클래스의 정적 변수

        void inTest() {   //정적 클래스의 일반 메서드
            //num += 10;    // 외부 클래스의 인스턴스 변수는 사용할 수 없음.
            System.out.println("InStaticClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수 사용)");
            System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 정적 변수 사용)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수 사용)");
        }

        static void sTest() {  // 정적 내부 클래스의 정적 메서드
            //num += 10;   // 외부 클래스의 인스턴스 변수는 사용할 수 없음.
            //inNum += 10; // 내부 클래스의 인스턴스 변수는 사용할 수 없음
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수 사용)");
            System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 정적 변수 사용)");
        }
    }
}

public class InnerTest {
    public static void main(String[] args) {
        OutClass.InStaticClass sInClass = new OutClass.InStaticClass(); //외부 클래스를 생성하지 않고 바로 정적 내부 클래스 생성 가능
        System.out.println("정적 내부 클래스 일반 메서드 호출");
        sInClass.inTest();
        System.out.println();
        System.out.println("정적 내부 클래스의 정적 메서드 호출");
        OutClass.InStaticClass.sTest();
    }
}