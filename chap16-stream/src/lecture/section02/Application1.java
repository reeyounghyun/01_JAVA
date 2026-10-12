package lecture.section02;

import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Application1 {
    public static void main() {

        /*
        중감 연산
        Stream<T> filter(Predicate<? super T> predicate
        */

        IntStream intStream = IntStream.range(0, 10);

        // i 가 짝수일때 true;
        //Predicate<IntStream> predicate = (i) -> (i%2) == 0;
        intStream
                .filter((i) -> (i % 2) == 0)
                .forEach(System.out::println);
        //intStream.forEach(System.out::println);

    }
}
