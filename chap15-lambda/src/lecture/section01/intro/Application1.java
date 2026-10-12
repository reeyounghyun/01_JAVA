package lecture.section01.intro;

public class Application1 {
    public static void main(String[] args) {
        /*
         * 람다 표현식 (메소드를 표현하는 방법)
         * (매개변수, ...) -> { ... }
         * -> 매개변수의 타입은 추론이 가능해서 명시적으로 작성하지 않아도 됨!
         * -> 매개변수가 한개만 있을때는 ()를 생략 가능 ex) str -> {실행문}
         * -> 실행문이 한줄일 경우 {}도 생략 가능 ex) str -> 실행문
         */

        //1~3번은 같은 행동을 함
        // 1. 인터페이스를 구현한 구현체(클레스)를 이용한 방식
        CalculatorImpl Calculator = new CalculatorImpl();
        System.out.println(Calculator.sunTwoNumbers(5, 4));

        // 2. 익명 클래스 클래스의 선언부가 없는 익명클래스
        Calculator Calculator2 = new Calculator() {
            @Override
            public int sunTwoNumbers(int a, int b) {
                return a + b;
            }
        };

        // 3. 람다식
        Calculator Calculator3 = (x, y) -> x + y;

        System.out.println("람다식 동작");
        System.out.println(Calculator3.sunTwoNumbers(5, 4));
    }
}
