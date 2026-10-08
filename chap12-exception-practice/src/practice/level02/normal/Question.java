package practice.level02.normal;

import java.util.Scanner;

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

        // 1. 키보드 입력을 읽어올 Scanner 생성
        Scanner scan = new Scanner(System.in);

        // 조건
        // 음수를 입력받으면 NegativeNumberException을 발생시키고, 적절한 메시지 출력

        try() {
            System.out.println("시작 되었습니다.");
        }catch() {
            throw new (NegativeNumberException e);
            System.out.println("발생되었습니다");
        }

        System.out.println("종료 되었습니다.");


    }

}
