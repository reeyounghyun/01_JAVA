package lecture.section04.exercise;

public class Firecar extends Car implements Soundable {

    @Override
    public void go() {
        System.out.println("소방차가 앞으로 값니다.");
    }

    @Override
    public void stop() {
        System.out.println("소방차가 멈춥니다.");
    }

    @Override
    public void horn() {
        System.out.println("소방차가 경적을 울립니다..");
    }
}
