package lecture.level03.hard;

public class Question {

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
    }

}
