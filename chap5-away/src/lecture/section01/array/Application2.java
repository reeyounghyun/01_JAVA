package lecture.section01.ayway;

public class Application2 {
    public static void main(String[] args) {
        /*
        * 배열의선언
        *
        *
        * */

        int[] iarr;  //작성 방법1
        char carn[]; // 작성 방법2

        // 배열을 할당하여 대입 할 수 있다.
        // new: heap영역에 공간을할당하고 주소값을 반환하는 키워드
        // 참조자료형: 만든 주소를 stack 영역에 저장하고, 그 주소를 참고하여 사용
        iarr = new int[10];
        carn = new char[5];

        //hashCode: heap영역에 생성된 데이터를 고유한 정수값으로 확인할때 사용
        //iarr 흰 영역은 참조연산자
        // .hasHcocde() 참조
        System.out.println("iarr = " + iarr);
        System.out.println("carn = " + carn);
        // System.out.println("carn = " + carn.hashCode()); // 주소값이 다르게 표시됨

        //배열의 길이도 구할수 있음
       System.out.println("iarr.length = " + iarr.length);

       // 배열 자체의 길이는 변경되지 않는다.
        iarr = new int[5];
        System.out.println("iarr.length = " + iarr.length);


    }
}
