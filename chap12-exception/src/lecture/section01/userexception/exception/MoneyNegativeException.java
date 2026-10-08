package lecture.section01.userexception.exception;

public class MoneyNegativeException extends NegetiveException {

    public MoneyNegativeException() {
    }

    // 예외 설명을 전달해서 Thrawable(부모) 필드에 저장
    public MoneyNegativeException(String message) {
        super(message);
    }

}


