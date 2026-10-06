package lecture.section02.encapsulation.problem2;

public class Application2 {
    public static void main(String[] args) {

        Monster monster1 = new Monster();

        monster1.name = "두치"; // privatre으로 선언되어 직접 접근을 할 수 없음.
        monster1.hp = 200;

        Monster monster2 = new Monster();

        monster2.name = "두치"; // privatre으로 선언되어 직접 접근을 할 수 없음.
        monster2.hp = 200;

        Monster monster3 = new Monster();

        monster3.name = "두치"; // privatre으로 선언되어 직접 접근을 할 수 없음.
        monster3.hp = 200;
    }
}
