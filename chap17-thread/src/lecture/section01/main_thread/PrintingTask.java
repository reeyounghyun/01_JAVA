package lecture.section01.main_thread;

public class PrintingTask implements Runnable {

    private final String taskName;
    private final int count;

    // 객체를 만들고 필드에 꼭 초기화를 해야한다.
    // -> final 키워드에 의해 메모리에 올라갈때 변경할 수 없어서
    public PrintingTask(String taskName, int count) {
        this.taskName = taskName;
        this.count = count;
        System.out.println(taskName + "작업이 생성됨(" + count + "회짜리");
    }

    // 스레드가 수행할 일
    @Override
    public void run() {
        for (int i = 1; i <= count; i++) {

            System.out.println(
                    taskName
                            + "을 [" + Thread.currentThread().getName()
                            + "]이" + i + "회차 수행함."
            );

            try {
                Thread.sleep(1000); // 일하는데 걸리는 시간 (1000밀리초 : 1초)
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
