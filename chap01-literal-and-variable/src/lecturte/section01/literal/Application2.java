package lecturte.section01.literal;

public class Application2 {
    public static void main(String[] args) {

        // 정수끼리의 연산
        // 정수끼리 연산하면 정수의 결과가 나온다!
        System.out.println(12+34);
        System.out.println(12-34);
        System.out.println(12*34); //곱셈
        System.out.println(12/34); // 나누 몫
        System.out.println(12%34); // 나머지

        // 실수가 포함된 연산
        System.out.println("=== 실수가 포함된 연산 ===");
        System.out.println(10 /4.0); // 실수의 결과가나옴
        System.out.println(0.1+ 0.2); // 0.3
        //부동소수점 : 10진소수를 2진소수로 표현할 수 없는 상황이 생김
        // 따라서 소수를 가장 가까운, 근사값으로 저장해서 계산하게 되여, 오차가 생길 수 있음

        // 문자 연산
        // ASCLL 아스크 코드 : 정의된 값이 있음
        System.out.println("=== 문자 연산 ===");
        System.out.println('a' + 'b');
        System.out.println('a' + '1');

        // 문자열 연산
        System.out.println("=== 문자열 연산 ===");
        System.out.println("hello" + "world");
        System.out.println("hello" + 100);
        System.out.println("123" + "100");
        System.out.println("123" + true);
        // System.out.println(false + true);  블리언 값은 연산이 안됨

    }
}
