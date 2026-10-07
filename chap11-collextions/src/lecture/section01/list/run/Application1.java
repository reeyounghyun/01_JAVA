package lecture.section01.list.run;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Application1 {
    public static void main(String[] args) {
        /*
         * ArrayList
         * - 배열의 단점을 보완
         * - 크기변경, 요소의 추가삭제, 정렬기능을 구현해놓았다.
         * */

        ArrayList arrayList = new ArrayList();
        List arrList = new ArrayList(); // 다형성 적용

        
        // List의 사용
        arrList.add("apple");  //참조형 Heap
        arrList.add(123); // 기본자료형 Heap
        arrList.add(45.53); // 기본자료형 Heap
        arrList.add(LocalDateTime.now()); //참조형 Heap

        System.out.println("arrList = " + arrList);  // toString이 오버라이딩 되어있다.

        System.out.println("arrList.size() = " + arrList.size()); // list의 크기

        System.out.println("arrList.get(0) = " + arrList.get(0)); // 인텍스 사용 가능
        
        arrList.add(1,"banana");
        System.out.println("arrList = " + arrList);
        arrList.remove(1); // 삭제
        System.out.println("arrList = " + arrList);
        

    }
}
