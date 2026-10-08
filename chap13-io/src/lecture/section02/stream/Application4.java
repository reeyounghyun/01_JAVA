package lecture.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Application4 {
    public static void main(String[] args) {
        /*
         * 스트림 : 자바 프로그램과 외부 데이터를 연결하는 통로 (단반향)
         *
         * - 입력스트림 - 데이터를 읽어오기 위한 스트림 ( FileInputStream, FileReader )
         * - 출력스트림 - 데이터를 출력하기 위한 스트림 ( FileOutputStream)
         * */

        try (
                FileWriter fout =
                        new FileWriter(
                                "src/lecture/section02/stream/testfileWrtier.txt")
        ) {
            // charter 단위로 변경
            char[] bar = new char[]{98, 99, 100, 101, 102};

            fout.write(bar);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}