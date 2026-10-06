package lecture.section03;

public class Car {

    // 추상화 : 공통되는 부분만 추출하고, 나머지는 제거

    private boolean isOn; // 시동이 켜졌나?
    private int speed; // 속도

    // 자동차의 행위 (시동걸림)
    public void startUp() {

        if(isOn) {
            // 켜져있으면(True)
            System.out.println("이미 시동이 걸려있습니다.");
        } else {
            // 꺼져있으면(False)
            this.isOn = true;
            System.out.println("시동을 걸었습니다..");
        }
    }

    // 시동이 걸렸을때 속도를 10km/h 올리기
    public void go() {
        if(isOn) {
            System.out.println("차가 앞으로 움직입니다.");
            this.speed += 10;
            System.out.println("현재 차의 시속은 "+ this.speed + "km/h 입니다.");
        } else {
            System.out.println("시동이 걸려있지 않습니다.");
        }
    }

    // 멈추기
    public void stop() {
        if(isOn) {
            if(speed > 0) {
                this.speed = 0;
                System.out.println("브레이크를 밟았습니다. 차를 멈춥니다.");
            } else  {
                System.out.println("이미 차가 멈춘 상태입니다.");
            }
        } else {
            System.out.println("차의 시동이 안걸려있습니다..");
        }
    }

    // 시동끄기
    public void turnOff() {
        if(isOn) {
            if(speed > 0) {
                System.out.println("달리는 상태에서 시동을 끌 수 없습니다.");
            } else {
                this.isOn = false;
                System.out.println("시동을 끕니다.");
            }
        } else {
            System.out.println("시동이 꺼진 상태입니다.");
        }
    }
}