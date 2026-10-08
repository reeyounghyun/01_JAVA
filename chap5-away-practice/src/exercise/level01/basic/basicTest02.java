package exercise.level01.basic;
import java.util.Scanner;

public class basicTest02 {
    public static void main(String[] args) {

        /* Q1. 다음 조건에 맞는 사용자 정의 자료형(클래스)을 작성하고, 인스턴스를 생성하여 필드를 출력하세요.
         *
         * 복습 포인트:
         * - 사용자 정의의 자료형을 이해할 수 있다.
         * - 클래스와 인스턴스의 차이를 이해하고 설명할 수 있다.
         *
         * 클래스명: Person
         * 필드: 이름(name, 문자열), 나이(age, 정수)
         *
         * 인스턴스 생성: 이름은 "홍길동", 나이는 20으로 설정
         *
         * 출력 예시:
         * 이름: 홍길동
         * 나이: 20
         * */

        class Person{
            String name;
            int age;
            char gender;
        }

        Person person = new Person();  // 인스턴스 생성

        //인스턴스 값
        person.name = "홍길동";
        person.age = 20;
        person.gender = '남';

        System.out.println("이름:" + person.name);
        System.out.println("나이:" + person.age);
        System.out.println("성별:" + person.gender);


        /* Q2. 다음 조건에 맞는 클래스를 작성하고, 인스턴스를 생성하여 필드를 출력하세요.
         *
         * 복습 포인트:
         * - 생성자에 대해 이해할 수 있다.
         * - this.과 this()를 이해할 수 있다.
         *
         * 클래스명: Car
         * 필드: 모델명(model, 문자열), 가격(price, 정수)
         *
         * 기본 생성자에서 모델명은 "기본 모델", 가격은 1000으로 설정
         * 매개변수 있는 생성자에서 this()를 사용하여 기본 생성자를 호출하고 모델명과 가격을 설정
         *
         * 인스턴스 생성: 모델명은 "스포츠카", 가격은 2000으로 설정
         *
         * 출력 예시:
         * 모델명: 스포츠카
         * 가격: 2000
         * */

        class Car {
            String model;
            int price;

            Car() {
                model = "기본모델";
                price = 1000;
            }

            Car(String model, int price)  {
                this();
                this.model = model;
                this.price = price;
            }
        }

        Car car = new Car("스포츠카", 2500);

        System.out.println("모델명:" + car.model);
        System.out.println("가격: " + car.price);
    }
}
