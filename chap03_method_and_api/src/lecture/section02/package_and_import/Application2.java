package lecture.section02.package_and_import;

import lecture.section01.method.Calculator;

import static lecture.section01.method.Calculator.sum;
/*
* 패키지
*  - 서로 관련있는 클래스...을 모아 하나의 그룹으로 구성 함.*/
public class Application2 {

    public static void main() {
      int result =  sum(10, 10);

        System.out.println("result = " + result);

        // 다른 클래스의 메소드 사용하기
        // lecture.section01.method.Calculator calculato = new lecture.section01.method.Calculator();
        lecture.section01.method.Calculator calculato = new Calculator();


        int result2 = calculato.miuns(10, 10);
        System.out.println("result2 = " + result2);
    }
   
}
