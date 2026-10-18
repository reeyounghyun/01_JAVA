package library.model;

import java.time.LocalDateTime;

// 도서 데이터 (제공 코드 - 수정하지 않는다)
public class Book {

    private int bookId;
    private String title;
    private String author;
    private BookCategory category;
    private boolean loaned;            // 대출 중이면 true
    private LocalDateTime loanDate;    // 대출일 (대출 중이 아니면 null)
    private LocalDateTime dueDate;     // 반납 예정일 (대출 중이 아니면 null)
    private int loanCount;             // 누적 대출 횟수

    public Book() {
    }

    // 신규 도서용 생성자: 대출 중이 아니고 누적 대출 횟수는 0
    public Book(int bookId, String title, String author, BookCategory category) {
        this(bookId, title, author, category, false, null, null, 0);
    }

    public Book(int bookId, String title, String author, BookCategory category,
                boolean loaned, LocalDateTime loanDate, LocalDateTime dueDate, int loanCount) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.category = category;
        this.loaned = loaned;
        this.loanDate = loanDate;
        this.dueDate = dueDate;
        this.loanCount = loanCount;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BookCategory getCategory() {
        return category;
    }

    public void setCategory(BookCategory category) {
        this.category = category;
    }

    public boolean isLoaned() {
        return loaned;
    }

    public void setLoaned(boolean loaned) {
        this.loaned = loaned;
    }

    public LocalDateTime getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(LocalDateTime loanDate) {
        this.loanDate = loanDate;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public int getLoanCount() {
        return loanCount;
    }

    public void setLoanCount(int loanCount) {
        this.loanCount = loanCount;
    }

    @Override
    public String toString() {
        String status = loaned
                ? "대출중(반납예정 " + dueDate.toLocalDate() + ")"
                : "대출가능";
        return "Book [bookId=" + bookId
                + ", title=" + title
                + ", author=" + author
                + ", category=" + category.getDescription()
                + ", status=" + status
                + ", loanCount=" + loanCount + "]";
    }
}
