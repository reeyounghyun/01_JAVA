package exercise.level03.hard;

import java.util.Arrays;

public class Question {

    public static void main(String[] args) {

        /* 안내. 이 레벨은 난이도가 있는 편입니다. 너무 어려우면 모범답안을 먼저 보고
         *      흐름을 파악한 뒤, 직접 다시 풀어보면 학습 효과가 더 좋습니다.
         * */

        /* Q1. 문자열 배열의 스트림을 생성하고, "a"로 시작하는 단어를 필터링하여 오름차순으로 정렬하세요.
         * - 배열: ["apple", "banana", "apricot", "cherry", "avocado"]
         * - filter()와 sorted()를 사용해 데이터를 처리하세요.
         *
         * -- 출력 예시 --
         * apple
         * apricot
         * avocado
         * */

        String[] words = {"apple", "banana", "apricot", "cherry", "avocado"};
        Arrays.stream(words)
                .filter(word -> word.startsWith("a"))
                .sorted()
                .forEach(System.out::println);
        //forEach 걸러진 단어를 하나씩 추출한다.

       /* Arrays.stream(words)    // 만들고
          .filter(...)            // 거르고
          .sorted()               // 정렬하고
          .forEach(...);          // 출력하고 끝 ← 여기만 ;*/

    }
}
