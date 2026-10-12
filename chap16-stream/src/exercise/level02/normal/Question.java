package exercise.level02.normal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Locale.filter;

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
         *
         * */
        // 리스트: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        List<Integer> numberList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        //numberList.stream().forEach(System.out::println); // 출력;1,2,3,4,5,6,7,8,9,10

        numberList.stream() // 리스트 → 스트림
                .filter(i -> i % 2 == 0)  // 짝수만 남김: 2, 4, 6, 8, 10 // 짝수만 필터링 한 후
                .map(i -> i * i)  // 제곱: 4, 16, 36, 64, 100
                .forEach(System.out::println);      // 제곱 값을 출력


    }
}
