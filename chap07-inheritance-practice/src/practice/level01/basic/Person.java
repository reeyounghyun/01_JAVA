package practice.level01.basic;

public class Person {
    private String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void selfIntroduction() {
        System.out.println("이름: " + name + ", 나이: " + age);
    }

}
