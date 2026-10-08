package exercise;

public class Application01 {
    public static void main(String[] args) {
        /*
         * 문제 3. 상수를 이용한 상품 금액 계산
         *
         * 상품명, 상품 단가, 구매 수량을 상수로 선언한다.
         * - 상품명: 키보드
         * - 상품 단가: 12000
         * - 구매 수량: 3
         * 단가와 수량을 곱한 결과를 totalPrice 변수에 저장하여 출력한다.
         * 상수 이름은 대문자와 밑줄을 사용한다.
         *
         * 실행 결과
         * 상품명 : 키보드
         * 단가 : 12000원
         * 수량 : 3개
         * 총 금액 : 36000원
         */

       //답안
        final String ProudctName  = "키보드";
        final int price =12000;
        final int quantity = 3;

        final int totalPrice = ProudctName + quantity;

        System.out.println("상품명 =" + ProudctName );
        System.out.println("단가 =" + price + "원");
        System.out.println("수량 =" + quantity + "개");
        System.out.println("총 금액 =" + totalPrice + "원" );

    }
}
