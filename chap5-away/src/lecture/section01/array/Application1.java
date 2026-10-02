package lecture.section01.ayway;

public class Application1 {
    public static void main(String[] args) {
        /*
        * 배열 : 동일한 자료형의 묶음
        *
        * */

        // 배열의 선언 및 할당
        // new int는 []에 숫자만큼 만들어줌
        int[] arr = new int[5];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // 하나의 이름으로 관리되는 "연속된" 메모리 공간이다.
        // 인텍스로 값을 찾아 올 수 있다.
        System.out.println("arr[0] :" +arr[0]);

        for(int i = 0; i < 5; i++) {
            System.out.println("arr["+i+"] :" +arr[i]);
        }

    }
}
