package lecturte.Section02.variable;

public class Appilcation1 {
    public static void main(String[] args) {

        /*
        1. 코드의 의도가 분명해짐
        2. 한번 저장한 값은 재사용 가능
        * */
        //정수 int 사용
        int salary = 5000000; // 급여
        int bonus = 200000; // 보너스

        // System.out.println("[리터컬]보너스를 포함한 급여 : " + (5000000 + 200000));
        System.out.println("보너스를 포함한 급여 : " + (salary + bonus));
    }
}
