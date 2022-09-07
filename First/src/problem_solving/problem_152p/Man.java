package src.problem_solving.problem_152p;

public class Man {
    //152페이지 1번 문제
    int Man_age;
    String Man_name;
    boolean Man_isMarried;
    int Man_number_of_chldren;

    public void setMan_age(int age) {
        Man_age = age;
    }

    public void setMan_name(String name) {
        Man_name = Man_name;
    }

    public void setMan_isMarried(boolean isMarried) {
        Man_isMarried = isMarried;
    }

    public void setMan_number_of_chldren(int number_of_chldren) {
        Man_number_of_chldren = number_of_chldren;
    }

    void getMan_info() {
        System.out.println(Man_age);
        System.out.println(Man_name);
        System.out.println(Man_isMarried);
        System.out.println(Man_number_of_chldren);
        return;
    }
}

