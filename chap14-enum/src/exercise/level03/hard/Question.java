package practice.level03.hard;

public class Question {

    public static void main(String[] args) {

        /* 안내. 이 레벨은 enum 의 메소드 정의와 EnumSet 을 함께 다루므로 난이도가 있는 편입니다.
         *      너무 어려우면 모범답안을 먼저 보고 흐름을 파악한 뒤, 직접 다시 풀어보면 학습 효과가 더 좋습니다.
         * */

        /* Q1. 사용자 권한 시스템을 enum 으로 모델링하세요.
         *
         *  enum 정의 조건:
         *   - enum 이름: UserRole
         *   - 상수: GUEST("게스트", 1), USER("일반회원", 2), MANAGER("매니저", 3), ADMIN("관리자", 4)
         *   - 필드: String description, int level
         *   - 매개변수 있는 생성자
         *   - getter: getDescription(), getLevel()
         *   - 메소드: boolean hasHigherLevelThan(UserRole other)
         *      → 자기 자신의 level 이 other 의 level 보다 크면 true
         *
         *  메인 로직 조건:
         *   ① UserRole.MANAGER 와 UserRole.USER 의 권한 레벨을 비교해 출력
         *      예) "MANAGER 가 USER 보다 높은가? true"
         *
         *   ② EnumSet.of(MANAGER, ADMIN) 으로 "관리 권한 집합" 을 만들고,
         *      각 UserRole 이 이 집합에 포함되는지 차례대로 출력
         *      예) "GUEST 는 관리 권한? false"
         *
         *   ③ EnumSet.complementOf(관리 권한 집합) 으로 "일반 권한 집합" 을 만들고,
         *      그 안에 들어있는 모든 UserRole 의 description 을 출력
         *      예) "일반 권한 목록: 게스트, 일반회원"
         *
         * -- 출력 예시 --
         * MANAGER 가 USER 보다 높은가? true
         *
         * GUEST 는 관리 권한? false
         * USER 는 관리 권한? false
         * MANAGER 는 관리 권한? true
         * ADMIN 는 관리 권한? true
         *
         * 일반 권한 목록: 게스트, 일반회원
         * */
    }
}
