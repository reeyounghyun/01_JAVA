package lecturte.section04.typecastiong;

public class Application2 {
    public static void main(String[] args) {

       // 강제형변환
        long longNum = 3000000L;
        int intNum = (int) longNum;

        //sout 할필요없이 바로 값을 추출해줌  단축키 :soutv
        System.out.println("longNum = " + intNum);
        System.out.println("intNum = " + intNum);
        
        // 숫자 -> 문자
        int num = 65;
        char ch = (char) num;

        System.out.println("ch = " + ch);

        double height = 189.9;

        System.out.println("height = " + height);
        int floorHeight = (int) height;
        System.out.println("floorHeight = " + floorHeight); //소수점 절삭해줌
    }
}
