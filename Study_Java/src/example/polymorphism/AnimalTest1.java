package src.example.polymorphism;
import java.util.ArrayList;

class Animal {
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
} //상위 클래스 Animal

class Human extends Animal {
    public void move() {
        System.out.println("사람이 두 발로 걷습니다.");
    }

    public void readBook() {
        System.out.println("사람이 책을 읽습니다.");
    }
} //Animal을 상속받은 Human 클래스

class Tiger extends Animal {
    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }

    public void hunting() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
} //Animal을 상속받은 Tiger 클래스

class Eagle extends Animal {
    public void move() {
        System.out.println("독수리가 하늘을 납니다.");
    }

    public void flying() {
        System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
    }
} //Animal을 상속받은 Eagle 클래스

public class AnimalTest1 {
    ArrayList<Animal> aniList = new ArrayList<Animal>(); //배열의 자료형은 Animal로 지정

    public static void main(String[] args) {
        AnimalTest1 aTest = new AnimalTest1();
        aTest.addAnimal();
        System.out.println("원래 형으로 다운 캐스팅");
        aTest.testCasting();
        System.out.println(aTest);
    }

    public void addAnimal() {
        aniList.add(new Human());
        aniList.add(new Tiger());
        aniList.add(new Eagle());
        // ArrayList에 추가되면서 Animal형으로 형 변환
        for(Animal ani : aniList ) {
            ani.move();
        } //배열 요소를 Animal형으로 꺼내서 move()를 호출하면 재정의된 함수가 호추됨
    }

    public void testCasting() {
        for(int i = 0; i < aniList.size(); i++) { //모든 배열 요소를 하나씩 돌면서
            Animal ani = aniList.get(i); //Animal형으로 가져옴
            if(ani instanceof Human) { //Human이면
                Human h = (Human)ani; //Human형으로 다운 캐스팅
                h.readBook();
            }
            else if(ani instanceof Tiger) {
                Tiger t = (Tiger)ani;
                t.hunting();
            }
            else if(ani instanceof Eagle) {
                Eagle e = (Eagle)ani;
                e.flying();
            }
            else {
                System.out.println("지원되지 않는 형입니다.");
            }
        }
    }
}