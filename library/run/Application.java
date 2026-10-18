package library.run;

import library.controller.BookController;
import library.model.BookCategory;

import java.util.Scanner;

// 사용자 입력
public class Application {

    /*
     * 실행용 메뉴 코드이다. 수정하지 않는다.
     * 모든 TODO를 완성한 뒤 이 메소드를 실행해 각 기능을 테스트한다.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookController controller = new BookController();

        while (true) {
            System.out.println("\n===== 도서관 대출 관리 시스템 =====");
            System.out.println("1. 신규 도서 등록");
            System.out.println("2. 도서 조회");
            System.out.println("3. 대출 / 반납 / 연장");
            System.out.println("4. 도서 삭제");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴를 선택하세요: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addBook(scanner, controller);
                case 2 -> searchMenu(scanner, controller);
                case 3 -> loanMenu(scanner, controller);
                case 4 -> {
                    System.out.print("삭제할 도서 ID: ");
                    controller.deleteBook(scanner.nextInt());
                    scanner.nextLine();
                }
                case 9 -> {
                    System.out.println("---------- 프로그램을 종료합니다. ----------");
                    scanner.close();
                    return;
                }
                default -> System.out.println("---------- 잘못된 입력입니다. ----------");
            }
        }
    }

    private static void addBook(Scanner scanner, BookController controller) {
        System.out.println("---------- 신규 도서 등록 ----------");
        System.out.print("제목: ");
        String title = scanner.nextLine();
        System.out.print("저자: ");
        String author = scanner.nextLine();
        BookCategory category = selectCategory(scanner);
        controller.addBook(title, author, category);
    }

    private static void searchMenu(Scanner scanner, BookController controller) {
        while (true) {
            System.out.println("\n---------- 도서 조회 메뉴 ----------");
            System.out.println("1. 전체 도서 조회 (제목순)");
            System.out.println("2. 도서 ID로 조회");
            System.out.println("3. 키워드 검색 (제목/저자)");
            System.out.println("4. 분류별 조회");
            System.out.println("5. 연체 도서 조회");
            System.out.println("6. 인기 도서 TOP 3");
            System.out.println("9. 이전 메뉴로");
            System.out.print("메뉴 선택: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> controller.displayAllBooks();
                case 2 -> {
                    System.out.print("조회할 도서 ID: ");
                    controller.findBook(scanner.nextInt());
                    scanner.nextLine();
                }
                case 3 -> {
                    System.out.print("검색어: ");
                    controller.searchBooks(scanner.nextLine());
                }
                case 4 -> controller.getBooksByCategory(selectCategory(scanner));
                case 5 -> controller.getOverdueBooks();
                case 6 -> controller.getPopularBooks(3);
                case 9 -> {
                    return;
                }
                default -> System.out.println("---------- 잘못된 입력입니다. ----------");
            }
        }
    }

    private static void loanMenu(Scanner scanner, BookController controller) {
        while (true) {
            System.out.println("\n---------- 대출 / 반납 / 연장 ----------");
            System.out.println("1. 대출");
            System.out.println("2. 반납");
            System.out.println("3. 대출 연장");
            System.out.println("9. 이전 메뉴로");
            System.out.print("메뉴 선택: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 9) {
                return;
            }

            System.out.print("도서 ID: ");
            int bookId = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> controller.loanBook(bookId);
                case 2 -> controller.returnBook(bookId);
                case 3 -> controller.extendLoan(bookId);
                default -> System.out.println("---------- 잘못된 입력입니다. ----------");
            }
        }
    }

    private static BookCategory selectCategory(Scanner scanner) {
        System.out.println("1. 소설  2. 에세이  3. 잡지  4. 참고서");
        System.out.print("분류 선택: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        return switch (choice) {
            case 2 -> BookCategory.ESSAY;
            case 3 -> BookCategory.MAGAZINE;
            case 4 -> BookCategory.REFERENCE;
            default -> BookCategory.NOVEL;
        };
    }
}
