package exercise.level04.advanced.skeleton.repository;

import practice.level04.advanced.skeleton.model.Member;
import practice.level04.advanced.skeleton.model.MembershipType;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class GymDatabase {

    private final List<Member> members = new ArrayList<>();
    private int nextMemberId = 1;

    public GymDatabase() {
        initializeMembers();
    }

    private void initializeMembers() {
        Calendar calendar = Calendar.getInstance();
        Date now = calendar.getTime();

        calendar.add(Calendar.DATE, 3);
        Date nearExpiry = calendar.getTime();

        calendar.add(Calendar.DATE, 27);
        Date monthExpiry = calendar.getTime();

        addMember(new Member(0, "김철수", 25, "010-1111-1111",
                MembershipType.MONTHLY, now, monthExpiry, true));
        addMember(new Member(0, "이영희", 30, "010-2222-2222",
                MembershipType.YEARLY, now, nearExpiry, true));
        addMember(new Member(0, "박지성", 43, "010-3333-3333",
                MembershipType.DAILY, now, nearExpiry, true));
        addMember(new Member(0, "손흥민", 32, "010-4444-4444",
                MembershipType.MONTHLY, now, monthExpiry, false));
        addMember(new Member(0, "김연아", 34, "010-5555-5555",
                MembershipType.YEARLY, now, monthExpiry, true));
        addMember(new Member(0, "류현진", 37, "010-6666-6666",
                MembershipType.MONTHLY, now, nearExpiry, true));
        addMember(new Member(0, "박세리", 47, "010-7777-7777",
                MembershipType.YEARLY, now, monthExpiry, true));
        addMember(new Member(0, "이정재", 52, "010-8888-8888",
                MembershipType.DAILY, now, nearExpiry, false));
        addMember(new Member(0, "송중기", 39, "010-9999-9999",
                MembershipType.MONTHLY, now, monthExpiry, true));
        addMember(new Member(0, "전지현", 43, "010-0000-0000",
                MembershipType.YEARLY, now, monthExpiry, true));
    }

    /*
     * 문제 DB-1. 신규 회원 등록
     *
     * member의 회원 ID를 nextMemberId 값으로 지정한다.
     * 다음 등록에 사용할 수 있도록 nextMemberId를 1 증가시킨다.
     * ID가 지정된 member를 members에 추가한다.
     */
    public void addMember(Member member) {
        // TODO: 위 요구사항에 맞게 회원 등록 코드를 작성하세요.

    }

    /*
     * 문제 DB-2. 전체 회원 목록 조회
     *
     * 외부에서 내부 members를 직접 변경할 수 없도록 새로운 ArrayList를 반환한다.
     * 반환 목록에는 현재 등록된 모든 회원이 기존 순서대로 들어 있어야 한다.
     */
    public List<Member> getAllMembers() {
        // TODO: 아래 임시 반환값을 실제 전체 회원 목록으로 교체하세요.

        return new ArrayList<>();
    }

    /*
     * 문제 DB-3. 회원 ID로 조회
     *
     * members를 Stream으로 변환한다.
     * filter()로 memberId가 일치하는 회원만 남긴다.
     * 첫 번째 회원을 반환하고, 일치하는 회원이 없으면 null을 반환한다.
     */
    public Member getMember(int memberId) {
        // TODO: 아래 임시 반환값을 Stream 검색 결과로 교체하세요.
        return null;
    }

    /*
     * 문제 DB-4. 회원 이름으로 부분 검색
     *
     * members를 Stream으로 변환한다.
     * filter()와 String.contains()를 사용해 이름에 name이 포함된 회원만 남긴다.
     * 검색 결과를 새로운 List로 수집해 반환한다.
     */
    public List<Member> getMembersByName(String name) {
        // TODO: 아래 임시 반환값을 Stream 검색 결과로 교체하세요.
        return new ArrayList<>();
    }

    /*
     * 문제 DB-5. 7일 이내 만료 예정 회원 조회
     *
     * 현재 시각과 현재 시각으로부터 7일 뒤의 시각을 계산한다.
     * Stream의 filter()를 사용해 활성 회원만 남긴다.
     * 만료일이 현재 이후이면서 7일 뒤 이전인 회원만 남긴다.
     * 경계 날짜인 현재와 7일 뒤도 결과에 포함하고, 결과를 List로 반환한다.
     */
    public List<Member> getNearExpiryMembers() {
        // TODO: 아래 임시 반환값을 날짜 계산과 Stream 검색 결과로 교체하세요.
        return new ArrayList<>();
    }

    /*
     * 문제 DB-6. 회원 기본 정보 수정
     *
     * getMember(memberId)를 호출해 수정할 회원을 찾는다.
     * 회원이 존재할 때만 이름, 나이, 연락처를 전달받은 값으로 변경한다.
     * 회원이 없으면 아무 작업도 하지 않는다.
     */
    public void updateMemberInfo(int memberId, String name, int age, String phone) {
        // TODO: 위 요구사항에 맞게 기본 정보 수정 코드를 작성하세요.
    }

    /*
     * 문제 DB-7. 회원권 연장
     *
     * getMember(memberId)를 호출해 회원을 찾는다.
     * 회원이 존재하면 현재 만료일을 Calendar에 설정한다.
     * 현재 회원권의 getDays()만큼 더한 날짜를 새 만료일로 지정한다.
     */
    public void extendMembership(int memberId) {
        // TODO: 위 요구사항에 맞게 회원권 연장 코드를 작성하세요.
    }

    /*
     * 문제 DB-8. 회원권 종류 변경
     *
     * getMember(memberId)를 호출해 회원을 찾는다.
     * 회원이 존재하면 회원권 종류를 newType으로 변경한다.
     * 현재 날짜를 기준으로 newType.getDays()만큼 더해 만료일을 다시 계산한다.
     */
    public void changeMembershipType(int memberId, MembershipType newType) {
        // TODO: 위 요구사항에 맞게 회원권 종류와 만료일 변경 코드를 작성하세요.
    }

    /*
     * 문제 DB-9. 회원 활성 상태 변경
     *
     * getMember(memberId)를 호출해 회원을 찾는다.
     * 회원이 존재할 때만 active 값을 전달받은 값으로 변경한다.
     */
    public void updateMemberStatus(int memberId, boolean active) {
        // TODO: 위 요구사항에 맞게 회원 상태 변경 코드를 작성하세요.
    }

    /*
     * 문제 DB-10. 회원 삭제
     *
     * removeIf()를 사용해 memberId가 일치하는 회원을 members에서 삭제한다.
     * 일치하는 회원이 없어도 예외가 발생하지 않아야 한다.
     */
    public void deleteMember(int memberId) {
        // TODO: 위 요구사항에 맞게 회원 삭제 코드를 작성하세요.
    }
}
