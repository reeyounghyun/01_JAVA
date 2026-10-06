package practice.level01.basic2.basic;

public class Animal {
    /* Q2. 다음 조건에 맞는 클래스 구조를 작성하고, 객체를 생성하여 메소드를 호출하세요.
     *
     * 복습 포인트:
     * - 상속의 개념을 이해하고 설명할 수 있다.
     * - 메소드 오버라이딩의 개념을 이해하고 적용할 수 있다.
     *
     * 클래스명: Animal (부모 클래스)
     * 메소드: 소리내기(makeSound) - "동물이 소리를 낸다." 출력
     *
     * 클래스명: Dog (자식 클래스)
     * 메소드: 소리내기(makeSound) - "강아지가 짖는다." 출력 (메소드 오버라이딩)
     *
     * Animal 객체와 Dog 객체를 생성하고, 각각의 소리내기 메소드를 호출하여 결과를 출력
     *
     * 출력 예시:
     * 동물이 소리를 낸다.
     * 강아지가 짖는다.
     * */

   public void makeSound() {
       System.out.println("동물이 소리를 낸다");
   }


}
