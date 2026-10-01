package lecture.section01.method;

public class Application5 {
    
    public static void main(String[] args) {
        
        Application5 app5 = new Application5();

        // 더하기
        int result = app5.plus(5, 7);
        System.out.println("result = " + result);
        System.out.println("result = " + app5.plus(5, 7));

        // 뺴기
        int result2 = app5.minus(10, 3);
        System.out.println("result2 = " + result2);

        // 곱하기
        int result3 = app5.multiply(10, 3);
        System.out.println("result3 = " + result3);

        // 나누기
        int divide4 = app5.divide(10, 3);
        System.out.println("divide4 = " + divide4);

    }
    
    // 두 수를 받아 더하는 메소드
    public int plus(int x, int y) {
        return x + y;
    }

    // 두 수를 받아 빼는 메소드
    public int minus(int x, int y) {
        return x - y;
    }
    // 두 수를 받아 곱하는 메소드
    public int multiply(int x, int y) {
        return x * y;
    }

    // 두 수를 받아 나누는  메소드
    public int divide(int x, int y) {
        return x / y;
    }


} //클래스 영역
