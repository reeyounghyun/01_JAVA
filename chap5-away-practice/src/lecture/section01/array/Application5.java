package lecture.section01.array;

public class Application5 {
    public static void main(String[] args) {
        /*
         *
         *
         *
         * */
        // 다차원 배열 변수: 2차원 이상의 배열을 의미함.
        int[][] iarr;


        //방법1
        iarr = new int[3][];

        // 열 형태
        iarr[0] = new int[5];
        iarr[1] = new int[5];
        iarr[2] = new int[5];

        //방법2
        int[][] iarr2 = new int[3][5];

        System.out.println(iarr2[0][4]);

    }
}

