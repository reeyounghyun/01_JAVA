package lecture.section02;

import java.util.stream.IntStream;

public class Application1 {
    public static void main() {

        /*
        중간 연산
        -스트림을 받아서 가공한 뒤 다시 스트림을 돌려주는 연산
         *  (filter, map 등) → 뒤에 계속 이어 붙일 수 있음

        filter
       - Predicate(조건)를 하나 받아서, 조건에 맞는 것만 남긴 새 Stream을 돌려준다.”

        Stream<T> filter(Predicate<? super T> predicate

         Stream<T> : 돌려주는 값 /
         filter : 이름 /
         (Predicate<? super T> : 받는 타입 /
         predicate: 받는 이름
        */

        // 0부터 9까지의 정수 스트림 생성 (10은 포함 안 됨)
        // 출력: 0 1 2 3 4 5 6 7 8 9
        IntStream intStream = IntStream.range(0, 10);

        // i 가 짝수일때 true;
        //Predicate<IntStream> predicate = (i) -> (i%2) == 0;
        intStream
                // 중간 연산: 짝수만 남김
                // 0 1 2 3 4 5 6 7 8 9 → 0 2 4 6 8
                .filter((i) -> (i % 2) == 0)   // .filter(isEven) 으로 써도 똑같음

                // 최종 연산: 남은 값을 하나씩 출력
                .forEach(System.out::println);

        // 출력 결과:
        // 0
        // 2
        // 4
        // 6
        // 8


        // ✗ 아래 줄의 주석을 풀면 에러가 남
        // 위에서 forEach로 이미 스트림을 다 써버렸기 때문 (스트림은 한 번만 사용 가능)
        //intStream.forEach(System.out::println);

    }
}
