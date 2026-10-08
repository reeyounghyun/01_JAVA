package practice.level01.basic;

import java.util.ArrayList;
import java.util.Collections;

public class Question1 {

    public static void main(String[] args) {

        /* Q1. ArrayList를 생성하고, 요소를 추가하고, 오름차순으로 정렬하세요.
         *
         * 복습 포인트:
         * - ArrayList의 사용 목적에 대해 이해할 수 있다.
         * - ArrayList의 주요 메소드의 사용 방법을 숙지하고 개발에 적용할 수 있다.
         * - Collections.sort() 메소드를 이용하여 오름차순 정렬을 할 수 있다.
         *
         * 조건:
         * - ArrayList에 5, 3, 8, 1, 2를 추가
         * - 오름차순으로 정렬하여 출력
         *
         * 출력 예시:
         * 정렬된 리스트: [1, 2, 3, 5, 8]
         * */

        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(3);
        list.add(8);
        list.add(1);
        list.add(2);

        //System.out.println(list);

        Collections.sort(list);  //오름차순
        System.out.println("정렬된 리스트: " + list);
    }

}
