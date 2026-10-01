package lecture.section02.math;

public class Application1 {

    /*Math
     - 수학에서 자주 사용하는 함수
    *- 함수들을 미리 구현해놓은 클래스
    */
    public static void main(String[] args) {

        // 절대값
        System.out.println("-7의 절대값 :" + Math.abs(-7));

        // 최대값, 최소값
        System.out.println(Math.min(10,20)); // 둘 중 작은수?
        System.out.println(Math.max(10,20)); // 둘 중 큰수?

        // 상수  : 변하지 않는 변수
        System.out.println("원주율 :" + Math.PI);

        //랜덤함수 (난수)
        // 호출 할 때 마다 다른 실수형태의 값을 만들어준다.
        System.out.println("난수 :" + Math.random());

        // 1 ~ 10까지 난수
        int random = (int) (Math.random() * 10) + 1; // +1은 첫번째 자리가 0이 나오지않게

        System.out.println("랜덤 수 = " + random);
    }
}
