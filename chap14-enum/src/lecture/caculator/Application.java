package lecture.caculator;

import java.util.Scanner;
import java.util.concurrent.CancellationException;

import static lecture.caculator.CalculatorErrorCode.DIVIDE_BY_ZERO;

/*계산기르 만들어보자 */
public class Application {
    static void main(String[] args) throws CancellationException {
        Calculator Calculator = new Calculator(); // 생성자 호출 = 객체

        // 사용자 입력
        Scanner sc = new Scanner(System.in);
        System.out.println("계산기 프로그램 시작");


        //while 계속 반복해
        while (true) {
            System.out.println("계산기 프로그램 시작");
            try {
                System.out.println("연산자를 입력하세여");
                //.trim() 공백제거 후 문자열 반환
                String operation = sc.nextLine().trim();

                if ("exit".equals(operation)) {
                    System.out.println("계산기를 종료합니다.");
                    break; // 반복문 종료
                }

                // 두 숫자를 입력받는 메소드
                Double firstNumber = inputNumber(sc, "첫번째 숫자를 입력하세요 :");
                Double secondNumber = inputNumber(sc, "두번째 숫자를 입력하세요 :");

                //결과
                double result = 0; // 선언, 초기화

                //switch 입력값에 따라 갈라서 처리를
                switch (operation) {
                    case "+":
                        result = Calculator.add(firstNumber, secondNumber);
                        break;
                    case "/":
                        result = Calculator.divide(firstNumber, secondNumber);
                        break;
                    default:
                        // 더하기 나누기 나가기 외에 다른 문자열이면 예외를 던지기
                        // 예외: 다른 연산자가 있을때?
                        throw new CalculatorException(CalculatorErrorCode.INVALID_OPERATOR);
                }
                System.out.println("계산결과:" + firstNumber + " " + operation + " " + secondNumber + " = " + result);
            } catch (CalculatorException  e) {
               // CalculatatorEorro
                // 에러 객체 넘겨줌
                GlobalExceptionHandler.handle(e);
            }

        }
        sc.close();
    }

    // 실수를 입력받는 메소드
    private static double inputNumber(Scanner scanner, String message) {
        System.out.print(message);

        // 숫자를 문자열로 전달받음
        String input = scanner.nextLine().trim();

        // 전달 받은걸 리턴함 // 예외발생함!) 사용자의 입력이 실수로 변환이 안될때
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            throw new CalculatorException(CalculatorErrorCode.INVALID_NUMBER);
        }
    }
}
