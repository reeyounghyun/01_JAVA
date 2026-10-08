package lecture.section01.userexception.exception;

public class PriceNegativeException extends NegetiveException {

    /*
    * 사용자 정의 예외
    * */

    public PriceNegativeException() {
    }

    // 예외 설명을 전달해서 Thrawable(부모) 필드에 저장
    public PriceNegativeException(String message) {
        super(message);
    }



}


