package lecture.setion03.oveerriding;


// 부모 클래스
// 클래스에 final 키워드를 붙이면 상속을 제한한다.
public class SuperClass {


    /* 오버라이딩
     *
     * 성립 요건?
     * - 매소드의 이름이 동일해야 한다.
     * - 매소드의 리턴 타임이 동일해야 한다.
     * - 매개변수의 타입/갯수/순서가 동일해야 한다.
     * - 접근이 가능해야 오버라이딩이 가능하다. (접근제어자가 부모 매서드보다 같거나 더 넓어야한다.)
     * - Final 키워드가 사용된 매서드는 오버라이딩이 불가하다.
     * */

    public void method(int num) {
    }

    ; // 일반메소드

    private void privateMethod() {
    }

    ; // private 메소드

    public final void finalMethod() {
    }

    ; // final 메소드

    protected void protectedMethod() {
    }

    ; // protected 메소드
}
