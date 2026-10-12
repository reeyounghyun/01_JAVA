package lecture.section01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Application0 {

    /*
     * Stream
     * - 컬렉션에 저장된 요소들을 하나씩 순환하면서 처리할 수 있다.
     * */
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>(Arrays.asList("hello", "hello10", "hello100"));

        // 방법 ① 향상된 for문 (전통적인 방식)
        // strList에서 하나씩 꺼내서 str에 담고, 출력을 반복
        for (String str : strList) {
            System.out.println(str);
        }

        // 방법 ② 리스트의 forEach + 람다식
        // "str을 하나씩 받아서 -> 출력해라"
        // for문을 한 줄로 줄인 것과 같음
        strList.forEach(str -> System.out.println(str));

        // 방법 ③ 스트림으로 바꾼 뒤 forEach
        // .stream() : 리스트를 스트림(데이터가 흐르는 통로)으로 변환
        // .forEach() : 흘러오는 값을 하나씩 받아 처리 (최종 연산)
        // 지금은 ②와 결과가 같지만, 중간에 filter, map 등을 끼워 넣을 수 있다는 게 장점
        strList.stream()
                .forEach(str -> System.out.println(str));

        // 출력 결과 (3번 반복됨):
        // hello
        // hello10
        // hello100


        /**********************************************************************/


        // 3. 정수 Stream
        //IntStream.range(0, 5) : 0부터 5 '전까지'의 정수 → 0, 1, 2, 3, 4
        IntStream intStream = IntStream.range(0, 5);
        // 참고:(5까지 포함하려면 rangeClosed(0, 5))

        // i -> System.out.println(i) 를 줄여 쓴 것
        intStream.forEach(System.out::println);

        // Stream.of(...) : 리스트를 거치지 않고 바로 스트림 생성
        Stream<String> stringStream = Stream.of("javascript", "java", "Mx");
        Stream<String> stringStream2 = Stream.of("java", "html");

        // Stream은 동일 타입 스트림으로 합칠 수 있다.
        // Stream.concat(a, b) = Stream.concat(stringStream, stringStream2); => a 뒤에 b를 이어 붙인 새 스트림
        Stream<String> concatStream = Stream.concat(stringStream, stringStream2);
        concatStream.forEach((String str) -> System.out.println(str));

        // 출력 결과:
        // javascritp
        // hello10
        // hello100
        // java
        // html
    }
}