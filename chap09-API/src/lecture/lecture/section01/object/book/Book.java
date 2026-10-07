package lecture.lecture.section01.object.book;

import java.util.Objects;

public class Book {

    private int number; // 책번호
    private String title; // 제목
    private String author;// 작가
    private int price;    // 가격

    // 생성자

    // 기본 생성자
    public Book() {

    }

    // 모든 생성자
    public Book(int number, String title, String author, int price) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // get와 set
    // 매서드
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (
                o == null  // 인자로 넘어온 객체가 null이면 false 다르다,
                ||  //또는
                // getClass() : 현재 자신의 클래스정볻와 비교대상의 클래스 정보가 다르면 false
                getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return
                // 모든 필드의 내용이 같으면 true 하나라도 다르면 false
                this.number == book.number
                &&
                price == book.price
                && Objects.equals(title, book.title)
                && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, title, author, price);
    }
}
