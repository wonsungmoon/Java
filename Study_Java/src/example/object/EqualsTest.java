package src.example.object;

class Student {
    int studentId;
    String studentName;
    
    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }
    
    public String toString() {
        return studentId + "," + studentName;
    }
}

public class EqualsTest {
    public static void main(String[] args) {
        Student studentLee = new Student(100, "이상원");
        Student studentLee2 = studentLee; //주소 복사
        Student studentSang = new Student(100, "이상원");

        if(studentLee == studentLee2) //== 기호로 비교
            System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
        else
            System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");

        if(studentLee.equals(studentLee2)) //equals() 메서드로 비교
            System.out.println("studentLee와 studentLee2는 동일합니다.");
        else
            System.out.println("studentLee와 studentLee2는 동일하지 않습니다.");
        //동일한 주소의 두 인스턴스 비교
        if(studentLee == studentSang) //== 기호로 비교
            System.out.println("studentLee와 studentSang의 주소는 같습니다.");
        else
            System.out.println("studentLee와 studentSang의 주소는 다릅니다.");

        if(studentLee.equals(studentSang)) //equals() 메서드로 비교
            System.out.println("studentLee와 studentSang은 동일합니다.");
        else
            System.out.println("studentLee와 studentSang은 동일하지 않습니다.");
        //동일인이지만 인스턴스의 주소가 다른 경우
    }
}