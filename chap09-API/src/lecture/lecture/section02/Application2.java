package lecture.lecture.section02;

public class Application2 {

    /*
 String Pool
  - Heep 메모리 영역중에 특수한 공간
  - 리터럴 형태로 생성된 문자열을 관리
  - 동일한 문자열이 존재할 때 같은 인스턴스를 재사용해 메모리 사용을 최적화 해줌
* */
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Java";

        System.out.println("str1 == str2" + (str1 == str2)); // 주소값 비교

        // str1.equals(str2)가 같은 주소를 참조하고 있다.
        System.out.println("str1.equals(str2) :" + (str1.equals(str2))); // 값 비교

        // 따로 공간(문자)을 만들고 싶을 때 사용
        String str3 = new String("Java");

        System.out.println("str1 == str3" + (str1 == str3)); // 주소값 비교

        // 문자의 값자체를 비교하려면 equals를 사용한다 : String 클래스의 String는 문자열 값을 비교하도록 오버라이딩 되어있다.
        // -> 문자열이 같은 문자열인지 확인하기 위해서는 == 연산자 대신 equals 매소드를 사용해야 한다.

    }
}
