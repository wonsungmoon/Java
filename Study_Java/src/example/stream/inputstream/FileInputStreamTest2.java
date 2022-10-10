package src.example.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("reader.txt")) {
            int i;
            while((i = fis.read()) != -1) {
                System.out.println((char)i);
            } //i 값이 -1이 아닌 동안 read() 메서드로 한 바이트를 반복해 읽음
            System.out.println("end");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
