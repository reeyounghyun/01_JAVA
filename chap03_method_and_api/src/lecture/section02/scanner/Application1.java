package lecture.section02.scanner;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        // 스캐너를 사용하려면? 객체를 만들어줘야 한다.
        Scanner sc = new Scanner(System.in);
        // System.out.println();

        // 입력을 받을 수 잇음, 준비가 됨
        // nextline() : 입력받은 값을 문자열로 반환해줌

        //print : 줄바꿈이 되지않고 한줄로
        //println : 줄바꿈이 자동
        System.out.print("이름을 입력해주세요");
        String name = sc.nextLine();

        System.out.println("이름은" + name + "입니다.");

        // nextint() : 입력받은 값을 정수형으로 변환해줌
        System.out.print("나이를 입력해주세요");
        int age = sc.nextInt();
        System.out.println("나이는" + age + "입니다");


    }
}
