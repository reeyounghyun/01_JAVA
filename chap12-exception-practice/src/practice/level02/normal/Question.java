package practice.level02.normal;

public class Question {

    public static void main(String[] args) {

        /* Q1. 사용자 정의 예외 클래스를 작성하고, 특정 조건에서 예외를 발생시키세요.
         *
         * 복습 포인트:
         * - 사용자 정의 예외 클래스를 작성할 수 있다.
         * - 사용자 정의 예외 클래스와 예외처리 문법을 이용하여 프로그램의 흐름을 제어할 수 있다.
         *
         * 클래스명: NegativeNumberException (사용자 정의 예외 클래스)
         * 조건:
         * - 음수를 입력받으면 NegativeNumberException을 발생시키고, 적절한 메시지를 출력
         *
         * 출력 예시:
         * 음수는 입력할 수 없습니다.
         * */
        Question.test();

    }

    public static void test() {

        try {
            // 예외가 발생할수도있는 코드
            throw new NegativeNumberException("내가만든 설명메시지"); //예외를 발생시킨것!
        } catch (NegativeNumberException e) {
            // NegativeNumberException 발생했을때 동작할 내용
            System.out.println(e.getMessage());
        }
    }

}
