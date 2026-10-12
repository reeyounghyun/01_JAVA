package lecture.section03.references;

import java.util.function.Function;

public class Application2 {
    /*
    * 생성자 메소드 참조
    * */

    static void main() {
        Account account = new Account("banner");

        //String 문자열 Account 반환
        Function<String, Account> function = Account::new;

        Account account1 = function.apply("banner");
        System.out.println(account1);
    }
}
