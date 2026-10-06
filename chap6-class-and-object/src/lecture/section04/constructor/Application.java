package lecture.section04.constructor;

public class Application {
    public static void main(String[] args) {


        //User(); 생성자 호출
        // 클래스명 변수 = new 생성자(); => 인스턴스 생성함
        // User user = new User(); // 기본 생성자가 없는상태


        /*User 클래스로 인스턴스틴스를 만들때
         원하는 필드들을 넣어야 하지만 인스턴스를 만들 수 있게 강제 할 수 있음

        * */
        User user2 = new User("user01", "pass01", "이영현");

        System.out.println("user2 = " + user2);
    }
}
