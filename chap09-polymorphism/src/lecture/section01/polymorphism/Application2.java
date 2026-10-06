package lecture.section01.polymorphism;

public class Application2 {

    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = new Rabbit();
        animals[1] = new Tiger();
        animals[2] = new Rabbit();
        animals[3] = new Tiger();
        animals[4] = new Rabbit();

        for(int i = 0; i < animals.length; i++) {
            animals[i].cry();
        }
//        Rabbit rabbit = new Rabbit();
//        Tiger tiger = new Tiger();
//        Rabbit rabbit1 = new Rabbit();
//        Tiger tiger1 = new Tiger();
//        Rabbit rabbit2 = new Rabbit();
//
//        rabbit.cry();
//        tiger.cry();
//        rabbit1.cry();
//        tiger1.cry();
//        rabbit2.cry();

    }



}
