package src.example.classpart;

public class StudentTest1 {

    public static void main(String[] args) {
        Student student1 = new Student(); //첫 번째 학생 생성
        student1.studentName = "안연수";
        //student1.setStudentNAme("안연수");
        System.out.println(student1.getStudentName());
        Student student2 = new Student(); //두 번째 학생 생성
        student2.studentName = "안승연";
        //student2.setStudentNAme("안승연");
        System.out.println(student2.getStudentName());

    }

}
