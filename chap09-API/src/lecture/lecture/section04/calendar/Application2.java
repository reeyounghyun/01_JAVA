package lecture.lecture.section04.calendar;


import java.time.*;
import java.time.format.DateTimeFormatter;

     /*1.
         Object -> ( toString -> 객체를 원하는 형태의 문자열로 출력할 수 있게 )
         eqauls 재정의한대로 객체의 값이 같은지 확인해서 boolean

         2. String                                   String Pool

           String str = "";
           String str1 = "";

        문자열은 값을 비교할때
        -> eqauls 사용하는게 안전하다.


        3. WrappingClass
           boxing
           int a -> Integer      문자열 -> 정수로 변환
           unboxing              정수 -> 문자[열]

           4. 날짜 타입
              - Date : 옛날 타입

              LocalDateTime

            */

public class Application2 {
    public static void main() {
        /*
         * LocalDate : 날짜
         * LocalTime : 시간
         * LocalDateTime : 날짜와 시간
         * ZonedDateTime : 날짜, 시간, 시간대
         * */

        LocalDate date = LocalDate.of(2026, 10, 7); // of 지정하여 작성할 수 있음
        LocalTime time = LocalTime.of(23, 59, 10);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        ZonedDateTime seoulTime = dateTime.atZone(ZoneId.of("Asia/Shanghai"));

        System.out.println("date = " + date);
        System.out.println("time = " + time);
        System.out.println("dateTime = " + dateTime);
        System.out.println("seoulTime = " + seoulTime);


        LocalDateTime now = LocalDateTime.now(); // 현재시간 변수에 저장
        System.out.println("년 = " + now.getYear());
        System.out.println("월 = " + now.getMonth());
        System.out.println("일 = " + now.getDayOfMonth());
        System.out.println("요일 = " + now.getDayOfWeek());

        //포메팅 : 보이는 형식을 다르게 바꿔주는것.
        String today = "2026/10/07";
        DateTimeFormatter input = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate customDate = LocalDate.parse(today, input);

        System.out.println("customDate = " + customDate);

        // output : 출력을 내맘대로
        DateTimeFormatter output = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH:mm:");
        LocalDateTime outputExample = LocalDateTime.now();
        System.out.println("outputExample = " + outputExample);


        String formatted = outputExample.format(output);
        System.out.println("formatted = " + formatted);

    }
}
