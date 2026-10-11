package exercise.level01.basic1;

public class Application {
    static void main() {
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

        Car car = new Car("스포츠카", 2000);
        System.out.println("모델명:" + car.model);
        System.out.println("가격: " + car.price);
    }


}
