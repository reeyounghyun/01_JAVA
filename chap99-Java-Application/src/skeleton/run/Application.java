package skeleton.run;

import skeleton.controller.MemberController;
import skeleton.model.MembershipType;

import java.util.Scanner;

// 사용자 입력
public class Application {

    /*
     * 실행용 메뉴 코드이다. 수정하지 않는다.
     * 모든 TODO를 완성한 뒤 이 메소드를 실행해 각 기능을 테스트한다.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MemberController controller = new MemberController();

        while (true) {
            System.out.println("\n===== 피트니스 회원 관리 시스템 =====");
            System.out.println("1. 신규 회원 등록");
            System.out.println("2. 회원 정보 조회");
            System.out.println("3. 회원 정보 수정");
            System.out.println("4. 회원 삭제");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴를 선택하세요: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addMember(scanner, controller);
                    break;
                case 2:
                    searchMembers(scanner, controller);
                    break;
                case 3:
                    updateMember(scanner, controller);
                    break;
                case 4:
                    System.out.print("삭제할 회원의 ID: ");
                    controller.deleteMember(scanner.nextInt());
                    scanner.nextLine();
                    break;
                case 9:
                    System.out.println("---------- 프로그램을 종료합니다. ----------");
                    scanner.close();
                    return;
                default:
                    System.out.println("---------- 잘못된 입력입니다. ----------");
            }
        }
    }

    private static void addMember(Scanner scanner, MemberController controller) {
        System.out.println("---------- 신규 회원 등록을 시작합니다. ----------");
        System.out.print("이름: ");
        String name = scanner.nextLine();

        System.out.print("나이: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("연락처(예: 010-1234-5678): ");
        String phone = scanner.nextLine();

        System.out.println("1. 일일 회원권");
        System.out.println("2. 월간 회원권");
        System.out.println("3. 연간 회원권");
        System.out.print("회원권 종류 선택: ");
        MembershipType membershipType = selectMembershipType(scanner.nextInt());
        scanner.nextLine();

        controller.addMember(name, age, phone, membershipType);
    }

    private static void searchMembers(Scanner scanner, MemberController controller) {
        while (true) {
            System.out.println("\n---------- 회원 정보 조회 메뉴 ----------");
            System.out.println("1. 회원 전체 조회");
            System.out.println("2. 회원 ID로 조회");
            System.out.println("3. 회원 이름으로 조회");
            System.out.println("4. 만료 예정 회원 조회");
            System.out.println("9. 이전 메뉴로");
            System.out.print("메뉴 선택: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 9) {
                return;
            }

            switch (choice) {
                case 1:
                    controller.displayAllMembers();
                    break;
                case 2:
                    System.out.print("조회할 회원 ID: ");
                    controller.getMember(scanner.nextInt());
                    scanner.nextLine();
                    break;
                case 3:
                    System.out.print("조회할 회원 이름: ");
                    controller.getMembersByName(scanner.nextLine());
                    break;
                case 4:
                    controller.getNearExpiryMembers();
                    break;
                default:
                    System.out.println("---------- 잘못된 입력입니다. ----------");
            }
        }
    }

    private static void updateMember(Scanner scanner, MemberController controller) {
        while (true) {
            System.out.println("\n---------- 회원 정보 수정 메뉴 ----------");
            System.out.println("1. 기본 정보 수정");
            System.out.println("2. 회원권 연장");
            System.out.println("3. 회원권 변경");
            System.out.println("4. 회원 상태 변경");
            System.out.println("9. 이전 메뉴로");
            System.out.print("메뉴 선택: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 9) {
                return;
            }

            System.out.print("수정할 회원의 ID: ");
            int memberId = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("새로운 이름: ");
                    String name = scanner.nextLine();
                    System.out.print("새로운 나이: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("새로운 연락처: ");
                    String phone = scanner.nextLine();
                    controller.updateMemberInfo(memberId, name, age, phone);
                    break;
                case 2:
                    controller.extendMembership(memberId);
                    break;
                case 3:
                    System.out.println("1. 일일 회원권");
                    System.out.println("2. 월간 회원권");
                    System.out.println("3. 연간 회원권");
                    System.out.print("변경할 회원권 종류 선택: ");
                    MembershipType newType = selectMembershipType(scanner.nextInt());
                    scanner.nextLine();
                    controller.changeMembershipType(memberId, newType);
                    break;
                case 4:
                    System.out.print("회원 상태 변경(true/false): ");
                    boolean active = scanner.nextBoolean();
                    scanner.nextLine();
                    controller.updateMemberStatus(memberId, active);
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }

    private static MembershipType selectMembershipType(int choice) {
        return switch (choice) {
            case 2 -> MembershipType.MONTHLY;
            case 3 -> MembershipType.YEARLY;
            default -> MembershipType.DAILY;
        };
    }
}
