package lecture.section2.extend;

public class WildCardFarm {

    // RabbitFarm의 재네릭 타입이 뭐든 매개변수로 받겠다.
    // Rabbit을 부모로 가진 클래스는 전부 매개변수로 올수있다.
    public void anyType(RabbitFarm<?> farm) {
        farm.getAnimal().cry();
    }

    // Bunny이거나 Bunny를 부모로 가진 타입만 사용 가능
    public void extendType(RabbitFarm<? extends Bunny> farm) {
        farm.getAnimal().cry();
    }

    // Super이거나 Super를 부모로 가진 타입만 사용 가능
    public void SuperType(RabbitFarm<? super Bunny> farm) {
        farm.getAnimal().cry();
    }

    public void superType(RabbitFarm<Rabbit> rabbitRabbitFarm) {

    }
}
