package lecture.section2.extend.run;

import lecture.section2.extend.*;

public class Application1 {
    /* extends 키워드를 사용하면 특정 타입만 사용하도록 재한 할 수 있음*/
    public static void main() {


        // extends Rabbit으로 설정했을때
        // RabbitFarm<String> farm1 = new RabbitFarm<>();
        // RabbitFarm<Animal> farm2 = new RabbitFarm<>();
        // RabbitFarm<Mammal> farm3 = new RabbitFarm<>();

        RabbitFarm<Rabbit> farm1 = new RabbitFarm<>();
        RabbitFarm<Bunny> farm2 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm3 = new RabbitFarm<>();

    }
}
