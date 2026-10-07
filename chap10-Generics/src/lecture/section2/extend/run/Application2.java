package lecture.section2.extend.run;

import lecture.section2.extend.*;

public class Application2 {
    /* extends 키워드를 사용하면 특정 타입만 사용하도록 재한 할 수 있음*/
    public static void main() {

        /* 와일드 카드 [ ? ]
         * <?> : 제한없음
         * <? extends Type> : 와일드카드의 상한 재한 <TYPE과 TYPE의 후손으로만 사용가능)
         * <? super type> : 와일드카드의 하한 제한 (TYPE과 TYPE의 부모로만 사용 가능)
         *
         * */

        WildCardFarm wildCardFarm = new WildCardFarm();

        // anytype(RabbitFarm<?> farm)
        // 어떤 토끼든 생성이 가능함.
        Rabbit rabbit = new Rabbit();
        RabbitFarm rabbitFarm = new RabbitFarm(rabbit);
        wildCardFarm.anyType(rabbitFarm);
        wildCardFarm.anyType(new RabbitFarm<>(new Bunny()));
        wildCardFarm.anyType(new RabbitFarm<>(new DrunkenBunny()));

        // extendsType(RabbitFarm<? extends Bunny> farm)
        // Bunny 또는 Bunny의 자식으로 만든 토끼만 가능
        // wildCardFarm.extendType(new RabbitFarm<>(new Rabbit()));
        wildCardFarm.extendType(new RabbitFarm<>(new Bunny()));
        wildCardFarm.extendType(new RabbitFarm<>(new DrunkenBunny()));

        // superType(RabbitFarm<? super Bunny> farm)
        // Bunny 또는 Bunny의 부모 타입만 가능
        wildCardFarm.superType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.superType(new RabbitFarm<Bunny>(new Bunny()));
       //wildCardFarm.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));


    }
}
