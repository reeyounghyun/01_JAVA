package lecture.section02.looping;


//반복문
public class D_continue {
    public void SampleContinue() {
        for (int i = 0; i < 5; i++) {

            if (i == 3) {
               // break;
                continue;
                // continue; 반목문 내에서 사용된다.
                // 현제 회차의 반복만 한 뒤
                // 종료 후 다음으로 넘어감
            }
            System.out.println(i);
        }
        System.out.println("반목문 종료됨....");
    }
}
