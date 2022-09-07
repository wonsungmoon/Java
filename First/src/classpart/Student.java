package src.classpart;

public class Student {
    int studentID;
    String studentName;
    int grade;
    String address;

    public String getStudentName() {
        return studentName;
    }
    public void setStudentNAme(String name) {
        studentName = name;
    }

    public static void main(String[] args) {
        Student studentAhn = new Student(); //Student 클래스 생성
        studentAhn.setStudentNAme("안연수");
        //studentAhn.studentName = "안연수"; 위 코드와 실행결과는 같음.

        System.out.println(studentAhn.studentName);
        System.out.println(studentAhn.getStudentName());
    }
}
