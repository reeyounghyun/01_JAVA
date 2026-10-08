package lecture.section07.kindsofvariable;

public class KindsOfVariable {

    // 인스턴스변수 / 필드 / 멤버변수
    private int globalNum;

    // 정적변수 / 정적필드
    private static int staticNum;

    public void testMethod(int arg /*매개변수*/) {
        int localNum; // 지역변수 - 해당 블럭 내에서만 사용 가능
    }

    public void test() {
//        System.out.println(localNum);
        System.out.println(globalNum); // 전역변수는 다른 메서드에서 사용가능
        System.out.println(staticNum);
    }

    public static void main(String[] args) {
        // 정적변수가 아니면 객체가 만들어져야 사용이 가능
//        System.out.println(globalNum); // 전역변수는 다른 메서드에서 사용가능
        System.out.println(staticNum);
    }
}