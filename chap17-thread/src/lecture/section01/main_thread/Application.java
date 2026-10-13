package lecture.section01.main_thread;

public class Application {
    public static void main(String[] args) {

        // Thread 추상화
        Thread current = Thread.currentThread();
        System.out.println("지금 이코드를 수행하는 스레드 = " + current);
        System.out.println("지금 이코드를 수행하는 스레드 = " + current.getName());  // 메인스레드

        // main 스레드 혼자서 모든 반복을 처리한다.
        for (int i = 1; i <= 5; i++) {
            System.out.println("[" + current.getName() + "]" + i + "번 작업처리");
        }

        // 얼마나 할당을 받았나?

        // 현제 JVM이 사용할 수 있는 CPU 코어 갯수를 알려줌
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("코어 갯수:" + cores);
    }
}
