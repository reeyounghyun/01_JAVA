package lecture.caculator;

public enum CalculatorErrorCode {

    INVALID_OPERATOR("CAL-001", " +, /, exit 만 입력할 수 있습니다."),
    INVALID_NUMBER("CAL-002", "숫자 형식으로 입력해주세요"),
    DIVIDE_BY_ZERO("CAL-003", "0으로 나눌 수 없습니다.");

    // 예외를 상수형태로 추가
    private final String code;
    private final String message;


    // 생성자
    CalculatorErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    //Getter
    public String getCode() {
        return code;
    }

    //Getter
    public String getMessage() {
        return message;
    }
}
