package exercise.level01.basic;
import java.util.Scanner;

public class basicTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* Q1. 5개의 정수를 입력받아 배열에 저장한 후, 저장된 값을 순서대로 출력하세요.
         *
         * -- 입력 예시 --
         * 정수 5개를 입력하세요: 1 2 3 4 5
         *
         * -- 출력 예시 --
         * 저장된 값: 1 2 3 4 5




        System.out.print("정수 5개를 입력하세요 : ");

        int[] arr = new int[5];

        arr[0] = input.nextInt();
        arr[1] = input.nextInt();
        arr[2] = input.nextInt();
        arr[3] = input.nextInt();
        arr[4] = input.nextInt();

        System.out.println("저장된 값 : " + arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4]);
        // System.out.println("arr = " + arr);

    * */

        /* Q2. 5개의 정수를 입력받아 배열에 저장한 후, 저장된 값을 거꾸로 출력하세요.
         *
         * -- 입력 예시 --
         * 정수 5개를 입력하세요: 1 2 3 4 5
         *
         * -- 출력 예시 --
         * 저장된 값 (거꾸로): 5 4 3 2 1

        int[] arr = new int[5];

        System.out.println("점수 5개를 입력하세요");

        for(int i = 0; i < 5; i++) {
            arr[i] = input.nextInt();

            System.out.print(arr[i]+ "");
        }
        System.out.println("저장된 값 (거꾸루)");

        for(int i = 4; i < 5; i--) {
            arr[i] = input.nextInt();

            System.out.print(arr[i]+ "");
        }
        *  * */

        /* Q3. 배열을 "선언과 동시에 초기화" 하는 방식과 "선언만 하고 자동 기본값으로 두는" 방식을
         *  비교하는 문제입니다.
         *
         *  복습 포인트:
         *  - 배열을 선언하면서 동시에 초기화를 할 수 있다.
         *  - 배열에 저장되는 값의 형태별 기본값에 대해 이해할 수 있다.
         *
         *  조건:
         *   ① int[] nums = {10, 20, 30, 40, 50}; 형식으로 선언과 동시에 초기화한 뒤 모든 요소 출력
         *   ② int[] empty = new int[3]; 으로 길이 3 짜리 빈 배열을 만들어 모든 요소 출력 (자동 기본값 0)
         *   ③ String[] names = new String[3]; 로 길이 3 짜리 문자열 배열 만들어 모든 요소 출력 (기본값 null)
         *
         * -- 출력 예시 --
         * nums : 10 20 30 40 50
         * empty(int) : 0 0 0
         * names(String) : null null null
         * */

        int[] nums = {10, 20, 30, 40, 50};
        System.out.println("nums = "+ "{"+ nums[0]+ " "+nums[1]+ " "+nums[2]+ " "+nums[3]+ " "+nums[4]+"}");

        int[] empty = new int[3];
        //System.out.println(empty.length);
        System.out.println("enpyt(int)= "+ empty[0] + " " + empty[1] + " " + empty[2]);

        String[] names = new String[3];
        System.out.println("names(String)= "+ names[0] +names[1] +names[2]);


    }
}
