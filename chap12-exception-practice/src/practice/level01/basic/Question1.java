
package practice.level01.basic;

import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {


        /* Q1. 두 수를 입력받아 나눗셈을 수행하는 프로그램을 작성하세요.
         *
         * 복습 포인트:
         * - 오류와 예외를 구분해서 설명할 수 있다.
         * - 예외처리의 목적에 대해 이해하고 설명할 수 있다.
         * - 예외처리 방법에 대해 숙지하고 개발에 적용할 수 있다.
         *
         * 조건:
         * - 두 수를 입력받아 나눗셈을 수행
         * - 0으로 나누는 경우 ArithmeticException을 처리하여 적절한 메시지를 출력
         *
         * 출력 예시:
         * 나누기 결과: 5
         * 0으로 나눌 수 없습니다.
         *
         *
         * */


        // 1. 키보드 입력을 읽어올 Scanner 생성
        Scanner scan = new Scanner(System.in);

        // 2. 두 수를 입력받기 나눗셈을 수행하기 (괄호는 비워둔다)
        System.out.print("첫 번째 정수 입력 : ");
        int a = scan.nextInt();

        System.out.print("두 번째 정수 입력 : ");
        int b = scan.nextInt();

        // 3. 나눗셈 시도
        try {
            int result = a / b;                          // b가 0이면 여기서 예외 발생 → catch로 이동
            System.out.println("나누기 결과: " + result);  // 성공했을 때만 실행
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("0으로 나눌 수 없습니다."); // 0으로 나눴을 때만 실행
        }

    }
}
