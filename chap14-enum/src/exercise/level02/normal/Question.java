package practice.level02.normal;

public class Question {

    public static void main(String[] args) {

        /* Q1. 사이즈별로 가격이 다른 피자 메뉴를 enum 으로 정의하세요.
         *
         *  enum 정의 조건:
         *   - enum 이름: Pizza
         *   - 상수: SMALL(8000), MEDIUM(12000), LARGE(15000)
         *   - 필드: int price
         *   - 매개변수가 있는 생성자: Pizza(int price) — 외부에서 호출 불가(자동 private)
         *   - getter: int getPrice()
         *
         *  같은 패키지에 위 Pizza enum 을 직접 정의한 뒤,
         *  values() 로 순회하며 각 사이즈와 가격을 출력하세요.
         *
         * -- 출력 예시 --
         * SMALL : 8000원
         * MEDIUM : 12000원
         * LARGE : 15000원
         * */

        /* Q2. 신호등 상태를 enum 으로 정의하고, switch-case 로 현재 상태에 맞는 메시지를 출력하세요.
         *
         *  enum 정의 조건:
         *   - enum 이름: TrafficLight
         *   - 상수: RED, YELLOW, GREEN
         *
         *  메인 로직 조건:
         *   - TrafficLight 변수에 RED, YELLOW, GREEN 을 차례로 대입하면서
         *     각각에 대해 switch-case 로 다음 메시지를 출력하세요.
         *      · RED    → "정지하세요"
         *      · YELLOW → "감속하세요"
         *      · GREEN  → "통과하세요"
         *
         *  단, switch 문 안에서는 enum 상수 비교 시 'TrafficLight.RED' 가 아니라
         *  단순히 'RED' 라고만 적어야 합니다(자동 추론).
         *
         * -- 출력 예시 --
         * 현재 신호 : RED → 정지하세요
         * 현재 신호 : YELLOW → 감속하세요
         * 현재 신호 : GREEN → 통과하세요
         * */
    }
}
