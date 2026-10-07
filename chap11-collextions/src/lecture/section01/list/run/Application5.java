package lecture.section01.list.run;

import java.util.LinkedList;
import java.util.Queue;

public class Application5 {
    public static void main(String[] args) {
        /*
        * Queue
        * - 선형 메모리 공간에 데이터를 저장하는 선입선출(FIFQ) 방식의 자료구조*/

        Queue<String> que = new LinkedList<>();


        // 데이터를 넣는 것
        que.offer("first");
        que.offer("second");
        que.offer("third");
        que.offer("fourth");
        que.offer("fifth");

        System.out.println("que = " + que);
        /*peek():큐의 가장 앞에있는 요소를 반환하다.
         poll(): 큐의 가장 앞에있는 요소를 반환하고 제거한다.*/

        System.out.println("que.peek = " + que.peek());
        System.out.println("que.peek = " + que.peek());
        System.out.println("que.poll = " + que.poll());
        System.out.println("que.poll = " + que.poll());
        System.out.println("que.poll = " + que.poll());
        System.out.println("que.poll = " + que.poll());
        System.out.println("que.poll = " + que.poll());
        System.out.println("que.poll = " + que.poll());
    }
}
