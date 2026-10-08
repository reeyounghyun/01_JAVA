package lecture.section01.method;

public class Application2 {
    // 메인 메소드
    public static void main(String[] args) {
        System.out.println("main 메서드 실행됨...");

        //객체 생성 : 메소드를 호출하기 위함
        Application2 app1 = new Application2();

        // methodA 호출
        app1.methodA();

        //app1.methodB();
       // app1.methodC();


        System.out.println("main 메서드 종료됨...");

    }

    // 메소드A 작성해보기
    public void methodA(){
        System.out.println("methodA() 호출됨 ....");

        methodB(); // methodB 호출

        System.out.println("methodA() 종료됨 ....");
        return;
    }

    // 메소드B 작성해보기
    public void methodB(){
        System.out.println("methodB() 호출됨 ....");

        methodC(); // methodC 호출

        System.out.println("methodB() 종료됨 ....");
        return;
    }

    // 메소드C 작성해보기
    public void methodC(){
        System.out.println("methodC() 호출됨 ....");

        System.out.println("methodC() 종료됨 ....");
        return;
    }

} //클래스 영역
