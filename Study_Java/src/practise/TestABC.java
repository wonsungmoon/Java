package src.practise;

public class TestABC {
    public static void main(String[] args) {
        C c = new C();
        B b = new B();
        A a = (A)new B();
        System.out.println(c.add(1,2));
        System.out.println(b.add(1,2));
        System.out.println(a.add(1,2));
    }
}
