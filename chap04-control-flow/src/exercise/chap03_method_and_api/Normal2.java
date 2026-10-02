package exercise.chap03_method_and_api;

public class Normal {

    public static void main(String[] args) {
        System.out.println("max(20,35):" + Math.max(20,35));
        System.out.println("min(20,35):" + Math.min(20,35));
        System.out.println("abs(-17) :" + Math.abs(-17));
        System.out.println("pow(2,10):" + Math.pow(2, 10));
        System.out.println("sqrt(2):" + Math.sqrt(2));
    }


    /* Q2. Math 클래스의 static 메소드를 활용해 다음 결과를 출력하세요.
     *  단, Math 클래스의 메소드들은 모두 static 이므로 인스턴스 생성 없이 사용할 수 있습니다.
     *
     *   - Math.max(20, 35)
     *   - Math.min(20, 35)
     *   - Math.abs(-17)
     *   - Math.pow(2, 10)   ← 결과는 double 형
     *   - Math.sqrt(81)     ← 결과는 double 형
     *
     * -- 출력 예시 --
//     * max(20, 35) : 35   큰수 출력
//     * min(20, 35) : 20   작은수 출력
//     * abs(-17) : 17
//     * pow(2, 10) : 1024.0
//     * sqrt(81) : 9.0
     * */

}

