package lecture.caculator;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

// 계산 매소드 만들어놓은 클래스
public class Calculator {

    //double로 리턴하고
    //double로 매개변수 두개를 받아서 더해주는 메소드
    //double: 소수점 있는 숫자(실수)를 담는 자료형
    public double add(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public double divide(double firstNumber, double secondNumber) {

        // 숫자는 0으로 나눌 수 없음
        // -> secondNumber가 0이라면
        // DIVIDE_BY_ZERO 하는 상수로 CalculatorException을 발생시키자!

        //DIVIDE_BY_ZERO정보
        // -code : CAL-00;
        // -message : "0으로 나눌 수 없습니다.


        //throw new ”예외 객체를 새로 만들어서 던진다";
        if (secondNumber == 0) {
            throw new CalculatorException(CalculatorErrorCode.DIVIDE_BY_ZERO);
        }
        return firstNumber / secondNumber;
    }
}
