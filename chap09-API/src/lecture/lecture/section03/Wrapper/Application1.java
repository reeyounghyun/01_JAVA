//package lecture.lecture.section03.Wrapper;
//
//public class Application1 {
//    /*
//     * Wrapping Class
//     * - 기본자료형을 개체로 감싸주는 클래스
//     * bute short int long flat double boolean
//     * */
//
//    int primitive = 20; // 기본자료형
//    Integer wrapper = primitive; // Auto Boxing
//    int result = wrapper; //Auto Unboxing
//
//    /* 문자열을 기본 타입으로 변경할 때
//     * parse(): 문자열을 인자로 받아서 원하는 타입으로 변환
//     *
//     * */
//
//    int age = Integer.parseInt("20");
//    double height = Double.parseDouble("167.6");
//    boolean active = Boolean.parseBoolean("true");
//
//    System.out.println("age = "+age +1);
//    System.out.println("height = "+height +1);
//    System.out.println("active = "+!active);
//
//    Integer.parseInt("20세"); // 숫자로 변경할 수 없다 예외
//
//
//}
