package lecture.section01.intro;

// 람다식을 사용하기 위한 함수형 인터페이지라고 알려줌 FunctionalInterface
@FunctionalInterface
public interface Calculator {

    // 추상메서드
    // 람다식을 사용하기 위해서는 인터페이스 내부(public interface Calculator) 에
    // 하나의 추상메소드(public int sunTwoNumbers(int a, int b);)만 있어야 한다.
    // 두개 이상될때는 미아가 되버림..

    // 반환형: int / 매개변수; int a, int b 만 기능적으로 영향을 줌
    public int sunTwoNumbers(int a, int b);

   // public void printNumber(int a);



    // 클레스가 있어야 메소드를 만들수 있다.

}
