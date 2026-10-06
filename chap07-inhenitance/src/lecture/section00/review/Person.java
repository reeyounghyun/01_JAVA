package lecture.section00.review;

/*클래스 : 객체를 만들기 위한 설계도 (참조자료형)
* 클래스를 만들기 위한 필요한 재료 : 필드/생성자/매서드
* 클래스의 이름과 파일명이 동일해야 함
*
*
*
* */
public class Person {

/*접근제어자 - 클래스, 클래스의 맴버(필드,메소드)
* 에 접근할수 있는 범위를 성정하기 위해 작성함
*
* 정급제어자 종류
* - public : 모든 패키지에서 접근이 가능함 @@
* - protected : 같은 패이지 또는 상속 관계의 클래스에서 접근이 가능함
* - default : 같은 패키지 안에서만 접근 가능함
* - private : 현재 클래스 안에서만 접근 가능함 @@

    캡슐화: 어디서든 접근이 가능하여, 원하는 형태로만 접근 가능하게 만들어야함
    * getter/  setter
 */




    /*필드 영역*/
    private String name;
    private int age;


    // 기본 생성자: 값이 없을 때 ( 객체를 만들때 호출되는 클별한 메소드)
    // 메소드명이 클래스명과 일치해야 한다.
    public Person() {
    }

    // 매개변수가 있는 생성자 / 생성자 값이 있을 때 사용
   /*생성자:초기화 값 생성 후  Application에 값을 넣기 위함 */
    public Person(String name, int age) {

        // this: -현재 만들어진 객치(인스턴스) 자기 자신을 가르킨다.
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*매서드 영역 : 객체가 할 수 있는 행동을 코드로 작성 한 것
    * void: 반환형 : 어느타입이든 반환을 한다면 작성해야며,
    * 없을 대 반환값이 없으때 c*/
    public void introduce() {
        System.out.println("안녕하세요 저는"  + name + "이고," +  age + "살 입니다.");
    }

    // Getter : 데이터를 읽는 용도
    public String getName() {
        return name;
    }

    // Setter : 데이터를 수정 용도
    public void setName(String name) {

        // 매소드이니까 전처리 가능함

        this.name = name;
    }


}
