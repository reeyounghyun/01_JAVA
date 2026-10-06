package lecture.section07.finalkeyword;

public class FinalFieldTest {
    /*
     * final : 변경 불가
     * - 지역변수 -> 초기화 이후 값 변경 불가
     * - 매개변수 -> 호출시 전달한 인자를 변경 불가
     * - 전역변수 -> 인스턴스 생성 후 초기화 이후에 변경불가
     * - 정적변수 -> 프로그램 시작 후 변경 불가
     * - 메소드 -> 메소드 재작성 불가(overriding) 불가
     * */

    private final int NON_STATIC_NUM = 1;
    private final String NON_STATIC_NAME;
    private static final double STATIC_DOUBLE;

    public FinalFieldTest(String nonStaticName) {
        NON_STATIC_NAME = nonStaticName;
    }

    // 초기화 블록
    static {
        STATIC_DOUBLE = 0.5;
    }
}