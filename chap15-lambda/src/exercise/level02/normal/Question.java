package practice.level02.normal;

public class Question {

    public static void main(String[] args) {

        /* Q1. 기본 제공되는 함수형 인터페이스 `Comparator`를 사용하여 문자열 배열을 내림차순으로 정렬하세요.
         * - 정렬 전 배열 : String[] animals = {"elephant", "ant", "zebra", "lion"};
         * - Lambda 표현식을 사용하여 정렬 기준을 정의하세요.
         * - 정렬된 결과를 출력하세요.
         *
         * -- 출력 예시 --
         * 정렬된 배열: [zebra, lion, elephant, ant]
         * */

        /* Q2. java.util.function 패키지의 함수형 인터페이스 Function, Predicate, Consumer 를
         *  Lambda 표현식으로 사용해 보세요.
         *
         *  복습 포인트:
         *  - 기본 제공되는 함수형 인터페이스(Function, Predicate, Consumer)를 사용할 수 있다.
         *
         *  조건:
         *   ① Function<Integer, Integer> square — 입력 정수의 제곱을 반환
         *   ② Predicate<Integer> isPositive    — 입력 정수가 양수인지 판단
         *   ③ Consumer<String> printer         — 받은 문자열을 그대로 출력
         *
         *  메인 로직:
         *   - square.apply(7) 결과 출력
         *   - isPositive.test(-3) 결과 출력
         *   - printer.accept("Hello, Lambda!") 호출
         *
         * -- 출력 예시 --
         * square(7) : 49
         * isPositive(-3) : false
         * Hello, Lambda!
         * */
    }
}
