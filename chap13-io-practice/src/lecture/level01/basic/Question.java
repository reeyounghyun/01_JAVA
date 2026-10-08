package lecture.level01.basic;

import java.io.File;
import java.io.IOException;

public class Question {

    public static void main(String[] args) {

        /* 어려우면 답 부터 먼저 보고나서 흐름을 파악한 후 flow chart를 그려보고 다시 도전해보세요~! */

        /* Q1. File 클래스를 이용하여 새로운 파일을 생성하고, 해당 파일이 존재하는지 확인하세요.
         *
         * 복습 포인트:
         * - File 클래스의 주요 메소드를 숙지하여 개발에 적용할 수 있다.
         *
         * 조건:
         * - "example.txt" 파일을 생성하고, 해당 파일이 존재하는지 확인하여 존재 여부를 출력
         *
         * 출력 예시:
         * example.txt 파일이 생성되었습니다.
         * example.txt 파일이 존재합니다.
         * */

        File file = new File("src/lecture/level01/basic/example.txt");

        // 경로에 해당하는 파일을 생성
        if (file.createNewFile()) {
            System.out.println("example.txt 파일이 생성되었습니다");
        }if(file.exists()){
            System.out.println("example.txt 파일이 존재합니다.");
        }else(IOException e) {
            System.out.println("example.txt 파일이생성에 실패했습니다");
        }
    }

    public Question() {
    }

}
