package lecture.level03.hard;

import java.io.Serializable;

// Serializable: 이 객체는 파일에 저장해도 된다는 표시
public class Member implements Serializable {

    // 필드
    private String name;
    private int age;

    // 생성자: 받아온 값을 필드에 넣는다 (반환 타입 없음)
    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getter: 필드를 꺼내서 돌려준다
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // toString: 객체를 출력할 때 보여줄 문장을 돌려준다
    @Override
    public String toString() {
        return "Member{name=" + name + ", age=" + age + "}";
    }

}