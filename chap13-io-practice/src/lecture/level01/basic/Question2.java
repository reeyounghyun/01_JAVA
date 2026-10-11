package lecture.level01.basic;

import java.io.FileInputStream;
import java.io.IOException;

public class Question2 {

    public static void main(String[] args) {

        /* Q2. FileInputStream을 이용하여 파일의 데이터를 읽고 출력하세요.
         *
         * 복습 포인트:
         * - FileInputStream을 이용하여 파일의 데이터를 읽어올 수 있다.
         *
         * 사전 준비:
         * - 이 문제는 Q1 에서 만든 "example.txt" 파일을 사용합니다.
         *   단, Q1 에서는 파일만 생성하고 내용은 비어 있으므로,
         *   문제를 풀기 전에 텍스트 에디터(또는 IDE) 로 example.txt 를 열어
         *   파일 안에 한 줄로 "Hello, World!" 라고 적어 저장해 두세요.
         *   ※ example.txt 는 프로젝트 루트(이 chap14-io-practice 폴더)에 있어야 합니다.
         *     그렇지 않으면 FileNotFoundException 이 발생합니다.
         *
         * 조건:
         * - "example.txt" 파일의 데이터를 FileInputStream 으로 한 바이트씩 읽어와 출력한다.
         * - IOException 은 try-catch 로 처리한다.
         *
         * 출력 예시:
         * 파일 내용: Hello, World!
         * */

        // 파일을 읽다가 실패할 수 있어서 try로 감싼다
        try {

            // 1. 파일을 읽는 통로를 만든다
            FileInputStream fis = new FileInputStream("src/lecture/level01/basic/example2.txt");

            System.out.print("파일 내용: ");

            // 3. 한 글자씩 읽어서, 끝(-1)이 아닌 동안 반복한다
            int data;
            while ((data = fis.read()) != -1) {
                // 4. 숫자로 읽힌 값을 글자로 바꿔서 옆으로 이어 출력한다
                System.out.print((char) data);
            }
            // 5. 다 읽었으면 통로를 닫는다
            fis.close();

        } catch (IOException e) {
            // 파일이 없거나 읽다가 문제가 생기면 여기로 온다
            System.out.println("파일을 읽는 중 오류가 발생했습니다.");
        }
    }

}
