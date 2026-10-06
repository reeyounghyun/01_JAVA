package lecture.section02.abstractclass;

public class Application {
    /*
     * 추상클래스
     * - 추상메소드를 0개 이상 포함하는 클래스
     * 사용하려면?
     * - 추상클래스를 상속받은 클래스를 만들고, 추상메소드를
     *   구현해야지만 사용이 가능하다
     *
     * 추상메소드
     * - 메소드의 선언부만 있고, 구현부{}가 없는 메소드
     */

    public static void main(String[] args) {
        // 추상 클래스 자체만으로는 인스턴스 생성이 불가하며 상속받을 클래스가 있어야 한다.
        // Product product = new Product();

        // 상속받은 클래스로 객체를 만들면, 추상클래스는 타입으로 사용이 가능하다.
        Product smartPhone = new SmartPhone();
    }
}