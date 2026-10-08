package lecture.section03;

import java.io.*;

public class Application1 {

    public static void main(String[] args) {
/*        try (
                BufferedWriter bfw = new BufferedWriter(
                        new FileWriter("src/lecture/section03/substream/testBuffered.txt"))) {

            bfw.write("Hello World");
            bfw.newLine();              // 줄바꿈 (없으면 "Hello WorldHello World"로 붙어서 저장됨)
            bfw.write("Hello World");

            // flush() : 버퍼에 쌓인 내용을 파일로 내보낸다.
            // close() : flush 후 스트림을 닫는다.
            //           try-with-resources가 블록 종료 시 자동으로 호출해 준다.

        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

        // BufferedReader
        try (
                FileReader fr = new FileReader(
                        "src/lecture/section03/testBuffered.txt");

                BufferedReader bfr = new BufferedReader(fr);
        ) {

            String temp;
            while ((temp = bfr.readLine()) != null) {
                System.out.println(temp);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
