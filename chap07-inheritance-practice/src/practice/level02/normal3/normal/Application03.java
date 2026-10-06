package practice.level02.normal3.normal;

public class Application03 {

    public static void main(String[] args) {

        /* Q3. super() 를 통한 부모 생성자 호출을 직접 구현해 보세요.
         *
         *  복습 포인트:
         *  - super 와 super() 를 이해하고 사용할 수 있다.
         *  - 자식 클래스 생성자에서 부모 생성자를 호출하는 흐름을 이해할 수 있다.
         *
         *  요구사항:
         *   클래스명: Animal (부모 클래스)
         *    - 필드 : String name
         *    - 매개변수 있는 생성자: Animal(String name)
         *    - 메소드 : void printInfo()
         *
         *   클래스명: Dog (자식 클래스, Animal 을 상속)
         *    - 필드 : String breed
         *    - 매개변수 있는 생성자: Dog(String name, String breed) — super(name) 호출
         *    - 메소드 오버라이딩: printInfo()
         *
         *  메인 로직:
         *   - new Dog("바둑이", "진돗개") 를 만들고 printInfo() 호출
         *
         * -- 출력 예시 --
         * Animal 생성자 호출 - 바둑이
         * Dog 생성자 호출 - 진돗개
         * 이름: 바둑이, 품종: 진돗개
         * */

/*        Dog dog = new Dog("바둑이", "진돗개");
        dog.printInfo();*/


    }
}
