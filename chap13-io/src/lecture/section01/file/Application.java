package lecture.section01.file;

import java.io.File;
import java.io.IOException;

public class Application {
    //main : 메인 메소드 시작함.
    public static void main(String[] args) {
        /*
         * File 클래스
         * - 파일 처리를 수행하는 클랙스
         * - 파일 생성, 삭제, 정보조회 등의 기능을 제공
         * */

        // 현제 파일이 없어도 객체를 만드는데 문제가 되지않는다.
        // 상대 경로 => src/lecture/setion01/file/test.txt
        File file = new File("src/lecture/setion01/file/test.txt");

        // 없는 파일을 원하는 경로에 만들어줌. file.createNewFile();
        try {
            boolean createSuccess = file.createNewFile();
            System.out.println("createSuccess = " + createSuccess);
            // 실행시키면 경로에 해당하는 파일을 생성해줌.
            //file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("파일의 크기 = " + file.length());
        System.out.println("파일의 경로 = " + file.getParent());
        System.out.println("파일의 절대 경로 = " + file.getAbsolutePath());

       // file.delete(); // 파일삭제
    }
}
