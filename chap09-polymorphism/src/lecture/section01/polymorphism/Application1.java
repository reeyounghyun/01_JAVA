package lecture.section01.polymorphism;

public class Application1 {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.cry();
        Tiger tiger = new Tiger();
        tiger.cry();
        Rabbit rabbit = new Rabbit();
        rabbit.cry();

        /* 동적 바인딩
         * - 컴파일 당시에는 해당 타입의 메소드를 가리키다가
         * - 런타임 당시 실제 객체가 가진 오버라이딩된 메소드로 바인딩이 바뀌어 동작하는 것 */
        System.out.println("시작");
        Animal animal2 = new Animal();
        animal2.cry();                  // Animal의 cry()
        Animal animal3 = new Rabbit();
        animal3.cry();                  // 런타임에 Rabbit의 cry() 실행

        // 자식 객체는 부모 타입 레퍼런스에 저장할 수 있다. (반대는 불가)
        Animal a1 = new Tiger();
        Animal a2 = new Rabbit();

        // 레퍼런스 타입이 Animal이기 때문에, Rabbit과 Tiger가 가진 고유한 기능을 동작시키지 못한다.
        // a1.bite();
        // a2.jump();

        System.out.println("형변환");
        ((Tiger) a1).bite();
        ((Rabbit) a2).jump();

        // 타입 형변환을 잘못하는 경우 컴파일 시에는 문제가 되지 않는데, 런타임 시 Exception(예외)이 발생한다.
        // ((Rabbit) a1).jump();        // ClassCastException

        System.out.println("instanceof 연산자");
        System.out.println("a1이 Tiger 타입인지 확인 : " + (a1 instanceof Tiger));
        System.out.println("a1이 Animal 타입인지 확인 : " + (a1 instanceof Animal));
        System.out.println("a1이 Object 타입인지 확인 : " + (a1 instanceof Object));
        System.out.println("a1이 Rabbit 타입인지 확인 : " + (a1 instanceof Rabbit));

        if (a1 instanceof Tiger) {
            ((Tiger) a1).bite();
        }

        /* up-casting : 상위 타입으로 형변환할 때 작성하지 않아도 형변환이 가능하다.
         * down-casting : 하위 타입으로 형변환할 때 명시를 해주어야 한다.
         */
        Animal animal1 = new Rabbit();          // up-casting (자동)
        Rabbit rabbit1 = (Rabbit) animal1;      // down-casting (명시)
        rabbit1.jump();
    }
}