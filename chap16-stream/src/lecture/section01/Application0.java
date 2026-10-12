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

        for (String str : strList) {
            System.out.println(str);
        }

        strList.forEach(str -> System.out.println(str));

        strList.stream()
                .forEach(str -> System.out.println(str));

        // 정수 Stream
        IntStream intStream = IntStream.range(0, 5);
        intStream.forEach(System.out::println);

        Stream<String> stringStream = Stream.of("javascritp", "hello10", "hello100");
        Stream<String> stringStream2 = Stream.of("java", "html");

        // Stream은 동일 타입 스트림으로 합칠 수 있다.
        Stream<String> concatStream = Stream.concat(stringStream, stringStream2);
        concatStream.forEach((String str) -> System.out.println(str));

    }
}