package practice.level01.basic;

public class Question1 {

    public static void main(String[] args) {
        /* Q1. 제네릭 클래스를 작성하고, 특정 타입으로 인스턴스를 생성하여 데이터를 추가하고 출력하세요.
         *
         * 복습 포인트:
         * - 제네릭스가 무엇인지 이해하고 설명할 수 있다.
         * - 제네릭스 사용의 목적 혹은 장점에 대해 이해하고 설명할 수 있다.
         * - 제네릭스가 적용된 클래스에 타입변수를 지정하여 인스턴스를 생성할 수 있다.
         *
         * 클래스명: Box
         * 필드: 데이터(data, 제네릭 타입)
         * 메소드: 데이터 추가(setData), 데이터 반환(getData)
         *
         * Box<String>과 Box<Integer> 타입의 인스턴스를 생성하고, 데이터를 추가하고 출력
         *
         * 출력 예시:
         * 문자열 데이터: Hello, Generics!
         * 정수 데이터: 123
         * */


        //인스턴스 생성하기
        Box<String> strigBox = new Box<>();
        strigBox.setData("Hello, Generics!");

        System.out.println("문자열 데이터 = " + strigBox.getData());

        Box<Integer> integerBox = new Box<>();
        integerBox.setData(123);
        System.out.println("정수 데이터: " + integerBox.getData());

       // System.out.println("gt = " + gt);

    }

}
