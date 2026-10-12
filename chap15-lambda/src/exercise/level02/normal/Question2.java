package exercise.level02.normal;

public class Question2 {

    public static void main(String[] args) {

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
