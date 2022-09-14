package src.example.abstractex;

public class ComputerTest {
    public static void main(String[] args) {
        //Computer c1 = new Computer(); 오류 발생
        Computer c2 = new DeskTop();
        //Computer c3 = new NoteBook(); 오류 발생
        Computer c4 = new MyNoteBook();
    }
}
