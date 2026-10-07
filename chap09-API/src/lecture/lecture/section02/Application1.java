package lecture.lecture.section02;

public class Application1 {
    public static void main(String[] args) {

        // String에서 자주 사용하는 매소드
        String text = "  Java Programming  ";


        // 조회
        // 문자의 길이 알아보자 : text.length()) -> 매소드로 반환시킨다.
        System.out.println("길이:" + text.length());

        // 문자의 특정 순서(띄어쓰기 포함)
        System.out.println("첫 글자:" + text.charAt(3));

        // 검색 : 해당 텍스트를 포함하고 있으면 ture 업으면 false
        System.out.println("Java 포함" + text.contains("Java"));

        // 검색 : 해당 텍스트가 몇번재에 위치되어 있는지?
        System.out.println("Java 시작위치" + text.indexOf("Java"));

        //변환
        String trimmed= text.strip();
        System.out.println("공백제거: #"+ trimmed + "#" );

        // 부분 문자열 추출
        System.out.println("부분 문자열: "+ trimmed.substring(1,3)); // 시작인텍스, 끝인덱스

        // 부분 문자열 교체
        System.out.println("문자열 교체: "+ trimmed.replace("Java", "Kotlin")); // 시작인텍스, 끝인덱스
        System.out.println("대/소문자 뱐환: "+ trimmed.toUpperCase()); // 시작인텍스, 끝인덱스

    }
}
