package lecture.section02.functionalInterface;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.function.*;

public class Application0 {

    /*
     * 표준 함수적 인터페이스
     * Runnable : 매개변수 X, 리턴값 X : run()
     * Consumer : 매개변수 O, 리턴값 X : accept()
     * Supplier : 매개변수 X, 리턴값 O : get()
     * Function : 매개변수 O, 리턴값 O : apply()
     * Operator : 매개변수 O, 리턴값 O : apply() * 매개변수와 Return 타입이 동일
     * Predicate: 매개변수 O, 리턴값 O : test() * Boolean값을 리턴
     * */

    public static void main(String[] args) {

        /*
         * int : 반환형
         * int : 매개변수2개*/
        BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;
        System.out.println(binaryOperator.apply(5, 4));

        //Runnable 단순 실행만 함.
        //Runnable : 매개변수 X, 리턴값 X : run()
        Runnable runnable = () -> System.out.println("runnable 실행");
        runnable.run(); // 실행

        /*
        매개변수로 소비만 하고 반환은 하지않음.
         * Consumer = 소비자 : 매개변수 O, 리턴값 X : accept()
         * consumer.accept("안녕하세요"); 값이 (str) 로 들어와 실행이 된다.
         * */
        Consumer<String> consumer = (str) -> System.out.println(str);
        consumer.accept("consumer 실행");


        /*Supplier = 공급자 : 매개변수 X, 리턴값 O : get()* */
        Supplier<LocalDateTime> Supplier = () -> {
            return LocalDateTime.now();
        };
        Supplier<LocalDateTime> Supplier2 = () -> LocalDateTime.now();

        System.out.println(Supplier.get());


        /*Function(T,R) : 매개변수 O, 리턴값 O : apply() (매개변수 타입, 반환형)  */
        Function<String, Integer> Function = (str) -> Integer.parseInt(str);
        //Function.apply("50");
        System.out.println(Function.apply("50") + 5);


        /*
        Predicate: 매개변수 O, 리턴값 O : test() * Boolean값을 리턴
        n 에서 n%2를 나눴을때 0 이 나오면 ture
        */
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(6));

    }

}
