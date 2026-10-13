package lecture.section01.syncronization;

public class Account {
// 여러 스레드를 사용하때 같이 사용하여 동기화가 되지않는 예외발생.

    private int balance = 1000; // 계좌 잔액

    // 출금을 할수있는 메소드
    public void withdraw(int money) {
        if (balance >= money) {
            try {
                Thread.sleep(1000); // 대기시간
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            balance -= money;

            System.out.println(Thread.currentThread().getName()+ ":" + "출금이 " + money + "원 완료되었습니다.");
            System.out.println(Thread.currentThread().getName()+ ":" +  "잔액이 " + balance + "원 남았습니다.");
        }

    }

}
