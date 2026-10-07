package lecture.lecture.section01.object.run;

import lecture.lecture.section01.object.book.Book;

public class Application1 {
    public static void main() {

        // Object.toString() : "클래스명@16진수의 해시코드"
        // 우리가 알고싶은것? : 객체와 상태를 쉽게 확인하려면 자식 클래스에서 재정의한다.

        Object object = new Object();
        System.out.println(object.toString());

        Book book = new Book(1, "홍길동전", "허균", 50000);
        System.out.println(book);
        System.out.println(book.toString());
    }
}
