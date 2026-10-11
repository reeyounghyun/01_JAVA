package practice.level03.hard;
import java.util.List;
public class DataProcessor {

    // 필드를 만들어 보자
    private List<? extends Number> dataList;


    //매개변수가 있는 메서드를 만들고 호출해보자
    public void addData(List<? extends Number> dataList) {
        this.dataList = dataList;
    }

    public void processData() {
        System.out.println("데이터 처리 결과: " + dataList);
    }



}
