package practice.level02.normal;

import java.util.List;

public class NumberBox {
    /* Q2. 와일드카드를 사용하여 제네릭 클래스의 인자의 타입 범위를 제한하세요.
     *
     * 복습 포인트:
     * - 와일드카드를 이용하여 인자의 타입 범위를 제한할 수 있다.
     *
     * 클래스명: NumberBox
     * 필드: 숫자 리스트(numbers, List<? extends Number>)
     * 메소드: 숫자 추가(addNumber), 숫자 반환(getNumbers)
     *
     * NumberBox 타입의 인스턴스를 생성하고, 데이터를 추가한 후 숫자 리스트를 출력
     *
     * 출력 예시:
     * 숫자 리스트: [10, 20, 30.5, 40.7]
     * */

    private List<? extends Number> numbers; ;

    public void addNumber(List<? extends Number> numbers) {
        this.numbers = numbers;
    }
    public List<? extends Number> getNumbers() {
        return numbers;
    }

}
