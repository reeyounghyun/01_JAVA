package practice.level02.hard;

public class Application {
    public static void main(String[] args) {

        // 향상된 for문
        // 배열/컬렉션 모든 요소를 하나씩 꺼내서 사용할 수 있는 편리한 for문
        String[] strArr = new String[] {"영찬", "지원", "샘물", "인규"};

        // 우리가 원래쓰던 for문
//        for(int i = 0; i < strArr.length; i++) {
//            System.out.println(strArr[i]);
//        }

        for (String str : strArr) {
            System.out.println(str);
        }
    }
}