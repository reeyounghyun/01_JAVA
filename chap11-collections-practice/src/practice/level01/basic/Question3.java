package practice.level01.basic;

import java.util.Stack;

public class Question3 {

    public static void main(String[] args) {

        /* Q3. Stack 자료구조를 사용해 LIFO(Last-In, First-Out) 동작을 확인하세요.
         *
         * 복습 포인트:
         * - Stack 자료 구조에 대해 이해하고 설명할 수 있다.
         * - Stack의 주요 메소드의 사용 방법을 숙지하고 개발에 적용할 수 있다.
         *
         * 조건:
         * - Stack<Integer> 를 생성하고 push() 로 10, 20, 30 을 차례대로 넣는다.
         * - peek() 으로 맨 위 요소를 확인해 출력한다.
         * - pop() 으로 모든 요소가 꺼내질 때까지 반복하면서 꺼낸 값을 출력한다.
         *
         * 출력 예시:
         * peek: 30
         * pop: 30
         * pop: 20
         * pop: 10
         * */

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("peek: " + stack.peek());

        while (!stack.isEmpty()) {
            System.out.println("pop: " + stack.pop());
        }

    }

}
