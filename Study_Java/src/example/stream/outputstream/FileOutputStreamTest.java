package src.example.stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("output.txt")) {
            fos.write(65); //FileOutputStream은 파일에 숫자를 쓰면 해당하는 아스키 코드 값으로 변환됨
            fos.write(66); //FileOutputStream은 파일에 숫자를 쓰면 해당하는 아스키 코드 값으로 변환됨
            fos.write(67); //FileOutputStream은 파일에 숫자를 쓰면 해당하는 아스키 코드 값으로 변환됨
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("출력이 완료되었습니다.");
    }
}
