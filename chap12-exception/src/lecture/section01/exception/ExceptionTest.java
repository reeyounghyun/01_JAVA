package lecture.section01.exception;

public class ExceptionTest {
    public void checkEnoughMoney(int price, int money) throws Exception {
        System.out.println("가지고 있는 돈은 = " + price + "원입니다.");

        if (money < price) {
            System.out.println("상품 구매가 가능합니다");
        } else {
            // 강제로 예외를 방생 시킬수 있다.
            // throw 예외 인스턴스
            throw new Exception(); // 예외 인스턴스
        }

        System.out.println("즐거운 쇼핑하세요");
    }
}
