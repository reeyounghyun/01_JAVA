package practice.level023.hard;

public class Application03 {

    public static void main(String[] args) {

        /* Q3. Q1 의 Vehicle/Car/Boat 클래스를 그대로 활용해
         *  매개변수 다형성과 리턴 타입 다형성을 구현하세요.
         *
         *  복습 포인트:
         *  - 매개변수에 다형성을 적용하여 사용할 수 있다.
         *  - 리턴 타입에 다형성을 적용하여 사용할 수 있다.
         *
         *  요구사항:
         *   ① VehicleFactory 라는 클래스를 만들고, 다음 두 메소드를 정의한다.
         *      - public static Vehicle create(String type)
         *          · "car"  를 받으면 new Car("가솔린") 을 반환
         *          · "boat" 를 받으면 new Boat("FRP") 을 반환
         *          · 그 외 입력이면 new Vehicle(0) 을 반환
         *      - public static void runVehicle(Vehicle v)
         *          · 매개변수로 받은 Vehicle 의 move() 를 호출한다.
         *
         *   ② main 에서 다음을 수행한다.
         *      - "car" 와 "boat" 를 인자로 create() 를 호출해 결과를 받고,
         *        반환된 Vehicle 들을 runVehicle() 에 전달해 동작시킨다.
         *
         * -- 출력 예시 --
         * 자동차가 도로를 달립니다.
         * 보트가 물 위를 떠다닙니다.
         * */

        Vehicle v1 = VehicleFactory.create("car");
        Vehicle v2 = VehicleFactory.create("boat");

        VehicleFactory.runVehicle(v1);
        VehicleFactory.runVehicle(v2);

    }
}
