package lecture.section02.virtual_thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.lang.Thread.sleep;

public class Application {
    public static void main() {
        int taskCount = 10_000;

        // 작업 갯수
        System.out.println("=== 플랫폼 스레드 풀(200명)로 " + taskCount + "개 처리 ===");
        // 시작시간
        long start = System.currentTimeMillis();

        // ExecutorService 생성 ( 스레드풀 생성)
        try (ExecutorService executor = Executors.newFixedThreadPool(200)) {

            for (int i = 0; i < taskCount; i++) {
                executor.submit(() -> sleep(100));
            }
        }

        System.out.println("소요 시간: 약 " + (System.currentTimeMillis() - start) + "ms\n"); //5058ms

/**********************************************************************************************/
        /*
         플랫폼 스레드: OS운영체제 스레드와 1:1 로 묶이는 무거운 스레드
         가상 스레드: 아주 가벼운 스레드 힙영역에 작은 객체형태로 만들어짐.
        *
        * */
        // 작업 갯수
        System.out.println("=== 가장 스레드 풀(200명)로 " + taskCount + "개 처리 ===");

        // 시작시간
        start = System.currentTimeMillis();


        //newVirtualThreadPerTaskExecutor 가장 스레드풀 생성
        try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {

            // 작업ㅈ 진행
            for (int i = 0; i < taskCount; i++) {
                executor.submit(() -> sleep(100));
            }
        }

        System.out.println("소요 시간: 약 " + (System.currentTimeMillis() - start) + "ms\n"); // 215ms

        // 5058ms - 215ms
        // 가상스레드가 동작하기 위해서는 (소수의)OS 스레드 위에서 동작해야 한다. 위에서 동작함.
        // sleep(), 네트워크 대기같으 기다리는 작업을 만나면, OS 스레드 웨에서 동작하다가 내려온다. (unmonut)
        // OS 스레드가 할 작업이 비어있게 되므로, 기다리는 동안 다른작업을 할 가사 스레드를 실행시킬 수 있다.
    }

    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
