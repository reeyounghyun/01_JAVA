package exercise.level01.basic;

public class Question {

    public static void main(String[] args) {

        /* Q1. 요일을 표현하는 enum 을 정의하고, 기본 메서드를 사용해 다음을 출력하세요.
         *
         *  enum 정의 조건:
         *   - enum 이름: Day
         *   - 상수: MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY (7개)
         *
         *  같은 패키지에 위 Day enum 을 직접 정의한 뒤, 다음 출력을 만들어 보세요.
         *   ① values() 로 모든 요일을 차례대로 출력
         *   ② 각 요일의 ordinal() 값과 name() 값을 함께 출력
         *
         * -- 출력 예시 --
         * 모든 요일:
         * MONDAY TUESDAY WEDNESDAY THURSDAY FRIDAY SATURDAY SUNDAY
         *
         * 인덱스와 이름:
         * 0 - MONDAY
         * 1 - TUESDAY
         * 2 - WEDNESDAY
         * 3 - THURSDAY
         * 4 - FRIDAY
         * 5 - SATURDAY
         * 6 - SUNDAY
         * */

        /* Q2. valueOf() 메서드를 사용해 문자열을 enum 상수로 변환하고,
         *  변환된 상수와 직접 참조한 상수가 같은 인스턴스인지 == 연산자로 비교해 출력하세요.
         *
         *  Q1 에서 정의한 Day enum 을 그대로 사용합니다.
         *
         *   ① Day.valueOf("FRIDAY") 결과와 Day.FRIDAY 가 같은 인스턴스인지 비교
         *   ② Day.valueOf("FRIDAY") 결과와 Day.MONDAY 가 같은 인스턴스인지 비교
         *
         * -- 출력 예시 --
         * Day.valueOf("FRIDAY") == Day.FRIDAY : true
         * Day.valueOf("FRIDAY") == Day.MONDAY : false
         * */
    }
}
