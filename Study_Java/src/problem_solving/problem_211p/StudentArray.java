package src.problem_solving.problem_211p;

public class StudentArray {
    public static void main(String[] args) {
        Student[] StudentArray = new Student[3];

        StudentArray[0] = new Student(1001, "James");
        StudentArray[1] = new Student(1002, "Tomas");
        StudentArray[2] = new Student(1003, "Edward");

        for(int i = 0; i < StudentArray.length; i++){
            StudentArray[i].showStudentInfo();
        }
    }
}
