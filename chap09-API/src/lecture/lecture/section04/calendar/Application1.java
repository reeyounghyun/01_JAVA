package lecture.lecture.section04.calendar;

import java.util.Calendar;
import java.util.Date;

public class Application1 {

    public static void main() {
        // 날짜 저장
        // Date는 안쓸것임 -> 문제를 확인해보자
        Date now = new Date();

        System.out.println("현재시각 = " + now);
        System.out.println("millisecond 현재시각 = " + now.getTime());

        // 사용하지 않는 이유?
        Calendar calendar = Calendar.getInstance();

        int year = calendar.get(Calendar.YEAR); // 현재년도
        int month = calendar.get(Calendar.MONTH) +1 ; // 월 calendar의 월은 0부터 시작하여 항상 1을 더해주어야 한다.
        int day = calendar.get(Calendar.DAY_OF_MONTH); // 일

        System.out.println("year = " + year);
        System.out.println("month = " + month);
        System.out.println("day = " + day);

        //서식지정자
        System.out.printf("%d-%02d-%02d%n",year,month,day);
        // %d 정수출력  / %f: 실수 / %.2f: 소수점 두자리수까지 , %c: 문자 .....
        // %02d 정수를 2자로 출력, 빈자리는 0으로 채움
        // %n 줄바꿈
    }
}
