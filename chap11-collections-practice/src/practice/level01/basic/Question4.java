package practice.level01.basic;

import java.util.LinkedList;
import java.util.Queue;

public class Question4 {

    public static void main(String[] args) {

        /* Q4. Queue 자료구조를 사용해 FIFO(First-In, First-Out) 동작을 확인하세요.
         *
         * 복습 포인트:
         * - Queue 자료 구조에 대해 이해하고 설명할 수 있다.
         * - Stack과 Queue의 자료 구조에 대해 비교하여 설명할 수 있다.
         * - Queue의 주요 메소드의 사용 방법을 숙지하고 개발에 적용할 수 있다.
         *
         * 조건:
         * - Queue<String> 을 LinkedList 로 구현해 생성한다. (Queue<String> q = new LinkedList<>();)
         * - offer() 로 "A", "B", "C" 를 차례대로 넣는다.
         * - peek() 으로 맨 앞 요소를 확인해 출력한다.
         * - poll() 으로 모든 요소가 꺼내질 때까지 반복하면서 꺼낸 값을 출력한다.
         *
         * 출력 예시:
         * peek: A
         * poll: A
         * poll: B
         * poll: C
         * */

        Queue<String> q = new LinkedList<>();

        q.offer("A");
        q.offer("B");
        q.offer("C");

        //System.out.println("peek: " + q.peek());

        while (!q.isEmpty()) {
            System.out.println("poll: " + q.poll());
        }

    }

}
