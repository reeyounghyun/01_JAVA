package lecture.section2.extend;

// T extends Rabbit : T의 최대범위가 Rabbit이라는 뜻
/*public class RabbitFarm<T extends Rabbit> {*/
public class RabbitFarm<T extends Rabbit> {
    // 필드
    private T animal;

    // 생성자
    public RabbitFarm() {
    }

    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    // Getter & Setter
    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
