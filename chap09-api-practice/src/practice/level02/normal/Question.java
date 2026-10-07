package practice.level02.normal;

public class Question {

    public static void main(String[] args) {

        /* Q1. StringBuilder를 사용하여 문자열을 합치고, 특정 위치에 문자열을 삽입하세요.
         *
         * 복습 포인트:
         * - StringBuilder 클래스를 이용하여 문자열 합치기를 할 수 있다.
         * - StringBuilder 의 insert(index, str) 메소드 사용 방법을 이해할 수 있다.
         * - String과 StringBuilder의 차이점을 이해하고 설명할 수 있다.
         *
         * 조건 (정확한 단계대로 수행):
         *   ① 초기값 "Hello" 로 StringBuilder 인스턴스를 생성한다.
         *   ② append("World") 로 뒤에 "World" 를 이어 붙인다.   →  "HelloWorld"
         *   ③ insert(5, "Java") 로 5번 인덱스(=H,e,l,l,o 다음 자리)에 "Java" 를 삽입한다.
         *      → "HelloJavaWorld"
         *   ④ toString() 결과를 출력한다.
         *
         * 출력 예시:
         * HelloJavaWorld
         * */

        /* Q2. Wrapper 클래스를 사용하여 문자열을 숫자로 변환하고, 숫자를 문자열로 변환하세요.
         *
         * 복습 포인트:
         * - Wrapper 클래스와 기본자료형 값 비교의 차이점을 이해하고 개발에 적용할 수 있다.
         * - Wrapper 클래스를 이용하여 문자열 데이터를 parsing하고 개발에 적용할 수 있다.
         * - Wrapper 클래스 자료형 값을 문자열로 변경하는 방식을 이해하고 개발에 적용할 수 있다.
         *
         * 조건:
         * - 문자열 "1234"를 정수로 변환하고, 5678을 문자열로 변환하여 출력
         *
         * 출력 예시:
         * 문자열 "1234"를 정수로 변환: 1234
         * 정수 5678을 문자열로 변환: "5678"
         * */

    }

}
