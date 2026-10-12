package lecture.section02.grammar;

public enum UserRole1 {
    // 권한에 따라 보여지는게 다음 만들어보다

    CUEST,
    CONSUMER,
    PRODUCER,
    ADMIN;

    // 객체 만들자 == 생성자
    UserRole1() {
        System.out.println("[UserRole1 초기화]" + this.name());
    }

    //toLowerCase 소문자 출력 메소드
    public String getNameTolowerCase() {
        return this.name().toLowerCase();
    }
}
