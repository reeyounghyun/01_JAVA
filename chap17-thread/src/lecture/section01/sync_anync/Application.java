package lecture.section01.sync_anync;

import static java.lang.String.join;

public class Application {

    // I/0 대기 (기다리는 시간)이 있는 다운로드같은 작업에서는 스레드를 늘리면(비동기로 처리하면) 효율이 좋다.
    // 내 켬퓨터에서 작업이 많이 할 때(연산작업) -> CPU 코어 수가 정해져 있어서 스레드를 많이 들려도 빨라지지 않는다.

    public static void main(String[] args)  throws InterruptedException{
        System.out.println("동기방식 =====");

        // 시작시간을 측정해보자
        long syncStartTime = System.currentTimeMillis(); // 현제시간을 밀리초로 반환해줌
        //System.out.println("현제시간을 밀리초로 반환: " + syncStartTime);

        FileDownload.downloadSync("문서.pfd", 2000);
        FileDownload.downloadSync("사진 jpg", 1500);
        FileDownload.downloadSync("영상.mo4", 4000);

        long syncEnd = System.currentTimeMillis(); // 현제시간을 밀리초로 반환해줌
        //System.out.println(syncEnd);


        long syncTotal = syncEnd - syncStartTime;
        System.out.println("동기 총 소요시간: " + syncTotal);

        /*****************************************************************************/

        System.out.println("==== 비동기방식");

        // 시작시간을 측정
        long asyncStart  = System.currentTimeMillis(); // 현재시간을 밀리초로 반환

        Thread t1 = FileDownload.downloadAsync("문서.pdf", 2000);
        Thread t2 = FileDownload.downloadAsync("사진.jpg", 1500);
        Thread t3 = FileDownload.downloadAsync("영상.mp4", 4000);

        // 대기해!
        // join() 스레드가 끝날때까지 main 스레드를 대기시키는 메소드
          t1.join();
          t2.join();
          t3.join();

        long asyncEnd  = System.currentTimeMillis(); // 현재시간을 밀리초로 반환

        long asyncTotal = asyncEnd - asyncStart;
        System.out.println("비동기 총 소요시간 = " + asyncTotal);

    }

}
