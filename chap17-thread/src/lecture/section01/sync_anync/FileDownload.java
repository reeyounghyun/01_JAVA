package lecture.section01.sync_anync;

public class FileDownload {

    // 동기 방식: 다운로드가 끝날때까지 멈춰서 기다림 (blocking)
    public static void downloadSync(String fileName, long downloadTimeMs) {

        System.out.println("  [" + Thread.currentThread().getName() + "] " + fileName + " 다운로드 시작");
        sleep(downloadTimeMs);
        System.out.println("  [" + Thread.currentThread().getName() + "] " + fileName + " 다운로드 완료");
    }

    // 비동기 방식 : 다운로드라는 작업을 새 스레드에게 맡기고, 스레드를 돌려준다. (non-blocking)
    // 호출하는 쪽에서는 기다리지 않고 작업가능하다.
    public static Thread downloadAsync(String fileName, long downloadTimeMs) {

        // 스레드 생성해서 작업 진행
        Thread downloadThread = new Thread(() -> {
            System.out.println("  [" + Thread.currentThread().getName() + "] " + fileName + " 다운로드 시작");
            sleep(downloadTimeMs);
            System.out.println("  [" + Thread.currentThread().getName() + "] " + fileName + " 다운로드 완료");
        }, "다운로드-" + fileName);

        downloadThread.start();

        return downloadThread;
    }

    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
