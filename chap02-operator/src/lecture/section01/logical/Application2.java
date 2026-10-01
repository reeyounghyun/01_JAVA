package lecture.section01.logical;

public class Application2 {
    public static void main(String[] args) {
        
        // &&(and) ||(or) 의 우선순위? -> 논리 연산자 중에서는 && 연산이 ||보다 먼저 실행된다.
        boolean result1 = true || false && true; //true
        boolean result2 = (true || false) && false;  //무조건 false
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);


        // 아래의 alpha 변수에 담긴 값이 알파벳인지 판별하는 코드를 작성해보자.
        char alpha = '1';

        boolean answer = true;  // 결과값 알파벳이면 true 아니면 felse가 나와야한다.

        // boolean isUpperCase = (alpha >= 'a' && alpha <= 'z');
        boolean isUpperCase = alpha >= 'A' && alpha <= 90;
        boolean isLowerCase = alpha >= 'a' && alpha <= 122;

        answer = isUpperCase || isUpperCase;
        System.out.println("answer = " + answer);


    }
}
