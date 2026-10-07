package practice.level023.hard;

//    요구사항:
//            *   ① VehicleFactory 라는 클래스를 만들고, 다음 두 메소드를 정의한다.
//         *      - public static Vehicle create(String type)
//         *          · "car"  를 받으면 new Car("가솔린") 을 반환
//         *          · "boat" 를 받으면 new Boat("FRP") 을 반환
//         *          · 그 외 입력이면 new Vehicle(0) 을 반환
//         *      - public static void runVehicle(Vehicle v)
//         *          · 매개변수로 받은 Vehicle 의 move() 를 호출한다.

import practice.level022.hard.level02.hard.Boat;
import practice.level022.hard.level02.hard.Car;

public class VehicleFactory {

    public static Vehicle create(String type) {

        if (type.equals("car")) {
            return new Car("가솔린");
        } else if (type.equals("boat")) {
            return new Boat("FRP");
        }
    } else {
        return new Vehicle(0);
    }


}
