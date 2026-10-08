package lecture.section01.userexception;

import lecture.section01.userexception.exception.MoneyNegativeException;
import lecture.section01.userexception.exception.NotEnoughMoneyException;
import lecture.section01.userexception.exception.PriceNegativeException;

public class ExceptionTest {
    public void checkEnoughMoney(int price, int money) throws  Exception {

       // 상품 가격은 음수일 수 없다 - 예외
        if(money < 0 ) {
            throw new PriceNegativeException("class name PriceNegativeException = PriceNegativeException 발생");
        }
        // 내가 가진 돈이 음수일 수 없다 -> 예와2
        // MoneyNegativeException
        if(money < 0 ) {
            throw new MoneyNegativeException("class name MoneyNegativeException = PriceNegativeException 발생");
        }

        // price가 money보다 작은지? -> 예외2
        if(money < price ) {
            throw new NotEnoughMoneyException("돈이 부족합니다.");
        }

        // price가 money보다 작은지?
        // 가진돈이 더 적으면 NotEnoughMoneyException을 발생시킨다.
        // NotEnoughMoneyException 은 message에 "돈이 부족합니다"을 저장
        // main 메서드에서 catch문으로 NotEnoughMoneyException을 예외가 발생했다
    }
}

