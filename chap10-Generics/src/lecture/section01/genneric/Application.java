package lecture.section01.genneric;

public class Application {
    /*
    * 재네릭(genric)
    * - 데이터의 형식에 의존하지 않고 값이 여러 데이터 타입을 가질 수 있는 기술
    * - 데이터의 타입을 일반화 한다.
    * */
    public  static void main() {
        
        // 제네릭으로 전달할 타입은 참조형이어함.
        GenricTest<Integer> gt1 = new GenricTest<>(10);

        System.out.println("gt1.getValue() = " + gt1.getValue());
        System.out.println("gt1.getValue() = " + (gt1.getValue() instanceof Integer));

        GenricTest<String> gt2 = new GenricTest<>("테스트");
        System.out.println("gt2.getValue() = " + gt2.getValue());
        System.out.println("gt2.getValue() = " + (gt2.getValue() instanceof String));
    }
}
