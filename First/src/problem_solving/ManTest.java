package src.problem_solving;

import src.classpart.Student;
import src.problem_solving.Man;

public class ManTest {
    public static void main(String[] args) {

        Man Man1 = new Man();
        Man1.Man_age = 40;
        Man1.Man_name = "James";
        Man1.Man_isMarried = true;
        Man1.Man_number_of_chldren = 3;

        Man1.getMan_info();
    }

}



