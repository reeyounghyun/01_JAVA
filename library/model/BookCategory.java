package library.model;

// 도서 분류 (제공 코드 - 수정하지 않는다)
public enum BookCategory {

    NOVEL("소설", 14),
    ESSAY("에세이", 14),
    MAGAZINE("잡지", 7),
    REFERENCE("참고서", 3);

    private final String description;
    private final int loanDays;   // 이 분류의 기본 대출 기간(일)

    BookCategory(String description, int loanDays) {
        this.description = description;
        this.loanDays = loanDays;
    }

    public String getDescription() {
        return description;
    }

    public int getLoanDays() {
        return loanDays;
    }
}
