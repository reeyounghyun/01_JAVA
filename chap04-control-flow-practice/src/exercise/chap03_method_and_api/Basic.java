package exercise.chap03_method_and_api;

import java.util.Scanner;

public class Basic {
// 메소드, 제어문 연습문제
/*
* &#x20;        /\* 다음 조건을 만족하는 프로그램을 작성하시오.
&#x20;        \*   구현 클래스 Calculator, Application01
&#x20;        \*   구현 내용
&#x20;        \*   Calculator
&#x20;        \*   - checkMethod(): void 설명 : 함수 호출, 확인용 메소드
&#x20;        \*   - sumTwoNumber(a:int, b:int): int 설명 : 두 수를 입력 받아 합을 리턴한다.
&#x20;        \*   - minusTwoNumber(a:int, b:int): int 설명 : 두 수를 입력 받아 차를 리턴한다.
&#x20;        \*   - multiTwoNumber(a:int, b:int): int 설명 : 두 수를 입력 받아 곱한 값을 리턴한다.
&#x20;        \*   - divideTwoNumber(a:int, b:int): int 설명 : 두 수를 입력 받아 나눈 값을 리턴한다.
&#x20;        \*
&#x20;        \*   Application01
&#x20;        \*   - main(args:String\[]): void 설명 : 모든 메소드는 main 함수에서 호출하여 출력한다.
&#x20;        \*   // 메소드 호출 확인용 메소드 호출
&#x20;        \*   // 10, 20 두 개의 정수를 매개변수로 하여 두 수를 더하는 메소드 호출 후 리턴값 출력
&#x20;        \*   // 10, 5 두 개의 정수를 매개변수로 하여 두 수의 차를 구하는 메소드 호출 후 리턴값 출력
&#x20;        \*   // 10, 5 두 개의 정수를 매개변수로 하여 두 수의 곱을 구하는 메소드 호출 후 리턴값 출력
&#x20;        \*   // 10, 5 두 개의 정수를 매개변수로 하여 두 수의 몫을 구하는 메소드 호출 후 리턴값 출력
&#x20;        \*
&#x20;        \*   \* Application
&#x20;        \*     - Calculator calc = new Calculator()
&#x20;        \*     - 이 구문은 Calculator 메소드를 호출하기 위해 추가한다.
&#x20;        \*

&#x20;        \*   실행 결과

&#x20;        \*   - 메소트 호출 확인
&#x20;        \*   - 10과 20의 합 : 30
&#x20;        \*   - 10과 5의 차 : 5
&#x20;        \*   - 10과 5의 곱 : 50
&#x20;        \*   - 10과 5의 나눈 후 몫 : 2
&#x20;        \*  \*/

    //호출하는 영역
    // - checkMethod(): void 설명 : 함수 호출, 확인용 메소드
    public void checkMethod() {
        System.out.println("checkMethod 호출 확인");
    }

    public int sumTwoNumber(int a, int b) {
        return a + b;
    }

    public int minusTwoNumber(int x, int y) {
        return x - y;
    }

    public int multiTwoNumber(int x, int y) {
        return x * y;
    }

    public double divideTwoNumber(int x, int y) {
        return (double) x / y;
    }

    //sumTwoNumber(a:int, b:int): int 설명 : 두 수를 입력 받아 합을 리턴한다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Basic calc = new Basic();
        calc.checkMethod();

        int first = 10;
        int second = 20;
        int third = 5;

        System.out.println("10과20의 합:" + calc.sumTwoNumber(first,second));
        //int result = calc.sumTwoNumber(10, 20);
        calc.sumTwoNumber(10,20);
        //System.out.println("10과20의 합 : "+result);

        System.out.println("10과20의 차:" + calc.minusTwoNumber(first,second));
        //int result2 = calc.minusTwoNumber(10, 5);
        calc.minusTwoNumber(10,5);
        //System.out.println("10과 5의 차 : "+)result2;

        System.out.println("10과20의 곱:" + calc.multiTwoNumber(first,third));
        //int result3 = calc.multiTwoNumber(10,5);
        calc.multiTwoNumber(10,5);
       // System.out.println("10과 5의 곱: "+result3);

        System.out.println("10과20의 나누기:" + calc.divideTwoNumber(first,third));
        //int result4 = (int) calc.divideTwoNumber(10,5);
        calc.divideTwoNumber(10,5);
        //System.out.println("10과 5의 나누기 : "+result4);
    }

}
