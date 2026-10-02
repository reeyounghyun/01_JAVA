package lecture.section1.user_type;

import java.util.Arrays;

// 회원 클래스
public class Member {
    /*
    * id, pw, name, age, gender, hobby
    클래스 내의 변수이름 : 필드 또는 인스턴스변수 도는 속성 이라고 부를수 있음.
    */

    String id;
    String pwd;
    String name;
    int age;
    char gender;
    String[] hobby;

    // 주소가 출력되는게 아니라 필드들을 나열 해서 볼 수 있다.
    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", hobby=" + Arrays.toString(hobby) +
                '}';
    }
}
