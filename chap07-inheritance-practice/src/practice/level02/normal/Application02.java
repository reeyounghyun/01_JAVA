package practice.level02.normal;

import java.awt.*;

public class Application02 {

    public static void main(String[] args) {
        /* Q2. 다음 조건에 맞는 클래스 구조를 작성하고, 객체를 생성하여 메소드를 호출하세요.
         *
         * 복습 포인트:
         * - 상속의 개념을 이해하고 설명할 수 있다.
         * - 추상 클래스와 추상 메소드의 개념을 이해하고 적용할 수 있다.
         *
         * 클래스명: Shape (추상 클래스)
         * 추상 메소드: 면적 계산(calculateArea)
         *
         * 클래스명: Circle (자식 클래스)
         * 필드: 반지름(radius, 실수)
         * 메소드: 면적 계산(calculateArea) - 원의 면적을 계산하여 반환 (메소드 오버라이딩)
         *
         * 클래스명: Rectangle (자식 클래스)
         * 필드: 가로(width, 실수), 세로(height, 실수)
         * 메소드: 면적 계산(calculateArea) - 사각형의 면적을 계산하여 반환 (메소드 오버라이딩)
         *
         * Circle 객체와 Rectangle 객체를 생성하고, 각각의 면적 계산 메소드를 호출하여 결과를 출력
         *
         * 출력 예시:
         * 원의 면적: 78.54
         * 사각형의 면적: 200.0
         * */
        Shape circle = new Circle(5.0);
        System.out.println("원의 면적: " + circle.calculateArea());

        Shape rectangle = new Rectangle(10.0, 20.0);
        System.out.println("사각형의 면적: " + rectangle.calculateArea());

    }

}
