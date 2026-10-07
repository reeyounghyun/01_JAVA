package lecture.section01.list.run;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * LinkedList
 * - ArrayList와 사용하는 방법은 유사하나 내부적으로 요소를 저장하는 방식이 다르다.
 * - 요소의 앞순서와 뒷순서의 주소를 함께 저장한다.
 * */

public class Application3 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();


        List arrList = new LinkedList(); // 다형성 적용

        // List의 사용
        arrList.add("apple");
        arrList.add(123);
        arrList.add(45.53);
        arrList.add(LocalDateTime.now());

        System.out.println("arrList = " + arrList); // toString이 오버라이딩 되어있다.

        System.out.println("arrList.size() = " + arrList.size()); // list의 크기

        System.out.println("arrList.get(0) = " + arrList.get(0)); // 인덱스 사용 가능

        arrList.add(1,"banana"); // 추가
        System.out.println("arrList = " + arrList);
        arrList.remove(1); // 삭제
        System.out.println("arrList = " + arrList);


    }
}
