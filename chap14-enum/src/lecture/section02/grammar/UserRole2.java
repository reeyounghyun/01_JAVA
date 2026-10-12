package lecture.section02.grammar;

public enum UserRole2 {

    // 상수 들
    CUEST("게스트"),
    CONSUMER("구매자"),
    PRODUCER("판매자"),
    ADMIN("관리자");


    // 상수의값을 추가해보자
    // 필드
    //final 필드의 값을 초기화 하기를 할수 있고, 생성자를 반드시 만들어야 오류가 없음.
    private final String description;

    // 생상자
    UserRole2(String description) {
        this.description = description;
    }

    //Getter
    public String getDescription() {
        return description;
    }
}
