package lecture.section02.stream;

import java.io.FileInputStream;
import java.io.IOException;

public class Application1 {
    public static void main(String[] args) {
        /*
         * 스트림
         * - 자바 프로그램과 외부 데이터를 연결하는 단방향 통로이다.
         *
         * - 입력 스트림 - 데이터를 읽어오기 위한
         * - 출력 스트림 - 데이터를 출력하기 위한
         * */

        /*
         * try-with-resources 구문
         * - try 문이 끝날 때 앞서 선언한 객체의 close()를 자동으로 호출해준다.
         * - 그래서 finally에서 직접 close() 할 필요가 없다.
         * */
        try (FileInputStream fin = new FileInputStream(
                "src/lecture/section02/stream/testInputStream.txt")) {

            int value;

            // read() : 1byte씩 순차적으로 읽어오고, 더 이상 읽을 게 없으면 -1을 반환한다.
            while ((value = fin.read()) != -1) {

                // 한글은 한 글자에 3byte(UTF-8)라서 1byte씩 char로 바꾸면 깨진다.
                System.out.print((char) value);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}