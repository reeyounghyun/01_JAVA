package lecture.section02.set.run;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Application2 {
    /*
     * TreeSet
     * - 데이터가 정렬된 상태로 저장되는 이진 검색 트리
     *
     *         20
              /  \
            10    30
           /  \
          5   15
        - 현재 값보다 작으면 왼쪽
        - 현재값보다 크면 오른쪽
        * 이렇게 하는 이유? => 검색, 추가, 삭제를 효율적으로 처리할 수 있도록 해주는 알고리즘.
     * //
     * */

    public static void main() {
        TreeSet<Integer> test = new TreeSet<>();

        test.add(10);
        test.add(6);
        test.add(1);
        test.add(20);
        test.add(45);

        // 오름차순 정렬
        System.out.println("오름차순 정렬 = " + test);


        LinkedHashSet<String> hset = new LinkedHashSet<>();

        hset.add("java");
        hset.add("mysql");
        hset.add("jdbc");
        hset.add("html");
        hset.add("css");

        System.out.println("hset = " + hset);

        TreeSet<String> tset2 = new TreeSet<>(hset);
        System.out.println("영문 오름차순 정렬 = " + tset2);

    }
}
