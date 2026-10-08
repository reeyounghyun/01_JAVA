package lecture.section01.copy;

import java.lang.reflect.Array;
import java.util.Collections;

public class Appliaction2 {
    public static void main(String[] args) {


        /*배열의 복사 종류
         *
         * - 얕은 복사? : stack의 주소값만 복사
         * - 깊은 복사? : heap배열의 저장된 값을 새로운 주소값으로 복사 [0]
         *
         * */

        // 깊은 복사
        int[] originArr = new int[] {1, 2, 3, 4, 5};

        print(originArr);

        // clone() : Object, clone heap영역의 공간 자체를 복사해주고. 그리고 새로운 주소값 변환해준다.
        int[] copyArr = originArr.clone();
        print(copyArr);

        copyArr[0] = 99;
        System.out.println("-----------------------");
        print(originArr); // 원본
        print(copyArr); // 복사본

        int[] copyArr2 = new int[10];


        print(copyArr2);

        // .sort 배열을 정렬해주는 기능
       // Array.sort();
       // Array.sort(copyArr2); // 정렬할 대상
        print(copyArr2); // 결과확인

        // 내림차순
        // wrappingClass : 기본자료형
        Integer[] numbers = {5,3,2,4,1};
       // Arrays.sort(numbers, Collections.reverseOrder()); // 내림차순

        //System.out.println(Arrays.toString(numbers));

    }

    public static void print(int[] iarr) {

        System.out.println("iarr의 hashcode : " + iarr.hashCode());

        for(int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();
    }
}