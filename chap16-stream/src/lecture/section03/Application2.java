package lecture.section03;

import java.util.Arrays;
import java.util.List;

public class Application2 {

    static void main(String[] args) {
        // match
        // 조건에따라 true나 false를 반환하는 최종연산 (Predicate)

        // anyMatch : 하나라도 조건을 만족하는 값이 있으면 true
        List<String> strList = Arrays.asList("Java", "Spring", "SpringBoot");
        boolean anyMatch = strList.stream()
                .anyMatch(str -> str.contains("p"));
        System.out.println("anyMatch = " + anyMatch); //anyMatch = true

        // allMatch : 모두 조건을 만족하면 ture
        boolean allMatch = strList.stream()
                .allMatch(str -> str.length() > 4);
        System.out.println("allMatch = " + allMatch); //allMatch = false

        // noneMatch : 모두 조건을 만족하지 않으면 true
        boolean noneMatch = strList.stream()
                .noneMatch(str -> str.contains("c"));
        System.out.println("noneMatch = " + noneMatch); //noneMatch = true
    }

}
