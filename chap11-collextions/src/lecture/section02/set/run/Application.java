package lecture.section02.set.run;

import java.util.HashSet;
import java.util.Iterator;


public class Application {
    static void main() {
        /*
         * HashSet
         * - Set 인터페이스에서 가장 많이 사용되는 구현체
         * - 요소의 순서를 유지하지 않는다.
         * - 같은 요소의 중복저장을 허용하지 않는다.
         * */

        HashSet<String> hset = new HashSet<>();

        // 다형성을 사용해 상위 인터페이스 타입으로 사용이 가능하다.
        //  Set hset2 = hset;
        //  Collection hset3 = hset;

        // set.add 자동완성 -> hSet.add()
        hset.add("java");
        hset.add("mysql");
        hset.add("Jdbc");
        hset.add("html");
        hset.add("css");

        // 저장 순서는 유지가 안됨
        System.out.println("hSet = " + hset);
        System.out.println("hSet.size = " + hset.size()); // 크기를 가지고 올 수 있음


        System.out.println("< 중복 추가 java가 한개만 있고 추가가 안됨 >");
        hset.add("java");
        System.out.println("hset = " + hset);

        // 저장된 내용을 한개씩 꺼내는 기능이 없다.
        // hSet.toArray(); //set.toArray
        System.out.println("< 배열로 변환해서 오소꺼내기 >");
        Object[] arr = hset.toArray();
        for (Object obj : arr) {
            System.out.println("obj = " + obj);
        }

        // Iterator (반복지)
        // - 컬렉션에서 값을 읽어오는 방식을 통일하기위해 사용

        // hasNext() : 블린값을 나타내여 다음 요소가 있으면 true, 없으면  false 반환 / 반복문으로 활용할 수 있음.
        // next() : 다음 요소를 반환
        // hset.iterator();
        // Iterator 은 index가 없을 때 사용할 수 있다.
        Iterator<String> iter = hset.iterator();

        while (iter.hasNext()) {
            System.out.println("iter.next() = " + iter.next());  // 요소를 반환 받을 수 있음.
        }
    }
}
