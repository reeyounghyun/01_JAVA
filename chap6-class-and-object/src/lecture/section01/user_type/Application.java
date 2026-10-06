package lecture.section01.user_type;

public class Application {
    public static void main(String[] args) {

        // 회원 데이터를 관리
        // 자료형 변수명 = new 클래스명(); => 인스턴스를 생성
        Member member = new Member();

        /*
        * 필드에 접근하기 위해서는 변수명, 필드명으로 접근한다
        * . 참조연산자 -> 변수가 참고하고 있는 주소로 접근하는 의미*/
        System.out.println("member.id = " + member.id);
        System.out.println("member.name = " + member.name);
        System.out.println("member = " + member.age);

        member.id = "userr01";
        member.pwd = "pass01";
        member.name = "이영현";
        member.age = 10;
        member.gender = '여';
        member.hobby = new String[] {"축구", "볼링", "테니스"};

        System.out.println("member.id = " + member.id);
        System.out.println("member.name = " + member.name);
        System.out.println("member.age = " + member.age);
        // 블록설정후에 alt + j : 커서복사
        // 복사하고싶은 줄에서 ctrl + d : 줄복사
        System.out.println("member.pwd = " + member.pwd);
        System.out.println("member.gender = " + member.gender);
        System.out.println("member.hobby = " + member.hobby[0]);

        System.out.println(member);



        Member member2 = new Member();

        /*
         * 필드에 접근하기 위해서는 변수명, 필드명으로 접근한다
         * . 참조연산자 -> 변수가 참고하고 있는 주소로 접근하는 의미*/
        System.out.println("member.id = " + member.id);
        System.out.println("member.name = " + member.name);
        System.out.println("member = " + member.age);

        member2.id = "userr01";
        member2.pwd = "pass01";
        member2.name = "이영현";
        member2.age = 10;
        member2.gender = '여';
        member2.hobby = new String[] {"축구", "볼링", "테니스"};
    }
}
