package lecture.section02;

import java.util.stream.IntStream;

public class Application2 {
    public static void main() {
        /*
        중감 연산
        Stream<T> map(Predicate<? super T, ? extend R mapper> predicate
        */
        IntStream intStream = IntStream.range(0, 10);

        intStream
                //”숫자 i를 하나씩 받아서, 짝수면 남기고 홀수면 버려라
                .filter((int i) -> (i % 2) == 0) // 짝수만 다음 stream으로 넘긴다.
                .map(i -> i * 5) //숫자 i를 하나씩 받아서 5를 곱한 값으로 바꿔라
                .forEach(System.out::println);

        /***************************************************************/


        IntStream intStream2 = IntStream.range(0, 10);

        intStream2
                //”숫자 i를 하나씩 받아서, 짝수면 남기고 홀수면 버려라
                .filter((int i) -> (i % 2) == 0) // 짝수만 다음 stream으로 넘긴다.
                .mapToDouble(i -> i * 5) //결과를 double(실수)로 바꿔서 DoubleStream으로 만든다는 뜻이에요.
                .forEach(System.out::println);
    }
}
