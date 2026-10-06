package lecture.section03.example;

// 결제를 계좌이체 형태로 구현
public class BankTransferPaymentProcess implements PaymentProcessor{
    @Override
    public boolean pay(int amount) {
        System.out.println("계좌이체로 " + amount + "원을 결제합니다.");
        return true;
    }
}