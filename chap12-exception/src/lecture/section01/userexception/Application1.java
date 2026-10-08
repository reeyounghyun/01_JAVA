package lecture.section01.userexception;

import lecture.section01.userexception.exception.MoneyNegativeException;
import lecture.section01.userexception.exception.NegetiveException;
import lecture.section01.userexception.exception.NotEnoughMoneyException;
import lecture.section01.userexception.exception.PriceNegativeException;

public class Application1 {
    static void main(String[] args) {
        ExceptionTest et = new ExceptionTest(); // 객체

        try {
            et.checkEnoughMoney(1000, 100);

            /*Catch 예외 상황별로 작성 할 수 있다.
            - 더 상세한 예외를 상단에 작성해주어야 한다 (동작 순서 중요)
            *
            * */
        } catch (PriceNegativeException e) {
            System.out.println("(Application1) PriceNegative Exception 발생 !!");
            System.out.println(e.getMessage());

        } catch (MoneyNegativeException e) {
            System.out.println("(Application1) MoneyNegative Exception 발생 !!");
            System.out.println(e.getMessage());

        } catch (NegetiveException e) {
            System.out.println("(Application1) Negative Exception 발생 !!");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("(Application1) NotEnoughMoneyException 발생 !!");
            System.out.println(e.getMessage());
        } finally {
            // 예외와 상관없이 동작할 내용
            System.out.println("finally 블럭의 내용이 동작함!");
            //System.out.println("돈이 부족합니다");
        }

        System.out.println("프로그램을 종료합니다.");
    }
}
