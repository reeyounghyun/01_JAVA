package exercise.level02.normal;

import lecture.section01.intro.Calculator;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

import static java.util.Arrays.*;

public class Question {

    public static void main(String[] args) {

        /* Q1. 기본 제공되는 함수형 인터페이스 `Comparator`를 사용하여 문자열 배열을 내림차순으로 정렬하세요.
         * - 정렬 전 배열 : String[] animals = {"elephant", "ant", "zebra", "lion"};
         * - Lambda 표현식을 사용하여 정렬 기준을 정의하세요.
         * - 정렬된 결과를 출력하세요.
         *
         * -- 출력 예시 --
         * 정렬된 배열: [zebra, lion, elephant, ant]
         * */

        // 정렬 전 배열



        // ① 배열 (이미 작성함)
        String[] animals = {"elephant", "ant", "zebra", "lion"};

        // ② 정렬 (결과 받는 변수 없음)
        //animals를 정렬하는데, 두 단어 a와 b를 비교할 때마다 b 기준으로 a를 비교한 결과를 순서로 삼아라 → 알파벳 역순(내림차순)이 된다.
        Arrays.sort(animals, (a, b) -> b.compareTo(a));

        // ③ 출력
        System.out.println("정렬된 배열: " + Arrays.toString(animals));


        // Arrays.sort(배열, 정렬기준)
        //Arrays.sort(animals ->);

        // 음수 → ant가 앞 (알파벳순)
        //"ant".compareTo("lion")


    }
}
