package lecturte.section04.typecastiong;

public class Appilcation1 {
    public static void main(String[] args) {
        /*
        자동형변환
        값의 범위를 넓히는 변환은 컴파일러가 자동으로 처리해줌.
        서로 다른 숫자형을 연산할때 -> 더 큰 자료형으로 변환
        * */

        byte bunm = 1; //  bunm 값은 1
        short snum = bunm;  // snum 값은  bunm= 1 즉 sunm 값은 1
        int inum = snum;
        System.out.println(inum);

        int num1 = 10;
        long num2 = 20;

        long result = (num1 + num2);
        System.out.println(result);

        //char -> int로 자동변환
        char ch1 = 'a';
        char chNumber = ch1;
        System.out.println(chNumber);
    }
}
