package lecture.lecture.section03.Wrapper;

public class Application2 {
    /* 기본타입을 문자열로 바꿔보자
     * valueOf : 인자로 받은 기본자료형의 값을 문자열로 바꾸어준다.
     *  valueOf : 인자로 받은 기본자료형의 값을 문자열로 바꾸어준다. (String 에 있는 정적메소드)
        toString : Wrapping Class에 있는 변환 메서드
      */

    public  static void main() {
        // 기본타입 -> 문자열
        // valueOf : 인자로 받은 기본자료형의 값을 문자열로 바꾸어준다.
        int num = 10;
        String strNum2 = String.valueOf(10); // 변환
        String decimal = Double.toString(3.14); // 변환

        String strNum = num + "";
      //  System.out.println("strNum = " + strNum);

    }

}
