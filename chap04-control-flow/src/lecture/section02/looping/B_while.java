package lecture.section02.looping;
import java.util.Scanner;


//반복문
public class B_while {
    /*
     * 초기식:
     *
     * while(조건식) {
     *   반복시키고 싶은 구운
     *
     * 증가식:
     *
     * }
     * */
    public void sampleWhile() {
        int i = 1; //초기식

        Scanner sc = new Scanner(System.in);

        //while (i <= 10 /*조건식*/) {
        while (true) {
            System.out.println("점수를 입력해주세요 : ");
            int num = sc.nextInt();

            // i++; // 증가식


            // == 같은 값인가?
            if (num == 5) {
                break;
            }

            System.out.println("5가 아닙니다.");
        }
    }

}
