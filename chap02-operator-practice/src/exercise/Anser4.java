package exercise;

public class Anser4 {
    public static void main(String[] args) {
        /*
         * 문제 4. 논리 연산자와 단락 평가
         *
         * age는 20, hasTicket은 true로 선언한다.
         * age가 19 이상이면서 티켓이 있는지 검사하여 canEnter에 저장한다.
         * age가 7 이하이거나 65 이상인지 검사하여 hasFreeAdmission에 저장한다.
         *
         * numerator는 10, denominator는 0으로 선언한다.
         * denominator가 0이 아니면서 나눗셈 결과가 2보다 큰지 검사한다.
         * 단락 평가를 이용하여 0으로 나누는 연산이 실행되지 않도록 작성한다.
         *
         * 실행 결과
         * 입장 가능 여부 : true
         * 무료입장 여부 : false
         * 안전한 나눗셈 조건 결과 : false
         */

        //답안
        int age = 20;
        boolean hasTicket = true;

        boolean canEnter = (age >= 19) && hasTicket;
        boolean hasFreeAdmission = (age <= 7) || (age >= 65);

        System.out.println("입장 가능 여부 : " + canEnter);
        System.out.println("무료입장 여부 : " + hasFreeAdmission);

        int numerator = 10;
        int denominator = 0;

        boolean result = (denominator != 0) && (numerator / denominator > 2);
        System.out.println("안전한 나눗셈 조건 결과 : " + result);
    }
}
