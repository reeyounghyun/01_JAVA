package lecture.section01.comparison;

public class Application {
    public static void main(String[] args) {
    /*
    비교연산자
     - 두 값을 비교해서 boolean (같다 / 다르다) 값을 반환한다.
     -
    * */

        int num1 = 10;
        int num2 = 20;

        System.out.println("num2 ++ num2 : " + (num1 == num2));

        //num1 이 num2와 다른가? 다르면 ture , 같다면 false
        System.out.println("num1 != num2 : " + (num1 != num2));
        System.out.println("num1 != num2 : " + !(num1 != num2));

        // num1이 num2보다 큰가?
        System.out.println("num1 > num2 : " + !(num1 > num2));

        // num1이 num2보다 같거나 작은가?
        System.out.println("num1 < num2 : " + !(num1 < num2));
    }
}
