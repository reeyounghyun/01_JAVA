package exercise.level02.normal;

public class Question {

    public static void main(String[] args) {

        /* Q1. 컬렉션 형태의 스트림을 생성하고, 짝수만 필터링한 후, 제곱 값을 출력하세요.
         * - 리스트: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
         * - filter()와 map()을 사용해 데이터를 처리하세요.
         *
         * -- 출력 예시 --
         * 4
         * 16
         * 36
         * 64
         * 100
         * */

        /* Q2. IntStream 의 집계 메서드(count, sum, average) 를 사용해
         *  정수 배열의 통계 정보를 출력하세요.
         *
         *  복습 포인트:
         *  - count(), sum(), average() 등의 집계 메서드를 사용해 스트림 데이터를 연산할 수 있다.
         *
         *  조건:
         *   - int[] scores = {72, 85, 90, 60, 88}; 를 IntStream 으로 변환한다.
         *   - 다음 값을 각각 계산해 출력한다.
         *      ① 요소 개수      : count()
         *      ② 총합           : sum()
         *      ③ 평균           : average() — OptionalDouble 반환에 주의 (getAsDouble())
         *      ④ 최댓값         : max() — OptionalInt 반환에 주의
         *      ⑤ 최솟값         : min() — OptionalInt 반환에 주의
         *
         *   ※ count/sum/average/max/min 같은 집계 메서드는 종단 연산이며,
         *      한 번의 호출당 새 스트림을 만들어야 한다(스트림은 일회용).
         *
         * -- 출력 예시 --
         * 개수 : 5
         * 총합 : 395
         * 평균 : 79.0
         * 최댓값 : 90
         * 최솟값 : 60
         * */
    }
}
