package lecture.section03.example;

// 결제를 카드결제 형태로 구현
public class CreditCardPaymentProcess implements PaymentProcessor{
    @Override
    public boolean pay(int amount) {
        System.out.println("카드결제로 " + amount + "원을 결제합니다.");
        return true;
    }
}