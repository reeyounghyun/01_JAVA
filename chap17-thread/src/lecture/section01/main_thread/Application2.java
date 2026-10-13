package lecture.section01.main_thread;

public class Application2 {
    public static void main(String[] args) throws InterruptedException {

        PrintingTask myTask = new PrintingTask("빨래", 3);


        //myTask 쓰레드의 할일
        Thread worker = new Thread(myTask, "일꾼-1");

        worker.run();
        // main 스레드가 run을 실행
        /*출력 결과
        * 빨래을 [main]이1회차 수행함.
          빨래을 [main]이2회차 수행함.
          빨래을 [main]이3회차 수행함.
            * */

        worker.start();
        // 새 스레드를 만들어서 해당 스레드에게 run을 실행하라
        /*출력 결과
        빨래을 [일꾼-1]이1회차 수행함.
        빨래을 [일꾼-1]이2회차 수행함.
        빨래을 [일꾼-1]이3회차 수행함.
        * */

        for (int i = 1; i <= 5; i++) {
            System.out.println(
                    "설거지를 "
                    + "[" + Thread.currentThread().getName() + "]"
                    + i + "번 작업처리"
            );
            Thread.sleep(1000);
            /*출력 결과
            *   빨래작업이 생성됨(3회짜리
                빨래을 [main]이1회차 수행함.
                빨래을 [main]이2회차 수행함.
                빨래을 [main]이3회차 수행함.
                빨래을 [일꾼-1]이1회차 수행함.
                설거지를 [main]1번 작업처리
                빨래을 [일꾼-1]이2회차 수행함.
                설거지를 [main]2번 작업처리
                빨래을 [일꾼-1]이3회차 수행함.
                설거지를 [main]3번 작업처리
                설거지를 [main]4번 작업처리
                설거지를 [main]5번 작업처리
                *
                *
                * 이유: 두 가지 스레드(main, 일꾼-1) 동시에 작업을 한다.
                * */
        }
    }
}