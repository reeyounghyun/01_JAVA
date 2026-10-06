package lecture.section01.extend;

// 부모 클래스
public class Car {

    // 필드: 달리 중 상태
    private boolean runningStatus;


    // 생성자
    public  Car () {
        System.out.println("Car 기본생성자가 호출되었습니다");
    }


    // 매소드
    // 출력문으로 경적 올리기
    public void soundHorn() {

        if(isRunning()) {
            System.out.println("빵!빵!");
        } else  {
            System.out.println("경적을 울릴수 없습니다!!!");
        }
    }


    //달리는 기능
    public void run() {
        runningStatus = true;
        System.out.println("자동차가 달립니다");

    }

    //멈추는 기능
    public void stop() {
        runningStatus = false;
        System.out.println("자동차가 멈춥니다.");
    }


    // private Car 클래스에서만 사용함
    // 현재 주행상태를 확인 할 수 있는 매서드
   protected boolean isRunning() {
        return runningStatus;
    }

    @Override
    public String toString() {
        return "Car{" +
                "runningStatus=" + runningStatus +
                '}';
    }
}
