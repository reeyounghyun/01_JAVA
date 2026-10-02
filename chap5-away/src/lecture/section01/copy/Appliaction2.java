package lecture.section01.copy;

public class Appliaction1 {
    public static void main(String[] args) {
        int age = 10;
        int age2 = age; // 값을 복사

        /*배열의 복사 종류
        *
        * - 얕은 복사? : stack의 주소값만 복사
        * - 깊은 복사? : heap배열의 저장된 값을 새로운 주소값으로 복사
        *
        * */

        int[] orginArr = {1, 2, 3, 4, 5}; // 원본배열

        int[] copyArr = orginArr; // 얕은복사

        System.out.println(orginArr.hashCode());
        System.out.println(copyArr.hashCode());

        copyArr[0] = 99; //복사본 수정
        System.out.println("orginArr[0] = " + orginArr[0]);
        System.out.println("copyArr[0] = " + copyArr[0]);
    }
}
