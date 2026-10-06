package lecture.section03.interfaceimplements;

public interface InterProduct {
    /*
     * 인터페이스
     * - 상수필드와 추상메서드만 가질 수 있다.
     * */

    // 상수 : 대문자와 _로 단어를 구분하게끔 표기한다.
    // 선언과 동시에 초기화해야함.
    public static final int MAX_NUM = 100;

    // 인터페이스는 생성자를 가질 수 없음.
//    public InterProduct() {};

    // 일반메서드를 가질 수 없음.
//    public void basicMethod() {};

    public abstract void nonStaticMethod();

    /*
     * 인터페이스는 public abstract의 의미를 가지기 때문에
     * 생략해서 작성 할 수 있다.
     * (접근제어자 public 고정)
     * */
    void abstMethod();

    /* ========= */
    public static void staticMethod() {
        System.out.println("Interface는 Static 메소드를 가질 수 있다.");
    }

    public default void defaultMethod() {
        System.out.println("Interface는 default 메소드를 가질 수 있다.");
    }

}