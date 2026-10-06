package lecture.section02.abstractclass;

// 추상 클래스를 만들 때는 abstract 키워드를 붙여서 선언해줘야 한다.
public abstract class Product {
    // 추상 클래스는 필드를 가질 수 있다.
    private int nonStaticField;
    private static int staticField;

    public Product() {
    }

    // 일반 메소드도 가질 수 있다.
    public void nonStaticMethod() {
        System.out.println("Product의 nonStaticMethod 호출함...");
    }

    public static void staticMethod() {
        System.out.println("Product의 staticMethod 호출함...");
    }

    // 추상메서드
    public abstract void abstMethod();
}