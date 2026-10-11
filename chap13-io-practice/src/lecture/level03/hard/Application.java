package lecture.level03.hard;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Application {

    public static void main(String[] args) {

        /* 안내. 이 레벨은 난이도가 있는 편입니다. 너무 어려우면 모범답안을 먼저 보고
         *      흐름을 파악한 뒤, 직접 다시 풀어보면 학습 효과가 더 좋습니다.
         * */

        /* Q1. 객체 단위로 입출력하는 보조 스트림(ObjectInputStream / ObjectOutputStream) 을 사용해
         *  사용자 정의 객체를 파일에 저장하고 다시 읽어오세요.
         *
         *  복습 포인트:
         *  - 객체 단위로 입출력하는 보조 스트림을 이해하고 파일에 입출력 할 수 있다.
         *
         *  요구사항:
         *   ① 직렬화 가능한 클래스 Member 를 만든다.
         *      - implements Serializable
         *      - 필드: String name, int age
         *      - 매개변수 있는 생성자, getter
         *      - toString() 오버라이드 — "Member{name=홍길동, age=20}" 형식
         *
         *   ② "member.dat" 파일에 Member("홍길동", 20) 인스턴스를
         *      ObjectOutputStream + FileOutputStream + BufferedOutputStream 으로 저장한다.
         *
         *   ③ 같은 파일을 ObjectInputStream + FileInputStream + BufferedInputStream 으로 읽어와
         *      readObject() 결과를 Member 로 형변환 후 toString() 결과를 출력한다.
         *
         *   단, IOException 과 ClassNotFoundException 을 적절히 처리하고,
         *       try-with-resources 를 사용해 스트림을 자동으로 닫는 것을 권장한다.
         *
         * 출력 예시:
         * member.dat 파일에 객체가 저장되었습니다.
         * 읽어온 객체 : Member{name=홍길동, age=20}
         * */
        // 1. 저장할 객체를 만든다
        Member member = new Member("홍길동", 20);

        // 2. 파일에 저장한다
        //    통로 세 개를 겹쳐서 만든다 (try 괄호 안에 만들면 자동으로 닫힌다)
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream("member.dat")))) {

            // 통로로 member 객체를 파일에 쓴다
            oos.writeObject(member);
            System.out.println("member.dat 파일에 객체가 저장되었습니다.");
        } catch (IOException e) {
            System.out.println("저장 중 오류가 발생했습니다.");
        }

        // 3. 파일에서 다시 읽어온다 (저장과 모양이 같고 방향만 반대)
        try (ObjectInputStream ois = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream("member.dat")))) {

            // 읽어온 것을 Member로 형변환해서 담는다
            Member readMember = (Member) ois.readObject();
            // toString()이 자동으로 불려서 내용이 출력된다
            System.out.println("읽어온 객체 : " + readMember);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("읽기 중 오류가 발생했습니다.");
        }
    }
}
