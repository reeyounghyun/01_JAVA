package lecture.section02.looping;

//반복문
public class C_doWhile {
    static void sampleDoWhile() {
        /*
         * Do while문 표현방법
         *
         * 초기식:
         * do {
         *   반복시키고싶은 코드
         *   증가식
         * } while (조건식);
          * */
        //do 안에 있는 코드는 무조건 한번씩은 동작한다.

        do {
            System.out.println("최초 한번 동작함");
        } while (false);

        System.out.println("반복문 종료됨...");
    }
}
