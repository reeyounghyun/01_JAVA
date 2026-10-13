package lecture.section01.syncronization;

public class SafeAccount {
//여러 스레드를 사용할때 동기화가 되어 하나씩 처리하여 더 안전하게 락을 건다.

    private int balance = 1000; // 계좌 잔액

    // 출금을 할수있는 메소드
    // synchronized : 특정 코드영역(임계영역)에 한번에 하나의 스레드만 들어올수 있도록 막아주는 역할
    public synchronized void withdraw(int money) {
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
