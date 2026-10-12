package lecture.section03;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Application1 {
    static void main(String[] args) {

        // 최소,최대,종합, 평균...
        Long count = IntStream.range(0, 10).count();
        System.out.println("count = " + count);

        int sum = IntStream.range(0, 10).sum();
        System.out.println("sum = " + sum);

        OptionalDouble average = IntStream.range(0, 10).average();
        System.out.println("average = " + average.getAsDouble());

        OptionalInt max = IntStream.range(0, 10).max();
        System.out.println("max = " + max.getAsInt());

        int oddSum = IntStream.range(1, 10)
                .filter((int i) -> i % 2 == 1)
        .sum();
        System.out.println("oddSum = " + oddSum);

    }
}
