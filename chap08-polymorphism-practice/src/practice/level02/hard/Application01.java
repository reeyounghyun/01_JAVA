package practice.level02.hard;

public class Application01 {

    public static void main(String[] args) {
        /* Q1. 다음 조건에 맞는 클래스 구조를 작성하고, 객체를 생성하여 다형성을 활용한 메소드 호출을 구현하세요.
         *
         * 복습 포인트:
         * - 다형성의 개념을 이해하고 설명할 수 있다.
         * - 부모 클래스 타입의 변수로 자식 클래스 객체를 참조할 수 있다.
         * - 부모 클래스의 메소드를 자식 클래스에서 오버라이딩할 수 있다.
         *
         * 클래스명: Vehicle (부모 클래스)
         * 필드: 최대 속도(maxSpeed, 정수)
         * 메소드: 이동(move) - "차량이 이동합니다." 출력
         *
         * 클래스명: Car (자식 클래스)
         * 필드: 연료 타입(fuelType, 문자열)
         * 메소드: 이동(move) - "자동차가 도로를 달립니다." 출력 (메소드 오버라이딩)
         *
         * 클래스명: Boat (자식 클래스)
         * 필드: 선체 타입(hullType, 문자열)
         * 메소드: 이동(move) - "보트가 물 위를 떠다닙니다." 출력 (메소드 오버라이딩)
         *
         * Vehicle 타입의 배열을 생성하고, Car와 Boat 객체를 배열에 추가한 후, 배열을 순회하며 이동 메소드를 호출하여 결과를 출력
         *
         * 출력 예시:
         * 자동차가 도로를 달립니다.
         * 보트가 물 위를 떠다닙니다.
         * */

        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Car("가솔린");
        vehicles[1] = new Boat("단단한 선체");

        for (Vehicle vehicle : vehicles) {
            vehicle.move();
        }

    }

}
