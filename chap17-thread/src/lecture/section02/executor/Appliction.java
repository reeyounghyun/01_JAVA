package lecture.section02.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.lang.Thread.sleep;

public class Appliction {
    public static void main(String[] args) throws Exception {
        /*
         * 스레풀 Thread Pool
         *
         * 스레드를 미리 정해진 수만큼 만들어 두고 재사용한다.
         * 작업들을 대기열(큐)에 쌓고, 일을 안하고 있는 스레드가 하나씩 처리한다.
         * */


        // 스레드를 3개 가지고 있는 Thread Pool
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // 반복문 출력해보자.
        System.out.println("=== 일감 5개 제출 (일꾼은 3명) ===");

        // 5번 반복
        for (int i = 1; i <= 5; i++) {

            int taskNo = i;

            executor.submit(() -> {
                System.out.println("[" + Thread.currentThread().getName() + "] " + taskNo + "번 일 처리");
                sleep(1000);
            });
        }

    }

    // 대기시간
    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}


