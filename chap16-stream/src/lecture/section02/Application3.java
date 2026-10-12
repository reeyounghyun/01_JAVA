package lecture.section02;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Nodes.collect;

public class Application3 {
    public static void main(String[] args) {

        /*
         * Stream<T> sorted();
         * Stream<T> sorted(Comparator<? super T> comparator);
         * - sorted() 인자가 없으면 오름차순으로 정렬된다.
         */

        List<Integer> integerListm = IntStream.of(5, 2, 4, 6, 16, 4572)
                .boxed() // 박싱: 기본타입 -> 참조타입으로 변경
                .sorted()
                .toList(); // 리스트 형으로 변경
        //  .collect(Collectors.toList()); // 리스트 형으로 변경
        System.out.println("integerListm = " + integerListm);

    }
}
