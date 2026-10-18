package library.repository;

import library.model.Book;
import library.model.BookCategory;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

// 도서 저장·조회·변경
public class LibraryDatabase {

    private final List<Book> books = new ArrayList<>();
    private int nextBookId = 101;   // 도서 ID는 101번부터 시작한다

    public LibraryDatabase() {
        initializeBooks();
    }

    // 초기 데이터 (제공 코드 - 수정하지 않는다)
    private void initializeBooks() {
        LocalDateTime now = LocalDateTime.now();

        addBook(new Book(0, "채식주의자", "한강", BookCategory.NOVEL));
        addBook(new Book(0, "소년이 온다", "한강", BookCategory.NOVEL,
                true, now.minusDays(20), now.minusDays(6), 12));          // 6일 연체 중
        addBook(new Book(0, "불편한 편의점", "김호연", BookCategory.NOVEL,
                true, now.minusDays(3), now.plusDays(11), 8));            // 정상 대출 중
        addBook(new Book(0, "언어의 온도", "이기주", BookCategory.ESSAY));
        addBook(new Book(0, "Clean Code", "Robert C. Martin", BookCategory.REFERENCE,
                true, now.minusDays(5), now.minusDays(2), 21));           // 2일 연체 중
        addBook(new Book(0, "Effective Java", "Joshua Bloch", BookCategory.REFERENCE));
        addBook(new Book(0, "월간 디자인", "디자인하우스", BookCategory.MAGAZINE,
                true, now.minusDays(1), now.plusDays(6), 3));             // 정상 대출 중
        addBook(new Book(0, "보건의료 정책론", "김건강", BookCategory.REFERENCE));
        addBook(new Book(0, "아몬드", "손원평", BookCategory.NOVEL, false, null, null, 17));
        addBook(new Book(0, "Java의 정석", "남궁성", BookCategory.REFERENCE,
                true, now.minusDays(1), now.plusDays(2), 30));            // 정상 대출 중
    }

    /*
     * 문제 DB-1. 신규 도서 등록 (중복 방지)
     *
     * Stream의 anyMatch()를 사용해 제목(title)과 저자(author)가 모두 같은 도서가
     * 이미 books에 있는지 확인한다. 이미 있으면 등록하지 않고 false를 반환한다.
     * 없으면 도서 ID를 nextBookId로 지정하고, nextBookId를 1 증가시킨 뒤
     * books에 추가하고 true를 반환한다.
     *
     * 힌트: 문자열 비교는 == 가 아니라 equals()를 사용한다.
     */
    public boolean addBook(Book book) {
        // TODO: 위 요구사항에 맞게 작성하세요.
        return false;
    }

    /*
     * 문제 DB-2. 전체 도서 목록 조회 (제목순 정렬)
     *
     * books를 Stream으로 변환한 뒤 sorted()와 Comparator.comparing()을 사용해
     * 제목(title) 가나다/알파벳 순으로 정렬한다.
     * 정렬 결과를 toList()로 수집해 반환한다.
     * 원본 books의 순서는 바뀌면 안 된다.
     */
    public List<Book> getAllBooks() {
        // TODO: 아래 임시 반환값을 정렬된 목록으로 교체하세요.
        return new ArrayList<>();
    }

    /*
     * 문제 DB-3. 도서 ID로 조회 (Optional 반환)
     *
     * filter()로 bookId가 일치하는 도서를 남기고 findFirst()의 결과를 그대로 반환한다.
     * 이번에는 orElse(null)을 쓰지 않는다. 반환형이 Optional<Book>이다.
     */
    public Optional<Book> findBook(int bookId) {
        // TODO: 아래 임시 반환값을 Stream 검색 결과로 교체하세요.
        return Optional.empty();
    }

    /*
     * 문제 DB-4. 키워드 검색 (제목 또는 저자, 대소문자 무시)
     *
     * 제목 또는 저자 중 하나라도 keyword를 포함하는 도서를 남긴다.
     * 대소문자를 구분하지 않는다. ("java"로 검색해도 "Effective Java"가 나와야 한다.)
     * 결과를 toList()로 반환한다.
     *
     * 힌트: toLowerCase(), 그리고 || 연산자
     */
    public List<Book> searchBooks(String keyword) {
        // TODO: 아래 임시 반환값을 Stream 검색 결과로 교체하세요.
        return new ArrayList<>();
    }

    /*
     * 문제 DB-5. 분류별 도서 조회
     *
     * category가 전달받은 category와 같은 도서만 남겨 toList()로 반환한다.
     *
     * 힌트: enum 값끼리는 == 로 비교해도 된다. 왜 그런지도 생각해 보자.
     */
    public List<Book> getBooksByCategory(BookCategory category) {
        // TODO: 아래 임시 반환값을 Stream 검색 결과로 교체하세요.
        return new ArrayList<>();
    }

    /*
     * 문제 DB-6. 연체 도서 조회 (오래 연체된 순)
     *
     * LocalDateTime.now()로 현재 시각을 구한다.
     * 대출 중(loaned == true)이면서 반납 예정일(dueDate)이 현재보다 "이전"인 도서만 남긴다.
     * 반납 예정일이 빠른 순서(= 오래 연체된 순서)로 정렬해 toList()로 반환한다.
     *
     * 주의: 대출 중이 아닌 도서는 dueDate가 null이다. filter의 순서를 잘 생각해 보자.
     */
    public List<Book> getOverdueBooks() {
        // TODO: 아래 임시 반환값을 날짜 비교와 Stream 결과로 교체하세요.
        return new ArrayList<>();
    }

    /*
     * 문제 DB-7. 도서 대출
     *
     * findBook(bookId)로 도서를 찾는다.
     * 도서가 없거나 이미 대출 중이면 아무것도 바꾸지 않고 false를 반환한다.
     * 대출 가능하면 다음을 수행하고 true를 반환한다.
     *   - loaned를 true로 변경
     *   - loanDate를 현재 시각으로 지정
     *   - dueDate를 loanDate에 분류(category)의 getLoanDays()만큼 더한 날짜로 지정
     *   - loanCount를 1 증가
     */
    public boolean loanBook(int bookId) {
        // TODO: 위 요구사항에 맞게 작성하세요.
        return false;
    }

    /*
     * 문제 DB-8. 도서 반납 (연체일 계산)
     *
     * findBook(bookId)로 도서를 찾는다.
     * 도서가 없거나 대출 중이 아니면 -1을 반환한다.
     * 대출 중이면:
     *   1. ChronoUnit.DAYS.between(반납예정일, 현재시각)으로 연체일을 구한다.
     *      기한 안에 반납했다면 이 값이 음수가 되므로 그때는 0으로 처리한다.
     *   2. loaned를 false로, loanDate와 dueDate를 null로 변경한다.
     *   3. 연체일(0 이상)을 반환한다.
     *
     * 주의: 1번과 2번의 순서를 바꾸면 어떻게 될까?
     */
    public long returnBook(int bookId) {
        // TODO: 아래 임시 반환값을 실제 반납 처리 코드로 교체하세요.
        return -1;
    }

    /*
     * 문제 DB-9. 대출 연장
     *
     * findBook(bookId)로 도서를 찾는다.
     * 다음 조건을 "모두" 만족할 때만 dueDate를 7일 연장하고 true를 반환한다.
     *   - 도서가 존재한다
     *   - 대출 중이다
     *   - 연체 중이 아니다 (dueDate가 현재보다 이전이 아니다)
     *   - 참고서(REFERENCE)가 아니다
     * 하나라도 만족하지 않으면 false를 반환한다.
     */
    public boolean extendLoan(int bookId) {
        // TODO: 위 요구사항에 맞게 작성하세요.
        return false;
    }

    /*
     * 문제 DB-10. 인기 도서 TOP N
     *
     * loanCount가 많은 순(내림차순)으로 정렬한 뒤 limit()으로 앞에서 limit개만 남겨
     * toList()로 반환한다.
     *
     * 힌트: Comparator.comparingInt(...).reversed()
     */
    public List<Book> getPopularBooks(int limit) {
        // TODO: 아래 임시 반환값을 Stream 결과로 교체하세요.
        return new ArrayList<>();
    }

    /*
     * 문제 DB-11. 도서 삭제 (대출 중이면 삭제 불가)
     *
     * removeIf()를 사용해 bookId가 일치하면서 "대출 중이 아닌" 도서만 삭제한다.
     * removeIf()의 반환값을 그대로 반환한다.
     */
    public boolean deleteBook(int bookId) {
        // TODO: 위 요구사항에 맞게 작성하세요.
        return false;
    }
}
