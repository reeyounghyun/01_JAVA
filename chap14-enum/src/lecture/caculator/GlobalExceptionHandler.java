package lecture.caculator;

// 발생한 예외를 한곳에서 처리
public class GlobalExceptionHandler {

    // 예외가 발생되면 처리하는 메소드
    public static void handle(CalculatorException exception) {
        CalculatorErrorCode errorCode = exception.getErrorCode();

        System.out.println("[계산기 오류]");
        System.out.println("오류 코드 : " + errorCode.getCode());
        System.out.println("오류 내용 : " + errorCode.getMessage());
    }
}