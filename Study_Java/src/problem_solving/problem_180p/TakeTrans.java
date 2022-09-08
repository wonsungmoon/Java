package src.problem_solving.problem_180p;

public class TakeTrans {
    public static void main(String[] args) {
        Student studentEdward = new Student("Edward", 50000);

        Taxi taxi500 = new Taxi(500);
        studentEdward.takeTaxi(taxi500);
        studentEdward.showInfo();
        taxi500.showInfo();
    }
}
