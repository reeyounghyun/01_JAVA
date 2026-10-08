package exercise;

public class Application01 {
    public static void main(String[] args) {
        /*
         * 문제 2. 자기소개 정보 저장
         *
         * 다음 정보를 저장할 수 있는 적절한 자료형의 변수를 선언하고 값을 대입한다.
         * - 이름: 홍길동
         * - 나이: 20
         * - 키: 175.5
         * - 학점: A
         * - 재학 여부: true
         *
         * 실행 결과
         * 이름 : 홍길동
         * 나이 : 20세
         * 키 : 175.5cm
         * 학점 : A
         * 재학 여부 : true
         */

       //답안
        String name = "홍길동";
        int age = 20;
        double useKey = 17.5;
        char grade = 'A';
        boolean isEnrolled = true;

        System.out.println("이름 = " + name);
        System.out.println("나이 =" + age + "세");
        System.out.println("키 = " + useKey + "cm") ;
        System.out.println("학점 =" + grade );
        System.out.println("재학 여부 =" + isEnrolled);

    }
}
