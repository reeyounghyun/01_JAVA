package lecture.section03.references;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Application1 {
    public static void main(String[] args) {

        List<String> subjects = new ArrayList<>();
        subjects.add("java");
        subjects.add("mysql");
        subjects.add("jdbc");
        subjects.add("html");
        subjects.add("css");


        // stream: 배열이나 컬력션을 좀 더 잘 다루기위한 문법 / 가공해야함

        Function<String, String> Function1 = (str) -> str.toUpperCase();

        subjects.stream()
                /* 매소드 참조
                문범
                * 객체명::매서드명
                * 클래스::정정매소드
                * */
                .map(String::toUpperCase)
                .forEach(System.out::println);

                subjects.forEach(Example::printName);



    }
}
