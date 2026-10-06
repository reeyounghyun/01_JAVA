package practice.level02.normal;

public class Manager extends Employee {

    /* Q1. 다음 조건에 맞는 클래스 구조를 작성하고, 객체를 생성하여 메소드를 호출하세요.
     *
     * 복습 포인트:
     * - 상속의 개념을 이해하고 설명할 수 있다.
     * - 부모 클래스의 필드와 메소드를 자식 클래스에서 활용할 수 있다.
     *
     * 클래스명: Employee (부모 클래스)
     * 필드: 이름(name, 문자열), 연봉(salary, 정수)
     * 메소드: 정보 출력(printInfo) - 이름과 연봉을 출력
     *
     * 클래스명: Manager (자식 클래스)
     * 필드: 부서(department, 문자열)
     * 메소드: 정보 출력(printInfo) - 이름, 연봉, 부서를 출력 (메소드 오버라이딩)
     *
     * Employee 객체와 Manager 객체를 생성하고, 각각의 정보 출력 메소드를 호출하여 결과를 출력
     *
     * 출력 예시:
     * 이름: 김직원, 연봉: 5000
     * 이름: 박매니저, 연봉: 7000, 부서: 인사부
     * */

    private String department;

    public Manager(String name, int salary, String  department) {
        super(name,salary);
        this.department = department;
    }

    public void printInfo() {
        System.out.println("이름: " + getName() + ", 연봉: " + 7000 + ", 부서: " + "인사부");
    }


}