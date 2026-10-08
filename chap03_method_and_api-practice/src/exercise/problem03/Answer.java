package exercise.problem03;

import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {
        /*
         * 문제 3. 사칙연산 계산기
         *
         * problem03 패키지의 Answer 클래스에서 java.util.Scanner를 import하고
         * Scanner 타입의 scanner 객체를 생성한다.
         * 첫 번째 정수 20을 firstNumber에, 두 번째 정수 5를 secondNumber에 nextInt로 입력받는다.
         * 두 정수를 매개변수로 받아 각각 덧셈, 뺄셈, 곱셈, 나눗셈 결과를 반환하는 non-static 메서드
         * add, subtract, multiply, divide를 작성한다. divide의 반환 타입은 double로 작성한다.
         * Answer 타입의 calculator 객체로 네 메서드를 호출하고 결과를 additionResult,
         * subtractionResult, multiplicationResult, divisionResult에 각각 저장한다.
         * secondNumber에는 0이 아닌 값을 입력하며, 조건문과 반복문은 사용하지 않는다.
         * 입력 안내 문구와 계산 결과를 아래 형식으로 출력한다.
         *
         * 실행 결과
         *
         * 첫 번째 정수 입력 : 20
         * 두 번째 정수 입력 : 5
         *
         * 메서드로 분리할것들
         * 덧셈 결과 : 25
         * 뺄셈 결과 : 15
         * 곱셈 결과 : 100
         * 나눗셈 결과 : 4.0
         */

        Scanner input = new Scanner(System.in);


        Answer answer = new Answer();

        System.out.print("첫 번째 정수 입력 :");
        int firstNum = input.nextInt();

        System.out.print("두 번째 정수 입력 :");
        int secondNum = input.nextInt();

        System.out.println("덧셈 결과 : " + (firstNum + secondNum) );
        System.out.println("뺄셈 결과 : " + (firstNum - secondNum) );
        System.out.println("곱셉 결과 : " + (firstNum * secondNum) );
       // System.out.println("나눗셈 결과 : "+ (firstNum / secondNum) ); 출력 값 : 4
        System.out.println("나눗셈 결과 : " + answer.divide(firstNum, secondNum)); // 출력 값 : 4.0


        System.out.println("메소드 종료......");

    }

    //메서드로 분리
    public int add (int a, int b) {

        return a + b;
    }
    public int minus (int a, int b) {

        return a - b;
    }

    public double multiply(int a, int b) {

        return (double)a * b;
    }

    public double divide(int a, int b) {

        return (double)a / b;
    }
}
