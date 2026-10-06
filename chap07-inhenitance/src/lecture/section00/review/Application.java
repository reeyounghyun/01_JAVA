package lecture.section00.review;

public class Application {

    /*
    * static : jvm에 클래스로드가 일어날때 static  영역에 같이 등록된다.
    * static는 객체를 만들지않아도 동작했었음/*/
    public static void main() {

    /* // 객체
        Person person = new Person();
        //기본 생성자는 다른생성자가 없을떄 컴파일러가 자동생성해줌.

        person.introduce(); // 메소드를 사용하기 위해 만듬
        */

        Person person = new Person("영현", 23);  // 생성자 값이 있을 때
        person.introduce();

        // 생성자 값이 없을 떄 null
        Person person2 = new Person();
        person2.introduce();


        // 오버로딩
       // 하나의 클래스 파일에서 같은 이름의 메소드 생성자를 매개변수만 다르게


        // person에서 필드 name을 private로 되어있어 사용할수없고, public 으로 해야 사용가능함
        // System.out.println(person.name);


        // 상속
        person.toString();
    }
}
