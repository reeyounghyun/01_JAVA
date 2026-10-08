package lecture.section01.method;

public class Application6 {

    // static : 객체를 따로 만들지 않아도 메소드 자체를 사용 할 수 있다.
    public static void main(String[] args) {

        // static 메소드를호출하는 방법?, => 클래스명.메소드명()
        System.out.println(Application6.sum(5,6)); // 정석
        // System.out.println(sum(5,6)); // 줄인 버전
    }


    public static int sum(int x, int y) {


        return x + y;
    }

    public int miuns(int x, int y) {


        return x - y;
    }

} //클래스 영역
