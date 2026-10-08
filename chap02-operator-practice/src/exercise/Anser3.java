package exercise;

public class Anser3 {
    public static void main(String[] args) {
        /*
         * 문제 3. 실수와 문자열 비교
         *
         * 1. 0.1 + 0.2의 결과를 double 변수 sum에 저장한다.
         * 2. sum의 값과 sum == 0.3의 결과를 출력한다.
         * 3. savedId에는 문자열 리터럴 "java"를 저장한다.
         * 4. inputId에는 new String("java")로 만든 문자열을 저장한다.
         * 5. 두 문자열을 ==와 equals()로 각각 비교하여 결과를 출력한다.
         *
         * 실행 결과
         * 0.1 + 0.2 : 0.30000000000000004
         * 0.3과 같은가? : false
         * == 비교 결과 : false
         * equals 비교 결과 : true
         */

        //답안
        double sum = 0.1 + 0.2;

        System.out.println("0.1+0.2 :" + sum);
        System.out.println("0.3과 같은가? : " + (sum == 0.3));


        String savedId = "java";
        String inputId = new String("java");
        System.out.println("== 비교 결과 : " + (savedId == inputId));
        System.out.println("equals 비교 결과 : " + savedId.equals(inputId));
    }
}
