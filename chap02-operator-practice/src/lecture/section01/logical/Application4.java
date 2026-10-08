package lecture.section01.logical;

public class Application4 {
    public static void main(String[] args) {
        
        /*
        * 삼항연산자?
        * [조건식]에 따라서 [true일때 사용할 값] : [false일때 사용할 값]
        * */
        
        int num = 10;
        //조건
        boolean result = num > 0;
        
        //num이 0보다 크면 양수다 라고 콘솔에 출력하고,
        //0또는 0보다 작으면 음수다 라고 콘솔에 출력
    
        String result2 = num > 0 ? "양수다" : "음수다";
        System.out.println("result2 = " + result2);

        String result3 = num > 0 ? "양수다" : (num == 0) ? "0이다" : "음수다";
        System.out.println("result3 = " + result3);

        /*
        * 정수에 따라 A,B,C 학점을 결정한다.
        * A 90점 이상
        * B 80점 이상
        * C 나머지 모두
        * */

        int score = 80; // B
        String grade; // A,B,C

    }
}
