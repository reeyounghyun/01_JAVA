package lecture.section01.conditional;

import java.util.Scanner;

public class B_if_elseif2 {
    public void testelseif() {
        //프로그램을 실행하는 도중에 사용자에게서 값을 받아야 할 때
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int num = sc.nextInt();

        // 조건: 짝수이면 ture 아니면 false
        if (num == 0)  {
            //조건 추가
            System.out.println("0입니다.");
        } else if((num %2) == 0) {
            System.out.println(("짝수입니다."));
        }else {
            System.out.println("홀수입니다.");
        }
        System.out.println("프로그램을 종료합니다");
    }
}
