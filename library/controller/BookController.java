package library.controller;

import library.model.Book;
import library.model.BookCategory;
import library.repository.LibraryDatabase;
import library.view.BookView;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

// 요청 흐름 조정
public class BookController {

    private static final String NOT_FOUND = "해당 ID의 도서를 찾을 수 없습니다.";

    private final LibraryDatabase libraryDatabase;
    private final BookView bookView;

    public BookController() {
        libraryDatabase = new LibraryDatabase();
        bookView = new BookView();
    }

    /*
     * 문제 CONTROLLER-1. 신규 도서 등록 요청 처리
     *
     * ID는 데이터베이스가 부여하므로 0으로 설정한 신규 Book을 만든다.
     * (Book의 생성자 중 신규 도서용 생성자를 사용한다.)
     * 데이터베이스의 addBook() 결과에 따라
     *   true  → "도서가 등록되었습니다."
     *   false → "이미 등록된 도서입니다."
     * 를 출력한다.
     */
    public void addBook(String title, String author, BookCategory category) {
        // TODO
    }

    /*
     * 문제 CONTROLLER-2. 전체 도서 조회 요청 처리
     *
     * 데이터베이스의 전체 목록을 View의 목록 출력 메소드로 전달한다.
     */
    public void displayAllBooks() {
        // TODO
    }

    /*
     * 문제 CONTROLLER-3. 도서 ID 조회 요청 처리
     *
     * findBook()이 돌려준 Optional에 ifPresentOrElse()를 사용한다. (if문 사용 금지)
     *   있으면 → 도서 정보 출력 (메소드 참조 사용)
     *   없으면 → NOT_FOUND 메시지 출력 (람다 사용)
     */
    public void findBook(int bookId) {
        // TODO
    }

    /*
     * 문제 CONTROLLER-4. 키워드 검색 요청 처리
     *
     * 검색 결과가 비어 있으면 "검색 결과가 없습니다."를 출력한다.
     * 비어 있지 않으면 목록을 출력한다.
     * 이번에는 size() 대신 isEmpty()를 사용한다.
     */
    public void searchBooks(String keyword) {
        // TODO
    }

    /*
     * 문제 CONTROLLER-5. 분류별 조회 요청 처리
     *
     * 결과가 있으면 제목 "=== [소설] 도서 목록 ===" 형식으로 출력한 뒤 목록을 출력한다.
     * ([ ] 안에는 분류의 getDescription() 값이 들어간다.)
     * 결과가 없으면 "해당 분류의 도서가 없습니다."를 출력한다.
     */
    public void getBooksByCategory(BookCategory category) {
        // TODO
    }

    /*
     * 문제 CONTROLLER-6. 연체 도서 조회 요청 처리
     *
     * 결과가 있으면 "=== 연체 도서 목록 ==="과 목록을 출력한다.
     * 결과가 없으면 "연체 중인 도서가 없습니다."를 출력한다.
     */
    public void getOverdueBooks() {
        // TODO
    }

    /*
     * 문제 CONTROLLER-7. 대출 요청 처리 (실패 이유를 구분해서 안내)
     *
     * 1. findBook()으로 도서를 먼저 꺼내 둔다.
     * 2. 도서가 없으면 NOT_FOUND를 출력한다.
     * 3. 이미 대출 중이면 "이미 대출 중인 도서입니다."를 출력한다.
     * 4. 대출 가능하면 데이터베이스의 loanBook()을 호출한 뒤
     *    "대출되었습니다. 반납 예정일: 2026-10-31" 형식으로 출력한다.
     *    날짜는 DateTimeFormatter.ofPattern("yyyy-MM-dd")로 포맷한다.
     *
     * 생각해 보기: 1번에서 꺼내 둔 Book 변수로 반납 예정일을 출력해도
     *            loanBook() 이후의 날짜가 나올까? 왜 그럴까?
     */
    public void loanBook(int bookId) {
        // TODO
    }

    /*
     * 문제 CONTROLLER-8. 반납 요청 처리
     *
     * 데이터베이스의 returnBook() 결과가
     *   -1이면 → "대출 중인 도서가 아니거나 존재하지 않는 도서입니다."
     *   그 외  → View의 displayReturnResult()로 전달
     */
    public void returnBook(int bookId) {
        // TODO
    }

    /*
     * 문제 CONTROLLER-9. 대출 연장 요청 처리
     *
     * 데이터베이스의 extendLoan() 결과에 따라
     *   true  → "대출 기간이 7일 연장되었습니다."
     *   false → "연장할 수 없는 도서입니다."
     */
    public void extendLoan(int bookId) {
        // TODO
    }

    /*
     * 문제 CONTROLLER-10. 인기 도서 조회 요청 처리
     *
     * "=== 인기 도서 TOP 3 ===" 형식으로 제목을 출력한 뒤 목록을 출력한다.
     * (숫자 자리에는 전달받은 limit 값이 들어간다.)
     */
    public void getPopularBooks(int limit) {
        // TODO
    }

    /*
     * 문제 CONTROLLER-11. 도서 삭제 요청 처리
     *
     * 도서가 없으면 NOT_FOUND를 출력한다.
     * 있으면 데이터베이스의 deleteBook()을 호출하고 결과에 따라
     *   true  → "도서가 삭제되었습니다."
     *   false → "대출 중인 도서는 삭제할 수 없습니다."
     */
    public void deleteBook(int bookId) {
        // TODO
    }
}
