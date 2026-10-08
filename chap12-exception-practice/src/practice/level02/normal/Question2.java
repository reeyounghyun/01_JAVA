package practice.level02.normal;

public class Question2 {

    public static void main(String[] args) {

        /* Q2. 파일을 읽어오는 프로그램을 작성하고, try-with-resources 구문을 사용하세요.
         *
         * 복습 포인트:
         * - try-with-resource 구문의 사용 목적을 이해하고 개발에 적용할 수 있다.
         *
         * 사전 준비:
         * - 프로젝트 루트(이 chap13-exception-practice 폴더)에 "example.txt" 파일을 미리 만들어 두세요.
         *   파일 안에는 한 줄로 "Hello, World!" 라고 적어둡니다.
         *   ※ 파일이 존재하지 않으면 FileNotFoundException 이 발생하므로,
         *     아래 조건의 catch 블록에서 그 메시지를 그대로 출력해도 좋습니다.
         *
         * 조건:
         * - FileReader 와 BufferedReader 를 try-with-resources 의 자원으로 함께 선언한다.
         * - "example.txt" 의 첫 줄을 readLine() 으로 읽어와 출력한다.
         * - try-with-resources 구문 덕분에 close() 를 명시적으로 호출하지 않아도 자동으로 닫힌다.
         * - IOException 은 catch 블록에서 처리한다.
         *
         * 출력 예시:
         * 파일 내용: Hello, World!
         * */

    }

}
