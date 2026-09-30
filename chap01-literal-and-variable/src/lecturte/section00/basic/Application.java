/*
패키지 : 관련된 클래스를 묶어서 관리하는 단위
 - 패키지는 영문 소문자를 이용해서 작성해야 한다.
* */

// 패키지가 컴파일 될 위치 package lecturte.section00.basic;
package lecturte.section00.basic;

/*
클래스
 - JAVA 코드는 클래스 내부에 작성한다.
 - 클래스 이름 "Applicastion"은 영문 대문자로 시작하는 UpperCamelCase 이다.
 - 파일 명과 클래스 이름이 동일해야 한다.
 - 자동 단축어 psvm
* */
public class Application {

    // 메인 메서드
    // -자바 어플리케이션의 시작점
    // 흐름: .java 가 javac에서 .class로 변환해줌 .class는 바이크코드 jvm을 동작시키기 위한 과
    public static void main(String[] args) {
        System.out.println("자바 시작!");
    }
}
