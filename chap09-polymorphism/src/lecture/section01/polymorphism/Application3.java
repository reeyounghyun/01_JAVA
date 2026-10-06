package lecture.section01.polymorphism;

public class Application3 {

    public static void main(String[] args) {

        Tiger tiger = new Tiger();
        Rabbit rabbit = new Rabbit();
        feed(tiger);
        feed(rabbit);

        getRandomAnimal().cry();
    }

    // 매개변수에 다형성 적용
    public static void feed(Animal animal) {

        animal.eat();
    }

    // 리턴타입에 다형성 적용
    public static Animal getRandomAnimal() {

        int random = (int) (Math.random() * 2); // 1 or 0

        return random == 0? new Rabbit(): new Tiger();
    }
}
