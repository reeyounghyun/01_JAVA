package lecture.caculator;

public class CalculatorException extends RuntimeException {

    private final CalculatorErrorCode errorCode;

    public CalculatorException(CalculatorErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public CalculatorErrorCode getErrorCode() {
        return errorCode;
    }
}