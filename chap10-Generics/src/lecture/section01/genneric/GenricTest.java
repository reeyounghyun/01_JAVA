package lecture.section01.genneric;

// 재네릭 설정은 클래스명 옆에 다이아몬드 연산자 <>
// 연산자 내부에 작성하는 영문자는 대문자를 사용해야 한다.
public class GenricTest<T> {

    private  T value;

    public GenricTest(T value) {
        this.value = value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
