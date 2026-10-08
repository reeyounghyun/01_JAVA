package lecture.section04.constructor;

public class User {

    private String id;
    private String pwd;
    private String name;

    // 기본생성자
    // - 다른 생성자가 없으면 컴파일러가 자동으로 생성해준다.

    // 1. 인스턴스 생성 시점에 수행할 명령이 있을때 사용한다.
    // 2. 매개변수에 전달받은값으로 인스턴스를 생성하고 싶을때
    public  User() {
        System.out.println("사용자의 기본생성자 호출됨...");
    }

    // 매개변수가 있는 생성자
    public User(String id, String pwd, String name) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                '}';
    }


    public String getId() {
        return id;
    }

    public String getPwd() {
        return pwd;
    }

    public String getName() {
        return name;
    }


    public void setId(String id) {
        this.id = id;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setName(String name) {
        this.name = name;
    }

}
