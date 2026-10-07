package lecture.section01.list.dto;

/*
 * DTO Data Transfer Object
 * - 계층간 데이터를 전달하기 위해 사용하는 객체
 * */
public class BookDTO {

    // 필드
    private int number;
    private String title;
    private String author;
    private int price;


    // 생성자 (모든필드를 초기화하는 생성자, 기본 생성자, +a)
/*
    public BookDT0() {
    }
*/

    public void BookDT0(int number, String title, String author, int price) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.price = price;
    }


    // Getter, Setter
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

    // toSrting
    @Override
    public String toString() {
        return "BookDT0{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
