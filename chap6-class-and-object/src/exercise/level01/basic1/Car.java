package exercise.level01.basic1;

public class Car {

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

        // 필드
        String model;
        int price;

        // 기본 생성자
        public Car() {
                model = "기본모델";
                price = 1000;
        }

        //매개변수 있는 생성자
        public Car(String model, int price) {
                this();
                this.model = model;
                this.price = price;
        }
}
