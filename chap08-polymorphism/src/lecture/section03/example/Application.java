package lecture.section03.example;

public class Application {
    public static void main(String[] args) {

        // 결제수단
        BankTransferPaymentProcess bank = new BankTransferPaymentProcess();
        CreditCardPaymentProcess credit = new CreditCardPaymentProcess();

        OrderService orderService = new OrderService(bank);
        orderService.checkout(50000);
    }
}