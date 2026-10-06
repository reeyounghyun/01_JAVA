package lecture.section04.exercise;

public class Appliaction {

    static void main() {
        /*
         * Firecar와 RacingCar는 앞으로 갈 수 있다.( go() )
         * - ex) System.out.println("소방차가 앞으로 갑니다..)
         * Firecar와 RacingCar는 멈출 수 있다.( stop() )
         * - ex) System.out.println("소방차가 멈춥니다..)
         * Firecar만 경적을 울릴 수 있다. ( horn() )
         *
         * 상속과 구현을 이용해서 완성해보세요!
         * */

        Firecar Firecar = new Firecar();
        Firecar.go();
        Firecar.stop();
        Firecar.horn();

        RacingCar racingCar = new RacingCar();
        racingCar.go();
        racingCar.stop();

    }
}
