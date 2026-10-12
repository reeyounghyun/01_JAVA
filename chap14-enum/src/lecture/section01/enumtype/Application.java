package lecture.section01.enumtype;

public class Application {
    public static void main(String[] args) {

        //subjects 에서 정의한 것들만 올수 있음
        // 상수
        subjects subjects1 = subjects.JAVA;
        subjects subjects2 = subjects.MYSQL;
        subjects subjects3 = subjects.CSS;
        subjects subjects4 = subjects.JAVA;

        if (subjects1 == subjects2) {
            System.out.println("두 언어는 같은 과목입니다.");
        } else {
            System.out.println(" 두 언어는 다른 과목입니다.");
        }
        System.out.println("subjects1 == subjects4: " + (subjects1 == subjects4));

        //switch문에 enum 사용 가능하다
        // 상수 이름만 작성해도 된다.
        // switch() 매개변수에 따라 출력이 다르게 됨.
        switch (subjects3) {
            case JAVA:
            case MYSQL:
            case JDBC:
                System.out.println("백앤드입니다.");
                break;
            case CSS:
            case HTML:
            case JAVASCRIPT:
                System.out.println("프론트앤드입니다.");

        }
        printSubject(subjects3);
    }

    // 컴파일단계에서 잘못된 값을 막을 수 있음.
    public static void printSubject(subjects subjects) {
        System.out.println("선택한 과목: " + subjects.name());
    }
}
