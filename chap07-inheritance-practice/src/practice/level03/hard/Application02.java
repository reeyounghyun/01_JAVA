package practice.level03.hard;

public class Application02 {

    public static void main(String[] args) {
        /* Q2. 다음 조건에 맞는 클래스 구조를 작성하고, 객체를 생성하여 인터페이스를 활용한 메소드 호출을 구현하세요.
         *
         * 복습 포인트:
         * - 인터페이스의 개념을 이해하고 설명할 수 있다.
         * - 인터페이스를 활용하여 다형성을 구현할 수 있다.
         *
         * 인터페이스명: Worker
         * 메소드: 작업하다(work) - "작업을 시작합니다." 출력
         *
         * 클래스명: Developer (구현 클래스)
         * 메소드: 작업하다(work) - "개발자가 코딩을 시작합니다." 출력 (인터페이스 메소드 구현)
         *
         * 클래스명: Designer (구현 클래스)
         * 메소드: 작업하다(work) - "디자이너가 디자인을 시작합니다." 출력 (인터페이스 메소드 구현)
         *
         * Worker 타입의 배열을 생성하고, Developer와 Designer 객체를 배열에 추가한 후, 배열을 순회하며 작업하다 메소드를 호출하여 결과를 출력
         * for 문 사용시 향상된 for문을 사용
         *
         * 출력 예시:
         * 개발자가 코딩을 시작합니다.
         * 디자이너가 디자인을 시작합니다.
         * */
/*
        Worker[] workers = new Worker[2];
        workers[0] = new Developer();
        workers[1] = new Designer();

        // 향상된 for문
        for (Worker worker : workers) {
            worker.work();
        }*/

    }

}
