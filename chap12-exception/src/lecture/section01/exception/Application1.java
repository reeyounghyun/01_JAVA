package lecture.section01.exception;

public class Application1 {
    public static void main(String[] args) {
        /*
         * 예외를 발생시키고 처리하는 방법 두 가지
         * 1. throws로 위임
         * 2. try-catch로 처리
         * */

        ExceptionTest et = new ExceptionTest(); // 객체 생성

        try {
            et.checkEnoughMoney(10000, 500000);  // 예외 발생 지점
            et.checkEnoughMoney(50000, 100000);  // 위에서 예외가 나면 실행되지 않는다
        } catch (Exception e) {
            System.out.println("예외 발생: 돈이 부족합니다.");
        }

        // 예외를 잡았으므로 여기까지 실행된다
        System.out.println("프로그램을 종료합니다.");
    }
}