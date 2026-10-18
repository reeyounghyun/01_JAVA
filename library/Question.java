package library;

public class Question {

    /*
     * Q2. 도서관 대출 관리 프로그램 완성하기
     *
     * chap99 피트니스 회원 관리와 같은 구조(Model - Repository - View - Controller)지만
     * 반환형과 조건이 다르다. 앞 문제 코드를 그대로 옮기면 풀리지 않는다.
     *
     * Book과 BookCategory는 도메인 모델로 제공되며, Application은 실행용 메뉴 코드다.
     * 다음 순서대로 TODO를 해결한다.
     * 1. repository/LibraryDatabase.java : 등록(중복 방지), 정렬, Optional 검색, 대출·반납·연장, 삭제
     * 2. view/BookView.java              : 도서·목록·메시지·반납 결과 출력
     * 3. controller/BookController.java  : 반환값(boolean, Optional, long)에 따라 흐름 분기
     *
     * 제약사항
     * - 메소드명, 매개변수, 반환형은 변경하지 않는다.
     * - 검색·정렬·필터는 Stream API를 사용하고, 결과 목록은 toList()로 만든다.
     * - 날짜는 LocalDateTime을, 일수 차이는 ChronoUnit.DAYS.between()을 사용한다.
     * - 제공 코드(model, run, initializeBooks)는 수정하지 않는다.
     *
     * 앞 문제와 달라진 점 (여기서 막히면 그 개념을 다시 보면 된다)
     * - findBook()이 null 대신 Optional<Book>을 반환한다.
     * - addBook / loanBook / extendLoan / deleteBook이 성공 여부를 boolean으로 반환한다.
     * - returnBook()은 연체일(long)을 반환하고, 실패는 -1로 표현한다.
     * - sorted(), limit(), anyMatch(), Comparator가 새로 등장한다.
     *
     * 확인용 시나리오 (초기 데이터 기준)
     * - 키워드 "java" 검색 → Effective Java, Java의 정석 2권
     * - 키워드 "한강" 검색 → 저자로 검색되어 2권
     * - 연체 도서 조회 → 소년이 온다(6일), Clean Code(2일) 순서
     * - 102번 반납 → 연체 6일 / 연체료 600원
     * - 104번 대출 → 오늘 + 14일이 반납 예정일
     * - 105번 연장 → 실패 (참고서 + 연체 중)
     * - 103번 연장 → 성공
     * - 103번 삭제 → 대출 중이라 실패
     * - 인기 도서 TOP 3 → Java의 정석(30), Clean Code(21), 아몬드(17)
     * - 제목 "채식주의자", 저자 "한강"으로 등록 → 이미 등록된 도서
     */

    /*
     * 개념 체크 (코드를 다 짠 뒤 아래에 주석으로 답을 적어 보세요)
     *
     * C1. 피트니스 문제에서 getNearExpiryMembers()에 filter()만 쓰고 toList()를 빼면
     *     컴파일 에러가 난다. 에러가 나는 정확한 이유는?
     *     답:
     *
     * C2. getAllBooks()가 toList()로 반환한 리스트에 add()를 하면 어떻게 되는가?
     *     피트니스 문제의 new ArrayList<>(members) 반환과 무엇이 다른가?
     *     답:
     *
     * C3. findBook()이 null 대신 Optional<Book>을 반환하면 호출하는 쪽에서 무엇이 좋아지는가?
     *     답:
     *
     * C4. CONTROLLER-7에서 loanBook() 호출 전에 꺼내 둔 Book 변수로 반납 예정일을 출력해도
     *     바뀐 날짜가 나온다. 그 이유는?
     *     답:
     *
     * C5. "만료일이 현재 이후"를 조건으로 쓸 때 isAfter(now)와 !isBefore(now)는 어떻게 다른가?
     *     답:
     *
     * C6. DB-6에서 filter(loaned)보다 filter(dueDate 비교)를 먼저 쓰면 무슨 일이 생기는가?
     *     답:
     *
     * C7. 문자열은 equals()로 비교하라고 하면서, enum은 ==로 비교해도 되는 이유는?
     *     답:
     *
     * C8. Controller가 System.out.println()을 직접 쓰지 않고 View를 거치는 이유는?
     *     답:
     */
}
