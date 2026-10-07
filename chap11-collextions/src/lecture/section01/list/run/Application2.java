package lecture.section01.list.run;

import lecture.section01.list.comparator.SortPrice;
import lecture.section01.list.dto.BookDTO;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;



public class Application2 {
    public static void main(String[] args)  {


        /* list의 정렬 */

        List<BookDTO> bookList = new ArrayList<>();

/*
        bookList.add(new BookDTO(1, "홍길동전", "허균", 50000));
        bookList.add(new BookDTO(2, "목민심서", "정약용", 30000));
        bookList.add(new BookDTO(3, "동의보감", "허준", 40000));
        bookList.add(new BookDTO(4, "삼국사기", "김부식", 46000));
        bookList.add(new BookDTO(5, "삼국유사", "일연", 58000));
*/

        // 원본 순서
        System.out.println("bookList의 원본 순서 ");
        for(BookDTO book : bookList) {
            System.out.println(book);
        }

        /*익명 클래스
         * - 인터페이스, 추상클래스를 한번만 사용할때*/

        // 가격으로 오름차순 정렬한 순서
        bookList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return Integer.compare(o1.getPrice(), o2.getPrice());
            }
        });

        // 가격으로 오름차순 정렬한 순서
        System.out.println("bookList의 정렬된 순서 ");
        for(BookDTO book : bookList) {
            System.out.println(book);
        }
    }

}
