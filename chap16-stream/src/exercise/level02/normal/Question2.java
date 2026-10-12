package exercise.level02.normal;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Question2 {

    public static void main(String[] args) {

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


        int[] scores = {72, 85, 90, 60, 88};
        //scores[72, 85, 90, 60, 88];
        System.out.println("scores = " + Arrays.toString(scores));

        //int[] scores = {72, 85, 90, 60, 88}; 를 IntStream 으로 변환한다.
        //IntStream stream1 = Arrays.stream(scores);
        // 출력 scores = [72, 85, 90, 60, 88];


        //IntStream.range 시작점과 긑점
        Long count = IntStream.range(0, 5).count();
        System.out.println("개수 : " + count);


        // 데이터를 옮겨 담음 Arrays.stream.
        // 정수 sum =  Arrays.stream(데이터를 옯겨담을 매서드).sum() 더하기 매소드를 호출한다.
        int sum = Arrays.stream(scores).sum();
        System.out.println("종합 : " + sum);


        //OptionalInt 참조형 타입
        // max 변수
        // scores 이미 있는 배열 을 불러온다
        // .max 가장 큰 촤댓값으로
        OptionalInt max = Arrays.stream(scores).max();
        System.out.println("최댓값 :" + max.getAsInt());

        OptionalInt min = Arrays.stream(scores).min();
        System.out.println("최솟값 :" + min.getAsInt());

    }
}
