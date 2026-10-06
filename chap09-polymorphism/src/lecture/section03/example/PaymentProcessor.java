package lecture.section03.exercise;

/* 결제수단을 제공하는 기능
 *
 *  pay(); boolean 응답 (결제가 되었으면 true, 아니면 false), 급액을 매개변수로 받음
 * */
public interface PaymentProcessor {

    //추상 메소드
    boolean pay (int amount);
}
