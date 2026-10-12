package practice.level03.hard;

public class Question {

    public static void main(String[] args) {

        /* 안내. 이 레벨은 메소드 참조와 생성자 참조 같은 Lambda 의 단축 표기법을 다루므로 난이도가 있는 편입니다.
         *      너무 어려우면 모범답안을 먼저 보고 흐름을 파악한 뒤, 직접 다시 풀어보면 학습 효과가 더 좋습니다.
         * */

        /* Q1. 메소드 참조(`클래스::메소드`, `객체::메소드`, `클래스::인스턴스 메소드`) 의 세 가지 형태를
         *  Lambda 와 비교하며 사용해 보세요.
         *
         *  복습 포인트:
         *  - 메소드 참조의 개념을 이해하고 사용할 수 있다.
         *  - 클래스::메소드, 객체::메소드 구문을 활용할 수 있다.
         *
         *  조건:
         *   ① Function<String, Integer> 으로 문자열을 정수로 변환하는 람다를 정의하고,
         *      그것을 'Integer::parseInt' 메소드 참조로 동일하게 정의해 두 결과를 출력
         *
         *   ② Consumer<String> 으로 "받은 문자열을 그대로 출력" 하는 람다를 정의하고,
         *      그것을 'System.out::println' 메소드 참조(객체::메소드) 로 동일하게 정의해 호출
         *
         *   ③ Function<String, Integer> 으로 "문자열의 길이를 반환" 하는 람다를 정의하고,
         *      그것을 'String::length' 메소드 참조(클래스::인스턴스 메소드) 로 동일하게 정의해 결과 출력
         *
         * -- 출력 예시 --
         * 람다  parseInt("100") : 100
         * 참조  parseInt("100") : 100
         * 람다  Hello (Consumer)
         * 참조  Hello (Consumer)
         * 람다  length("Lambda") : 6
         * 참조  length("Lambda") : 6
         * */

        /* Q2. 생성자 참조(`클래스::new`) 를 활용해 ArrayList 인스턴스를 생성하세요.
         *
         *  복습 포인트:
         *  - 생성자 참조의 개념을 이해하고 사용할 수 있다.
         *  - `클래스::new` 구문을 활용할 수 있다.
         *
         *  조건:
         *   ① Supplier<ArrayList<String>> listSupplier = ArrayList::new;
         *      → 호출할 때마다 새로운 빈 ArrayList<String> 을 만들어 반환한다.
         *
         *   ② listSupplier.get() 으로 두 개의 리스트를 만들어 각각 "A", "B" 와 "X", "Y" 를 추가한 뒤
         *      두 리스트를 출력한다.
         *
         *   ③ 두 리스트가 서로 다른 인스턴스인지 == 로 비교해 결과를 출력한다.
         *
         * -- 출력 예시 --
         * list1 : [A, B]
         * list2 : [X, Y]
         * list1 == list2 : false
         * */
    }
}
