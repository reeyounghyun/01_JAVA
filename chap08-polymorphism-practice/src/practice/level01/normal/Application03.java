package practice.level01.normal;

public class Application03 {

    public static void main(String[] args) {

        /* Q3. Q1 에서 만든 Employee/Manager/Developer 클래스를 그대로 활용해
         *  instanceof 연산자와 강제 형변환(다운캐스팅)을 사용하는 문제입니다.
         *
         *  복습 포인트:
         *  - instanceof 연산자의 사용 목적을 이해하고 활용할 수 있다.
         *  - 타입 형변환(다운캐스팅) 이 필요한 상황을 이해하고 적용할 수 있다.
         *
         *  조건:
         *   - Employee 타입의 배열을 만들고 [Manager, Developer, Employee] 순으로 담는다.
         *   - 배열을 순회하면서 다음을 수행한다.
         *      ① 모든 요소에 대해 printInfo() 호출
         *      ② instanceof 로 Manager 인 경우 다운캐스팅하여 부서(department)를 추가 출력
         *      ③ instanceof 로 Developer 인 경우 다운캐스팅하여 언어(language)를 추가 출력
         *      ④ Employee 자체인 경우 "(일반 직원)" 을 추가 출력
         *
         * -- 출력 예시 --
         * 이름: 박매니저, 연봉: 7000, 부서: 인사부
         *  → 매니저의 부서는 인사부 입니다.
         * 이름: 이개발자, 연봉: 6000, 언어: Java
         *  → 개발자의 언어는 Java 입니다.
         * 이름: 김직원, 연봉: 5000
         *  → (일반 직원)
         * */

        Employee[] employees = {
                new Manager("박매니저", 7000, "인사부"),
                new Developer("이개발자", 6000, "Java"),
                new Employee("김직원", 5000)
        };

        for (Employee emp : employees) {
            emp.printInfo();

            if (emp instanceof Manager) {
                Manager m = (Manager) emp;
                System.out.println(" → 매니저의 부서는 " + m.getDepartment() + " 입니다.");
            } else if (emp instanceof Developer) {
                Developer d = (Developer) emp;
                System.out.println(" → 개발자의 언어는 " + d.getLanguage() + " 입니다.");
            } else {
                System.out.println(" → (일반 직원)");
            }
        }
        
    }
}
