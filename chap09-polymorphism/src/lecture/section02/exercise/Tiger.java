package lecture.section01.polymorphism;

public class Tiger extends Animal{

    // 이모지 윈도우키 + .
    @Override
    public void eat() {
        System.out.println("🐯호랑이가 풀을 뜯먹습니다..");
    }

    @Override
    public void run() {
        System.out.println("🐯호랑이가 달려갑니다..");
    }

    @Override
    public void cry() {
        System.out.println("🐯호랑이가 울음소리를 냅니다..");
    }

    public void bite() {
        System.out.println("🐯호랑이가 물어 뜯습니다..");
    }
}