package lecture.section01.method;

public class Application4 {

    /* 메소드의 return (반환)
    * return : 현재 메소드를 종료하고 호출한 구문으로 돌아가라는 명령어
    * */
    public static void main(String[] args) {
        Application4 app4 = new Application4();
        
        // app4.testMethod();
        
        String str = app4.sayHello();
        System.out.println("str = " + str);
    }

    public void testMethod(){
        System.out.println("테스트 동작확인 1");

        return;

        
        // 예외 발생, retuer은 메소드의 가장 마지막에 작성해야 한다.
        // System.out.println("테스트 동작확인 2");
    }
    
    // 문자열을 반환 String 이부분은 반환할 타임을 명시해야 한다 
    // void : 아무것도 반환하지 않을 때 (기본) /  String : 문자열 반환 .......
    public String sayHello() {
        
        String hello = "hello";
        
        return "hello";
    }

} //클래스 영역
