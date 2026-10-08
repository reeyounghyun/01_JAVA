package exercise;

public class Anser2 {
    public static void main(String[] args) {
        /*
         * 문제 2. 복합 대입 연산자와 후위 증가
         *
         * point 변수의 초기값은 1000이다.
         * 다음 계산을 복합 대입 연산자로 순서대로 처리한다.
         * 1. 500을 더한다.
         * 2. 200을 뺀다.
         * 3. 2를 곱한다.
         * 4. 4로 나눈다.
         *
         * 계산이 끝난 point를 후위 증가시키면서 beforeIncrease 변수에 대입한다.
         * 복합 대입 직후 값, 후위 증가식이 반환한 값, 증가가 끝난 현재 값을 출력한다.
         *
         * 실행 결과
         * 복합 대입 후 포인트 : 650
         * 후위 증가식이 반환한 값 : 650
         * 후위 증가 후 현재 포인트 : 651
         */

        //답안
        int num = 1000;
        System.out.println("num = " + num);

        // 500을 더한다
        // num = num +500;
        num +=500;
        System.out.println("num = " + num);

        // 200을 뺀다.
        num -=200 ;
        System.out.println("num = " + num);

        // 2를 곱한다.
        num *= 2;
        System.out.println("num = " + num);

        // 4로 나눈다
        num /= 4;
        System.out.println("num = " + num);

        System.out.println("복합 대입 후 포인트 = " + num);

        int  beforeAdd = num++;
        System.out.println("후위 증가식 반환한 값 = " + beforeAdd);
        System.out.println("beforeAdd = " + num);
    }
}
