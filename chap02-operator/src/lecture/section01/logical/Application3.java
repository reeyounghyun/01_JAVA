package lecture.section01.logical;

public class Application3 {
    public static void main(String[] args) {


        /*
        단락평가
        : &&와 ||에서 앞의 조건만으로 전체 결과가 결정되면, 뒤의 조건은 실행하지 않는 규칙
        * */

        int num = 10;
        int zero = 0;

        //int result = num / zero;


        // 앞의 조건이 false가 되므로 and 연산으로 비교할 뒤의 조건을 실행하지 않는다.
        boolean result = zero != 0 && ((num / zero) > 2);
        System.out.println("result = " + result); // 뒤의 조건이 실행되지 않아 예외가 방생하지 않는다.

        int count = 10;
        boolean result12 = true || ++count > 0;

        System.out.println("result12 = " + result12);
        System.out.println("count = " + count);


    }
}
