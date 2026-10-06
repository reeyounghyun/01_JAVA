package lecture.section01.extend;

public class Applicetion {
    static void main() {
        /*
       Car car = new Car();
        * */

        //FireCar car = new FireCar();

        RacingCar car = new RacingCar();

        // 부모
        car.soundHorn();
        car.run();
        car.soundHorn();
        car.stop();
        car.soundHorn();

        //자식
       // car.sprayWater();

    }
}
