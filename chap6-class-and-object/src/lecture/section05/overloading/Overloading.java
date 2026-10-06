package lecture.section05.overloading;

public class Overloading {

    //매개변수의 종류별로 매소드 내용을 다르게 해야하는 경우
    //
    /*오버로딩의 조건
    * - 한 클래스내에서 동일한 이름을 가진 메소드의 매개변수 선언부에 타입, 갯수, 순서를 다르게 작성해야한다.
    *
    * 매소드 시그니처
    * - 매소드의 매소드 명과 매개변수 선언부를 의미
    *
    * */
    public void test() {}
    public void test(int num) {} // 오버로딩
    public void test(int num, String name) {} // 오버로딩

    static void main(String[] args) {
        // 구현된 오버로딩 예시
       // Arrays.sort();
    }
}
