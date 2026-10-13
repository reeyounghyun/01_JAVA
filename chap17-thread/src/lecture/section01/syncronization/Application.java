package lecture.section01.syncronization;

public class Application {

    public static void main(String[] args) {
       // Account account = new Account();
        SafeAccount account = new SafeAccount();


        // 소레드를 만들고 스레드가 할 작업 정의하는거
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                account.withdraw(300);
            }
        },"일꾼1" );

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                account.withdraw(300);
            }
        },"일꾼2" );
        t1.start();
        t2.start();
    }
}
