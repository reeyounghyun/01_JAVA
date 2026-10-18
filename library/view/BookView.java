package library.view;

import library.model.Book;

import java.util.List;

// 결과 출력
public class BookView {

    private static final int LATE_FEE_PER_DAY = 100;   // 하루 연체료(원)

    /*
     * 문제 VIEW-1. 도서 한 권 출력
     *
     * 전달받은 book을 한 줄에 출력한다.
     */
    public void displayBook(Book book) {
        // TODO
    }

    /*
     * 문제 VIEW-2. 도서 목록 출력 + 권수
     *
     * forEach()와 메소드 참조를 사용해 모든 도서를 한 줄씩 출력한다.
     * 목록 출력이 끝나면 마지막 줄에 "총 N권"을 출력한다. (N은 목록의 크기)
     */
    public void displayBookList(List<Book> books) {
        // TODO
    }

    /*
     * 문제 VIEW-3. 안내 메시지 출력
     *
     * 전달받은 message를 한 줄에 출력한다.
     */
    public void displayMessage(String message) {
        // TODO
    }

    /*
     * 문제 VIEW-4. 반납 결과 출력
     *
     * overdueDays가 0이면 "정상 반납되었습니다."를 출력한다.
     * 1 이상이면 연체료(overdueDays * LATE_FEE_PER_DAY)를 계산해 아래 형식으로 출력한다.
     *   반납되었습니다. 연체 6일 / 연체료 600원
     */
    public void displayReturnResult(int overdueDays) {
        // TODO
    }
}
