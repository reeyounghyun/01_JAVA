package lecture.section01.polymorphism;

public class Application2 {

    public static void main(String[] args) {
        Animal animals = new Animal();
        animals[0] = new Rabbit();
        animals[1] = new Tiger();
        animals[2] = new Rabbit();
        animals[3] = new Tiger();
        animals[4] = new Rabbit();

    }



}
