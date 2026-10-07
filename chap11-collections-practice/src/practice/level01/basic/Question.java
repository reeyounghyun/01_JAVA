package practice.level01.basic;

public class Question {

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
    }

}
