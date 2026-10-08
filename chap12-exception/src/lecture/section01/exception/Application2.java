package lecture.section01.exception;

public class Application2 {
    public static void main(String[] args) {
        /*
         * 예외를 발생 시키고 처리하는 벙법 두가지?
         * 1. throw로 위임.
         * 2. tty-catch로 처리
         * */

        ExceptionTest et = new ExceptionTest(); // 객체 생성


        try {
            et.checkEnoughMoney(50000, 100000); // 예외발생지점

            System.out.println("checkEnoughMoney가 생행되었습니다.");
            // 예외가 발생하게되면 그 다음 코드는 실행시키지않고, catch로 이동해 코드가 진행된다.

        } catch (Exception e) {
            System.out.println("예외가 발생했습니다."); // 예외가 밸생했을때 동작할 처리
        }

        System.out.println("프로그램을 종료합니다.");
        // 예외가 try-catch문에서 처리가 되어
        // 출력이 되는것을 확인 할 수 있음.
    }
}
