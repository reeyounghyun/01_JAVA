package lecture.section01.extend;

/*
클레스는 FirCar  코드 : class FireCar;
* 상속받을 부모클레스 Car 코드 : extends Car\
* 클래스 상속하는이유? => 기능을 확작하기 위해 */
public class FireCar extends Car {

    // 기본 생성자
    public FireCar() {




        /*
         * super :  부모의 주소
         * */
        /*부모의 생성자를 호출하는데, 가장 먼저 호출 되어
        위에 다른 생성자를 호출할수 없어 맨 뒤에 호출해야 한다
        */

        super();

        System.out.println("FireCar 기본생성자 호출");
    }

    // 매소드
    public void sprayWater() {
        System.out.println("불난 곳을 발견했습니다. 물을 부립니다.");
    }


    // 오버라이딩
    // @Override: 부모 클래스의 매서드의 자식에서 재작성했다는 의미
    @Override
    public void soundHorn() {

        if (isRunning()) {
            System.out.println("빠라빠라빰!");
        } else {
            System.out.println("경적을 울릴수 없습니다!!!");
        }
    }


}
