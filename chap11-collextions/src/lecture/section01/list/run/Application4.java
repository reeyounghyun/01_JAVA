package lecture.section01.list.run;

import java.util.Stack;

public class Application4 {
    public static void main(String[] args) {

        /*Stack
         * -후입 선출 방식의 자료구조
         *
         *
         * */
        Stack<Integer> intStack = new Stack<>();

        // push(); stack 자료구조에 데이터를 넣음
        intStack.push(10);
        intStack.push(11);
        intStack.push(12);
        intStack.push(13);
        intStack.push(14);

        // pop() : 해당 스텍의 가장 마지막 요소를 변환 후 제거
        // peek(): 해당 스텍의 가장 마지막요소를 변환

        System.out.println("intStack.peek() =" + intStack.peek());
        System.out.println("intStack =" + intStack);


        System.out.println("intStack.pop() = " + intStack.pop());
        System.out.println("intStack.pop() = " + intStack.pop());
        System.out.println("intStack.pop() = " + intStack.pop());
        System.out.println("intStack.pop() = " + intStack.pop());
        System.out.println("intStack.pop() = " + intStack.pop());
        // 예외발생
//        System.out.println("intStack.pop() = " + intStack.pop());
//        System.out.println("intStack = " + intStack);
    }
}
