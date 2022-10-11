package src.example.stream.others;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\easyspub\\JAVA_LAB\\Chapter15\\newFile.txt"); //해당 경로에 File 클래스 생성. 아직 실제 파일이 생성된 것은 아님
        file.createNewFile(); //실제 파일 생성

        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        //파일의 속성을 살펴보는 메서드 호출하여 추력
        file.delete(); //파일 삭제
    }
}
