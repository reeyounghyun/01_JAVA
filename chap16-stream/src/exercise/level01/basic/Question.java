package exercise.level01.basic;
import java.util.Arrays;

public class Question {

    public static void main(String[] args) {

        /* Q1. 배열 형태의 스트림을 생성하고, 모든 요소를 출력하세요.
         * - 정수 배열: [10, 20, 30, 40, 50]
         * - 스트림을 생성하고 forEach()를 사용해 출력하세요.
         *
         * -- 출력 예시 --
         * 10
         * 20
         * 30
         * 40
         * 50
         * */

        // 정수 배열 생성
        int[] numbers = {10, 20, 30, 40, 50};

        // 배열 → 스트림(IntStream)으로 변환한 뒤, 요소를 하나씩 출력
        Arrays.stream(numbers)
                .forEach(num -> System.out.println(num));


    }
}
