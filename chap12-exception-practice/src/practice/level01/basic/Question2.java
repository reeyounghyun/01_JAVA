package practice.level01.basic;

import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        /* Q2. 배열의 인덱스를 입력받아 해당 인덱스의 요소를 출력하는 프로그램을 작성하세요.
         *
         * 복습 포인트:
         * - 예외처리의 목적에 대해 이해하고 설명할 수 있다.
         * - 예외처리 방법에 대해 숙지하고 개발에 적용할 수 있다.
         *
         * 조건:
         * - 배열의 인덱스를 입력받아 요소를 출력
         * - 인덱스가 배열의 범위를 벗어나는 경우 ArrayIndexOutOfBoundsException을 처리하여 적절한 메시지를 출력
         *
         * 출력 예시:
         * 배열의 요소: 10
         * 인덱스가 배열의 범위를 벗어났습니다.
         * */

        //배열을 만들어 보자
        int[] arr = {10, 20, 30, 40, 50};
        //System.out.println(arr[4]);      // [I@b4c966a  ← 배열 자체

      try {
            System.out.println("배열의 요소: " + arr[3]);  // 성공했을 때만 실행
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스가 배열의 범위를 벗어났습니다."); // 성공하지 않을 때 실행.
        }

    }

}