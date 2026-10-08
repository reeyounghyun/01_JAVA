package lecturte.Section02.variable;

public class Application4 {

    public static void main(String[] args) {

        // 상수 : 변하지 않는값
        // 설정값, 프로그램에서 반복적으로 사용해야하는 기준 값
        int age = 10;
        System.out.println(age);

        age = 20;
        System.out.println(age);

        // final를 붙인 변수는 한번 초기화하면 값을 변경 할 수 없음.
        final int MAX_AGE = 10;
//        MAX_AGE = 20;

        System.out.println(MAX_AGE);
    }
}
