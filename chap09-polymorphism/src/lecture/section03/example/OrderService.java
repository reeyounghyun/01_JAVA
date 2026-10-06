package lecture.section03.example;

// 주문을 처리하는 클래스
public class OrderService {
    // 필드
    private final PaymentProcessor paymentProcessor;

    // 생성자
    public OrderService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    // 메서드
    public void checkout(int amount) {
        System.out.println("주문 결제를 시작합니다..");

        if(paymentProcessor.pay(amount)) {
            System.out.println("주문이 완료되었습니다.");
        } else {
            System.out.println("주문이 실패하였습니다.");
        }
    }
}