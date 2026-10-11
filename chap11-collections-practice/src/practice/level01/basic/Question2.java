package practice.level01.basic;

import java.util.LinkedList;

public class Question2 {

    public static void main(String[] args) {


        /* Q2. LinkedList를 생성하고, 요소를 추가하고, 첫 번째와 마지막 요소를 출력하세요.
         *
         * 복습 포인트:
         * - LinkedList의 구조를 이해하고 인스턴스를 생성할 수 있다.
         * - LinkedList의 주요 메소드의 사용 방법을 숙지하고 개발에 적용할 수 있다.
         *
         * 조건:
         * - LinkedList에 "A", "B", "C", "D", "E"를 추가
         * - 첫 번째 요소와 마지막 요소를 출력
         *
         * 출력 예시:
         * 첫 번째 요소: A
         * 마지막 요소: E
         * */

        // 문자열을 담을 LinkedList을 만든다
        LinkedList<String> list = new LinkedList<>();

        // 어떤 문자열을 리스트로 담을지에 대한 값을 적는다. .add는 하나씩만 만든다.
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        //3.첫 번째 요소를 꺼내서 출력한다.
        System.out.println("첫 번째 요소: " + list.getFirst());

        //4. 마지막 요소를 꺼내서 출력한다.
        System.out.println("마지막 요소: " + list.getLast());
    }

}
