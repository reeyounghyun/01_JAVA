package lecture.section03;

public class carRacer {
    private Car car = new Car();

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    // 시동걸기
    public void startUp() {
        car.startUp();
    }

    // 엑셀밟기
    public void stepAccelator() {
        car.go();
    }

    // 브레이크 밟기
    public void stepBreak() {
        car.stop();
    }

    // 시동끄기
    public void turnOff() {
        car.turnOff();
    }
}
