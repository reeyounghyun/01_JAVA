package practice.level01.basic;

public class Student extends Person{
    private int studentId;


    public Student( String name,int age, int studentId) {

        super(name, age); // 부모꺼 생성자 호출
        this.studentId = studentId; // 본인꺼
    }

    public void study() {
        System.out.println("공부 중");
    }
}
