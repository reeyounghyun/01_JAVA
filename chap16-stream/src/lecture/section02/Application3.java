package lecture.section02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Application3 {
    public static void main(String[] args) {

        /*
         * Stream<T> sorted();
         * Stream<T> sorted(Comparator<? super T> comparator);
         * - sorted() 인자가 없으면 오름차순으로 정렬된다.
         */

        List<Integer> integerList2 = IntStream.of(5, 2, 4, 6, 16, 4572) // 오름차순
                .boxed() // 박싱: 기본타입 -> 참조타입으로 변경
                .sorted((s1,s2) -> s2.compareTo(s1))
                .toList(); // 리스트 형으로 변경
        //  .collect(Collectors.toList()); // 리스트 형으로 변경
        System.out.println("integerListm = " + integerList2);


        //compareTo : 문자열
        List<String> stringList = Arrays.asList( "java", "sql", "mybatis", "jdbc", "spring", "java", "mybatis", "sql", "sql");

        List<String> strList2 = stringList.stream()
                .peek((str -> System.out.println("[시작] str = " + str)))
                .sorted((s1,s2) -> s2.compareTo(s1))  // 내림차순
                .peek((str -> System.out.println("[sorted 다음] str = " + str)))
                //peek 중간값 보고싶을떄 사용함.

                .distinct()
                //Arrays.asList( "java", "sql", "mybatis",......); 의 값중 중복을 제거함
                .peek((str -> System.out.println("[distinct 다음] str = " + str)))

                .limit(3)
                // Arrays.asList( "java", "sql", "mybatis",......);  상위 N개 추출 3이니까 3개까지만 나옴
                .peek((str -> System.out.println("[limit 다음] str = " + str)))

                .toList();
                // Arrays.asList( "java", "sql", "mybatis",......);  리스트 형으로 변경

        //  .collect(Collectors.toList()); // 리스트 형으로 변경
        System.out.println("strList2 = " + strList2);
    }
}
