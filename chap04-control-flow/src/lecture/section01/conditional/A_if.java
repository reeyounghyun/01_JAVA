package lecture.section01.conditional;
import java.util.Scanner;

//조건문
public class A_if {

    /* if문 작성법
     *
     * if([조건식]) {
     * [조건식이 true일때 동작할 코드]
     * }
     *
     * */

    public void testSimpleIf() {
        /* 전달된 정수가 짝수면 : 작수입니다.
         * 아니면 "홀수입니다"
         * */

        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();


        if ((num % 2) == 0) {
            // 짝수 일때만 , 참일때만 실행되고, 홀수 일때는 건너 뛰거나 else가 있으면 else가 실행됨.
            System.out.println("짝수입니다.");
        }

        if ((num % 2) == 0) {
            // 짝수 일때만 , 참일때만 실행되고, 홀수 일때는 건너 뛰거나 else가 있으면 else가 실행됨.
            System.out.println("짝수입니다.");
        } else {
            // 참이 아닐 때만 동작함
            System.out.println("홀수입니다.");
        }


        System.out.println("프로그램을 종료합니다.");
    }
}
