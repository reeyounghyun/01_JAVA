package practice.level01.basic;

// 클래스명이고.
public class Container<D> {
    /* Q2. 다이아몬드 연산자를 이용하여 제네릭스를 설정한 클래스를 작성하고, 데이터를 추가하고 출력하세요.
     *
     * 복습 포인트:
     * - 클래스 작성 시 다이아몬드 연산자를 이용하여 제네릭스를 설정한 클래스를 작성할 수 있다.
     *
     * 클래스명: Container
     * 필드: 데이터(data, 제네릭 타입)
     * 메소드: 데이터 추가(add), 데이터 반환(get)
     *
     * Container<Double> 타입의 인스턴스를 생성하고, 데이터를 추가하고 출력
     *
     * 출력 예시:
     * Double 데이터: 45.67
     *
     * 다이아몬드 연산자 = <>;
     *
     * */

    // 애가 필드 이고
    private D data;


    //데이터 추가할 메소드
    public void add(D data) {
       this.data = data;
    }

    //데이터 반환할 메소드
    public D get() {
        return data;
    }





}
