package lecture.section02.grammar;

public class Application {
    public static void main(String[] args) {

        // UserRole1 class에 있는 모든 상수가 생성자의 선언 순서대로 한번씩 호출된다.
        UserRole1 admin = UserRole1.ADMIN;

        System.out.println("enum 상수 :" + admin);
        System.out.println("enum 상수 :" + admin.name());
        System.out.println("enum 상수 :" + admin.getNameTolowerCase()); // 소문자 출력

        // values() 모든 상수를 순서대로 담은 배열을 변환
        for (UserRole1 role : UserRole1.values()) {
            //UserRole1 모든 값을 순서대로 출력할 수 있다.
            System.out.println(role.name());
        }

        // enum은 상수별 데이터를 저장하는 필드와 생성자, 매서드를 가질 수 있다.
        for (UserRole2 role : UserRole2.values()) {
            // UserRole2 class 에서 필드 추가한 값 호출
            System.out.println(role.name() + " - " + role.getDescription());
        }
    }
}
