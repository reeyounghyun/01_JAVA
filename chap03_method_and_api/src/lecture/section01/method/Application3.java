package lecture.section01.method;

public class Application3 {
    /*
    * 메개변수(parameter) & 전달인자 (argument)
    * */

    public static void main(String[] args) {

        Application3 app3 = new Application3();

        int num = 10;


        // 메소드에 매개변수가 있을때는 인자를 넣어주어야 한다.
        // 인자의 개수는 매개변수의 갯수와 같아야 한다.
        app3.printAge(num);
        //여러개의 매개변수를 가진 메소드를호출할때: 매개변수의 순서에 따라 인자를 넣어주어야한다.
        // # 같은 타입을 연속해서 넣을때 주의해야 한다.
        app3.printname("이름" ,20,'여');

        System.out.println("메소드 종료");

        // app3.printAge("20"); 매개변수의 타입에 맞는 리터컬 값을 넣어야 한다. 문자형은 올수 없음!

        // System.out.println(age); 매개변수는 지역변수이기에 메소드 밖에서는 사용할 수 없음.

        System.out.println("메인 메소드 종료.....");
    }

    // 나이를 입력받으면 나이를 출력해주는 메소드
    // 메개변수는 메소드 안에서만 사용 가능하다.
    public void printAge( /*메개변수*/ int age) {

        System.out.println("나이는 = " + age + "입니다");

        // 반환점이 void 일때는 return을 작성하지 않아도 complier가 생성해준다.


    }
    public void printname(String name, int age, char gender) {
        System.out.println("나의 이름은 =" + name);
        System.out.println("나이는 =" + age);
        System.out.println("성별은 =" + gender);
    }

    /*
    * 사용자의 이름, 나이, 성별을 받아서 출력하는 메소드를 작성해 보자
    * 이름은 문자열, 나이는 정수, 성별은 문자**/
}
