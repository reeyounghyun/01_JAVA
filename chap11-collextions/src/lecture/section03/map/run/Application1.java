package lecture.section03.map.run;

import java.util.Date;
import java.util.HashMap;

public class Application1 {
    // Map의 종류
    // Key Value를 하나의 쌍으로 지칭하는 방식

    // 1.Key
    // -Key는 Value에 저장된 값을 꺼내오는 용도 = 값을 찾기 위한 역할을 하는 객체를 의미
    // - 요소의 지정 순서를 유지하지 않는다.
    // -Key는 중복이 일어날 수 없다

    // 2.Value

    public static void main() {
        HashMap hmap = new HashMap();

        hmap.put("one", new Date());
        hmap.put(12, "red apple");
        hmap.put(33, 33);

        System.out.println("hmap 값 출력 = " + hmap);


        // key 값 중복저장
        // Value 의 값이 덮어씌워진다.
        hmap.put(12, "blue banana");
        System.out.println("hmap = " + hmap);

        hmap.put(13, "blue banana");
        System.out.println("hmap 값을 덮어쓰기 = " + hmap);

        // map의 자료 조회
        // -get(key) : key에 해당하는 value를 반환
        System.out.println("hmap.get(one) map의 자료 조회 = " + hmap.get("one"));
        
        
        // map의 값을 지울때는 
        // .remove(key) 형식으로 사용한다.
        hmap.remove("one");
        System.out.println("key값의 삭제 = " + hmap);

    }

}
