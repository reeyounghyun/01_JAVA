package exercise.level01.basic;

import java.util.function.BinaryOperator;

public class Question {

    public static void main(String[] args) {

        /* Q1. Lambda 표현식을 사용하여 두 정수의 합을 계산하는 프로그램을 작성하세요.
         * - 두 정수를 매개변수로 받아 합을 반환하는 Lambda 표현식을 정의하세요.
         * - 정의된 Lambda 표현식을 호출하여 5와 7의 합을 계산하고 출력하세요.
         *
         * -- 출력 예시 --
         * 두 정수의 합: 12
         * */

        BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;
        System.out.println("두 정수의 합 :" + binaryOperator.apply( 5, 7));


        //둔 함수형 인터페이스 =BinaryOperator
        //둔 함수형 인터페이스는 추상 메소드 이다.
        // 추상 메소드는 이름과 모양만 있고, 내용(몸통)이 없는 메서드이다.
        // 람다식은 메서드가 하나만 있을때 사용이 가능핟.

        //<Integer> = int 정수
        // binaryOperator1 = 변수의 이름
        BinaryOperator<Integer> binaryOperator1 = (x , y) -> x + y;
        //"정수 두 개를 받아 정수 하나를 돌려주는 BinaryOperator<Integer> 타입의
        // 변수 binaryOperator1에, x와 y를 받아 x + y를 돌려주는 람다식을 담는다."
        System.out.println("두 정수의 합1 : " + binaryOperator1.apply(10, 20));




    }
}
