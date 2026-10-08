package practice.level01.basic;

/*  * 클래스명: Box
 * 필드: 데이터(data, 제네릭 타입)
 * 메소드: 데이터 추가(setData), 데이터 반환(getData)*/
public class Box<T> {

    // * 필드: 데이터(data, 제네릭 타입
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
