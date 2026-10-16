package skeleton.controller;

import skeleton.model.Member;
import skeleton.model.MembershipType;
import skeleton.repository.GymDatabase;
import skeleton.view.MemberView;

import java.awt.*;
import java.time.LocalDateTime;
import java.util.List;

// 요청 흐름 조정
public class MemberController {

    private final GymDatabase gymDatabase;
    private final MemberView memberView;

    public MemberController() {
        gymDatabase = new GymDatabase();
        memberView = new MemberView();
    }

    /*
     * 문제 CONTROLLER-1. 신규 회원 등록 요청 처리
     *
     * LocalDateTime.now()로 구한 현재 날짜와 시각을 가입일로 저장한다.
     * 가입일에 plusDays()로 membershipType.getDays()를 더해 만료일을 계산한다.
     * ID는 데이터베이스에서 부여하므로 0으로 설정한 활성 Member를 생성한다.
     * 데이터베이스에 추가한 뒤 "회원이 성공적으로 등록되었습니다."를 출력한다.
     */
    public void addMember(String name, int age, String phone, MembershipType membershipType) {
        // TODO: 위 요구사항에 맞게 등록 요청 처리 코드를 작성하세요.3

        /** 1.LocalDateTime.now()로 구한 현재 날짜와 시각을 가입일로 저장한다*/
        // 현재시각을 구함
        LocalDateTime enrollDate = LocalDateTime.now();

        /** 2.가입일에 plusDays()로 membershipType.getDays()를 더해 만료일을 계산한다.*/
        // 현재시각을 기준으로 종료가 되는 시점
        LocalDateTime expiryDate = enrollDate.plusDays(membershipType.getDays());

        /** 3.ID는 데이터베이스에서 부여하므로 0으로 설정한 활성 Member를 생성한다.*/
        Member member = new Member(
                0, name, age, phone, membershipType, enrollDate, expiryDate,
                true);


        /**데이터베이스에 추가한 뒤 "회원이 성공적으로 등록되었습니다."를 출력한다.*/
        // 1.데이터베이스에 추가 ->  gymDatabase.addMember(member)
        gymDatabase.addMember(member); // 아직 DB쪽 메소드는 완성되지 않았다.

        memberView.displayMessage("회원이 성공적으로 등록되었습니다.");
    }

    /*
     * 문제 CONTROLLER-2. 전체 회원 조회 요청 처리
     *
     * 데이터베이스에서 전체 회원 목록을 가져온다.
     * 가져온 목록을 MemberView의 목록 출력 메소드로 전달한다.
     *
     * [코드 설명]
     *  1. gymDatabase에서 전체 회원 목록(List<Member>)을 조회하여 가져온다.
     *  2. 조회한 회원 목록을 memberView에 전달하여 화면에 출력한다.
     */
    public void displayAllMembers() {
        // TODO: 전체 회원 조회 결과를 화면에 전달하세요.
        List<Member> allMembers = gymDatabase.getAllMembers();
        // DB에서 전체 회원 목록 가져오기
        memberView.displayMemberList(allMembers);
        // 목록을 View에 넘겨서 출력
    }

    /*
     * 문제 CONTROLLER-3. 회원 ID 조회 요청 처리
     *
     * 데이터베이스에서 memberId와 일치하는 회원을 조회한다.
     * 회원이 있으면 회원 정보를 출력한다.
     * 회원이 없으면 "해당 ID의 회원을 찾을 수 없습니다."를 출력한다.
     *
     *
     * [코드 주석]
     * 1. gymDatabase에서 memberId가 같은 회원 한 명을 가져온다.
     *  2. memberid != null → 회원을 찾았는지 확인
     *   - 찾았으면 → displayMember로 회원 정보 출력
     *   - 없으면(null) → "해당 ID의 회원을 찾을 수 없습니다." 출력
     */
    public void getMember(int memberId) {
        // TODO: ID 조회 결과에 따라 회원 또는 안내 메시지를 출력하세요.

        //gymDatabase.getMember(memberId);
        Member memberid = gymDatabase.getMember(memberId);
        if (memberid != null) {
            memberView.displayMember(memberid);
        } else {
            memberView.displayMessage("해당 ID의 회원을 찾을 수 없습니다.");
        }
    };


    /*
     * 문제 CONTROLLER-4. 회원 이름 조회 요청 처리
     *
     * 데이터베이스에서 name이 포함된 회원 목록을 조회한다.
     * 목록이 비어 있지 않으면 회원 목록을 출력한다.
     * 목록이 비어 있으면 "해당 이름의 회원을 찾을 수 없습니다."를 출력한다.
     *
     /* [코드 설명]
     * 회원 이름 조회 요청 처리
     * 1. gymDatabase에서 이름이 포함된 회원 목록을 가져온다
     * 2. memberName.size() > 0 → 검색된 회원 수가 1명 이상인지 확인
     *    - true (회원 있음) → displayMemberList로 목록 출력
     *    - false (회원 없음) → displayMessage로 안내 메시지 출력
     */
    public void getMembersByName(String name) {
        // TODO: 이름 조회 결과에 따라 목록 또는 안내 메시지를 출력하세요.
        List<Member> memberName = gymDatabase.getMembersByName(name);
        if (memberName.size() > 0) {  // 검색된 회원이 1명 이상 있나요?"
            memberView.displayMemberList(memberName);  // 'displayMemberList' 목록을 화면에 출력해 주는 메서드
        } else {
            memberView.displayMessage("해당 이름의 회원을 찾을 수 없습니다.");
        }
    }



    /*
     * 문제 CONTROLLER-5. 만료 예정 회원 조회 요청 처리
     *
     * 데이터베이스에서 7일 이내 만료 예정 회원 목록을 조회한다.
     * 결과가 있으면 제목 "=== 7일 이내 만료 예정 회원 목록 ==="과 목록을 출력한다.
     * 결과가 없으면 "만료 예정인 회원이 없습니다."를 출력한다.
     *
     *
     * [코드 설명]
     * 1. gymDatabase에서 7일 이내 만료 예정 회원 목록을 조회한다.
     * 2. nearExpiry.size() > 0 → 조회된 회원이 있나요?
     *   - 있으면 → "=== 7일 이내 만료 예정 회원 목록 ===" 출력
     *     - nearExpiry를 화면에 출력해 주는 메서드
     *   - 없으면 → "만료 예정인 회원이 없습니다." 출력
     */
    public void getNearExpiryMembers() {
        // TODO: 만료 예정 조회 결과에 따라 목록 또는 안내 메시지를 출력하세요.

        List<Member> nearExpiry =  gymDatabase.getNearExpiryMembers();
        if(nearExpiry.size() > 0) {
            memberView.displayMessage("=== 7일 이내 만료 예정 회원 목록 ===");
            memberView.displayMemberList(nearExpiry);
        } else {
            memberView.displayMessage("만료 예정인 회원이 없습니다.");
        }
    }

    /*
     * 문제 CONTROLLER-6. 회원 기본 정보 수정 요청 처리
     *
     * 먼저 memberId에 해당하는 회원의 존재 여부를 확인한다.
     * 회원이 있으면 데이터베이스의 수정 메소드를 호출하고
     * "회원 정보가 수정되었습니다."를 출력한다.
     * 회원이 없으면 ID 조회 실패 메시지를 출력한다.
     *
     *
     * [코드 설명]
     * 1. memberId로 회원을 찾고 싶을때
     * 2. 회원이 있으면
     *   - DB에 수정 요청
     *   - 성공 메시지 출력
     * 3. 회원이 없으면 실패 메시지 출력
     */
    public void updateMemberInfo(int memberId, String name, int age, String phone) {
        // TODO: 회원 존재 여부에 따라 수정 또는 실패 처리를 작성하세요.

        // 1. memberId로 회원을 찾고 싶을때
        Member member = gymDatabase.getMember(memberId);

        // 2. 회원이 있으면
        if(member != null) {
            // DB에 수정 요청
            gymDatabase.updateMemberInfo(memberId, name, age, phone);
            // 성공 메시지 출력
            memberView.displayMessage("회원 정보가 수정되었습니다.");
        } else {
            // 3. 회원이 없으면 실패 메시지 출력
            memberView.displayMessage("해당 ID의 회원을 찾을 수 없습니다.");
        }
    }

    /*
     * 문제 CONTROLLER-7. 회원권 연장 요청 처리
     *
     * 회원이 있으면 데이터베이스의 연장 메소드를 호출하고
     * "회원권이 연장되었습니다."를 출력한다.
     * 회원이 없으면 ID 조회 실패 메시지를 출력한다.
     *
     *  [코드 설명]
     *  1. gymDatabase에서 memberId와 일치하는 회원 한 명을 조회한다.
     *  2. 조건은 member != null → 회원을 찾았는지 확인
     *   - 있으면 → DB의 연장 메소드 호출 후 "회원권이 연장되었습니다." 출력
     *   - 없으면 → "해당 ID의 회원을 찾을 수 없습니다." 출력
     */
    public void extendMembership(int memberId) {
        // TODO: 회원 존재 여부에 따라 연장 또는 실패 처리를 작성하세요.
        Member member = gymDatabase.getMember(memberId);
        if(member != null) {
            gymDatabase.extendMembership(memberId);
            memberView.displayMessage("회원권이 연장되었습니다.");
        }else {
            memberView.displayMessage("해당 ID의 회원을 찾을 수 없습니다.");
        }
    }

    /*
     * 문제 CONTROLLER-8. 회원권 종류 변경 요청 처리
     *
     * 회원이 있으면 데이터베이스의 회원권 변경 메소드를 호출하고
     * "회원권 종류가 변경되었습니다."를 출력한다.
     * 회원이 없으면 ID 조회 실패 메시지를 출력한다.
     *
     * [코드 설명]
     * 1.gymDatabase에서 memberId와 일치하는 회원권 종류 변경
     * 2. 조건은 member != null -> 회원을 찾았는지 확인
     *  -- 있으면 데이터베이스의 연장 메소드 호출 후 "회원권 종류가 변경되었습니다. 출력
     *  -- 데이터베이스에 없으면 "회원이 없으면 ID 조회 실패 출력
     */
    public void changeMembershipType(int memberId, MembershipType newType) {
        // TODO: 회원 존재 여부에 따라 회원권 변경 또는 실패 처리를 작성하세요.

        Member member = gymDatabase.getMember(memberId);
        if (member != null) {
            gymDatabase.changeMembershipType(memberId, newType);
            memberView.displayMessage("회원권 종류가 변경되었습니다.");
        } else {
            memberView.displayMessage(해당 ID의 회원을 찾을 수 없습니다.");
        }
    }

    /*
     * 문제 CONTROLLER-9. 회원 상태 변경 요청 처리
     *
     * 회원이 있으면 데이터베이스의 상태 변경 메소드를 호출하고
     * "회원 상태가 변경되었습니다."를 출력한다.
     * 회원이 없으면 ID 조회 실패 메시지를 출력한다.

     [코드 설명]
     * 1. getMember 메소드를 호출하여 memberId에 해당하는 회원을 찾는다.
     * 2. 찾은 회원이 null이 아니면 (회원이 존재하면) gymDatabase의 changeMembershipType 메소드를 호출하여 회원권 종류를 변경한다.
     * 3. gymDatabase의 changeMembershipType 메소드 호출 후 "회원권 종류가 변경되었습니다."를 출력한다.
     * 4. 찾은 회원이 null이면 (회원이 존재하지 않으면) "해당 ID의 회원을 찾을 수 없습니다."를 출력한다.
     */

    public void updateMemberStatus(int memberId, boolean active) {
        // TODO: 회원 존재 여부에 따라 상태 변경 또는 실패 처리를 작성하세요.

        Member member = gymDatabase.getMember(memberId);
        if (member != null) {
            gymDatabase.updateMemberStatus(memberId, active);
            memberView.displayMessage("회원 상태가 변경되었습니다.");
        } else {
            memberView.displayMessage("해당 ID의 회원을 찾을 수 없습니다.");
        }
    }


        /*
         * 문제 CONTROLLER-10. 회원 삭제 요청 처리
         *
         * 회원이 있으면 데이터베이스의 삭제 메소드를 호출하고
         * "회원이 삭제되었습니다."를 출력한다.
         * 회원이 없으면 ID 조회 실패 메시지를 출력한다.
         */
        public void deleteMember ( int memberId){
            // TODO: 회원 존재 여부에 따라 삭제 또는 실패 처리를 작성하세요.
            Member member = gymDatabase.getMember(memberId);
            if (member != null) {
                gymDatabase.deleteMember(memberId);
                memberView.displayMessage("회원이 삭제되었습니다.");
            } else {
                memberView.displayMessage("해당 ID의 회원을 찾을 수 없습니다.");
            }
        }


    }

