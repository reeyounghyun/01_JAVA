//package practice.level01.normal;
//
//public class Application02 {
//    /* Q2. 다음 조건에 맞는 클래스 구조를 작성하고, 객체를 생성하여 다형성을 활용한 메소드 호출을 구현하세요.
//     *
//     * 복습 포인트:
//     * - 다형성의 개념을 이해하고 설명할 수 있다.
//     * - 인터페이스를 활용하여 다형성을 구현할 수 있다.
//     *
//     * 인터페이스명: Payment
//     * 메소드: 결제하다(pay) - 결제 방법을 출력
//     *
//     * 클래스명: CreditCard (구현 클래스)
//     * 메소드: 결제하다(pay) - "신용카드로 결제합니다." 출력 (인터페이스 메소드 구현)
//     *
//     * 클래스명: Cash (구현 클래스)
//     * 메소드: 결제하다(pay) - "현금으로 결제합니다." 출력 (인터페이스 메소드 구현)
//     *
//     * Payment 타입의 배열을 생성하고, CreditCard와 Cash 객체를 배열에 추가한 후, 배열을 순회하며 결제하다 메소드를 호출하여 결과를 출력
//     *
//     * 출력 예시:
//     * 신용카드로 결제합니다.
//     * 현금으로 결제합니다.
//     * */
//
//    public static void main(String[] args) {
//
//        Payment[] payments = new Payment[2];
//        payments[0] = new CreditCard();
//        payments[1] = new Cash();
//
//        for (Payment payment : payments) {
//            payment.pay();
//        }
//
//    }
//
//}
