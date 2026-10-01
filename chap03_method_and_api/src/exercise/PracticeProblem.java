package exercise;

public class PracticeProblem {

    public static void main(String[] args) {
            /*

            chap03 method_and_api 연습문제*
            각 문제는 별도의 problemNN 패키지와 main 메서드를 가진 Answer 클래스에서 해결한다.
            문제에서 지정한 메서드 이름, 매개변수, 반환 타입과 호출 방법을 지킨다.
            먼저 실행 결과를 예상한 뒤 코드를 작성하고 실행한다.*/

                /*

            문제 1. 온라인 주문 출고 처리*
            problem01 패키지의 Answer 클래스 main 메서드에서 "출고 처리 시작"을 출력한다.
            Answer 타입의 orderManager 객체를 생성한다.
            매개변수와 반환값이 없는 non-static 메서드 verifyPayment, packOrder,
            handOverToCourier를 작성하고, 각 메서드에서 담당 업무의 완료 메시지를 출력한다.
            orderManager 객체로 세 메서드를 업무 순서대로 호출한다.
            모든 메서드의 호출이 끝나면 main 메서드에서 "출고 처리 종료"를 출력한다.*
            실행 결과
            출고 처리 시작
            결제를 확인했습니다.
            상품 포장을 완료했습니다.
            택배사에 상품을 인계했습니다.
            출고 처리 종료*/

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
             * 첫 번째 정수 입력 : 20
             * 두 번째 정수 입력 : 5
             * 덧셈 결과 : 25
             * 뺄셈 결과 : 15
             * 곱셈 결과 : 100
             * 나눗셈 결과 : 4.0
             */
    }

}
