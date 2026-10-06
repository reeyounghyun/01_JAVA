package practice.level02.hard;

public class Application02 {

    public static void main(String[] args) {
        /* Q2. 다음 조건에 맞는 클래스 구조를 작성하고, 객체를 생성하여 다형성을 활용한 메소드 호출을 구현하세요.
         *
         * 복습 포인트:
         * - 다형성의 개념을 이해하고 설명할 수 있다.
         * - 인터페이스를 활용하여 다형성을 구현할 수 있다.
         *
         * 인터페이스명: Appliance
         * 메소드: 작동하다(operate) - "가전제품이 작동합니다." 출력
         *
         * 클래스명: WashingMachine (구현 클래스)
         * 메소드: 작동하다(operate) - "세탁기가 작동합니다." 출력 (인터페이스 메소드 구현)
         *
         * 클래스명: Refrigerator (구현 클래스)
         * 메소드: 작동하다(operate) - "냉장고가 작동합니다." 출력 (인터페이스 메소드 구현)
         *
         * Appliance 타입의 배열을 생성하고, WashingMachine과 Refrigerator 객체를 배열에 추가한 후, 배열을 순회하며 작동하다 메소드를 호출하여 결과를 출력
         *
         * 출력 예시:
         * 세탁기가 작동합니다.
         * 냉장고가 작동합니다.
         * */

        Appliance[] appliances = new Appliance[2];
        appliances[0] = new WashingMachine();
        appliances[1] = new Refrigerator();

        for (Appliance appliance : appliances) {
            appliance.operate();
        }

    }

}
