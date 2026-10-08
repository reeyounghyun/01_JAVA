package lecture.section01.userexception.exception;

public class NotEnoughMoneyException extends NegetiveException {

    public NotEnoughMoneyException() {
    }

    // 예외 설명을 전달해서 Thrawable(부모) 필드에 저장
    public NotEnoughMoneyException(String message) {
        super(message);
    }

}


