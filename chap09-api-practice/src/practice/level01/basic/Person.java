package practice.level01.basic;

/* Q1. Object 클래스의 toString() 메소드를 오버라이딩하여 객체의 정보를 출력하세요.
 *
 * 복습 포인트:
 * - toString() 메소드 오버라이딩 목적을 이해하고 개발에 적용할 수 있다.
 *
 * 클래스명: Person
 * 필드: 이름(name, 문자열), 나이(age, 정수)
 *
 * Person 클래스의 toString() 메소드를 오버라이딩하여 이름과 나이를 출력
 *
 * Person 객체를 생성하고 toString() 메소드를 호출하여 결과를 출력
 *
 * 출력 예시:
 * 이름: 홍길동, 나이: 20
 * */

public class Person {

    // 필드
    String name = "홍길동";
    int age = 20;

    @Override
    public String toString() {
        return "이름: " + name + ", " + "나이: " + age;
    }
}


