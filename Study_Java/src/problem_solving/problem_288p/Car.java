package src.problem_solving.problem_288p;

public abstract class Car {
    public abstract void run();
    public abstract void refuel();
    public void stop() {
        System.out.println("차가 멈춥니다.");
    }
}
