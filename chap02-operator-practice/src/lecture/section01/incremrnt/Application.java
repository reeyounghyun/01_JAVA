package lecture.section01.incremrnt;

public class Application {
    public static void main(String[] args) {

        /*증감연산자
         - 변수의 값을 1 증가시키거나 1감소시키는 연산자
        * */
        int num = 20;
        System.out.println("num = " + num);

        // num++;
        num--;

        System.out.println("num = " + num);

        /*
        [공통] 계산 순서에 따라 결과 값이 달라짐
        * 전위 연산자(++num) : 값을 먼저 증가시키고 증가된 값
        * 후위 연산자 : 기존 값을 먼저 사용하고 변수의 값을 증가
        * */

        int firstNum = 20;
        int posrResult = firstNum++ * 3; //후위 연산자

        System.out.println("firstNum = " + firstNum);
        System.out.println("posrResult = " + posrResult);


        int lastNum = 20;
        int result = ++lastNum * 3; // 전위 연산자

        System.out.println("lastNum = " + lastNum);
        System.out.println("result = " + result);
    }
}
