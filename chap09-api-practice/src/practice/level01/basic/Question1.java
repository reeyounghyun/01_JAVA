package practice.level01.basic;

public class Question1 {

    public static void main(String[] args) {

        /* Q2. String 클래스의 메소드를 활용하여 문자열을 분리하고, 특정 문자열을 포함하는지 확인하세요.
         *
         * 복습 포인트:
         * - 문자열 비교 시 ==과 equals() 메소드의 비교 방식을 이해하고 개발에 적용할 수 있다.
         * - 문자열을 분리하는 방식을 이해하고 개발에 적용할 수 있다. (split()과 StringTokenizer)
         *
         * 문자열: "Java,Python,C++,JavaScript"
         *
         * 쉼표(,)를 기준으로 문자열을 분리하여 배열로 저장하고, "Python" 문자열이 포함되어 있는지 확인
         *
         * 출력 예시:
         * Python이 포함되어 있습니다.
         * */

        String str = "Java,Python,C++,JavaScript";

        // 문자열분리하기(,기준)        // 배열로 저장하기
        String[] strArr = str.split(",");



        // "Python" 문자열이 포함되었는지 확인하기

        String s = strArr[0];
        String s1 = strArr[1];
        String s2 = strArr[2];
       // String s3 = strArr[3];

   /*     System.out.println("s = " + s);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);*/


//        for (int i = 0; i < 4; i++) {
//            System.out.println(strArr[i]);
//        }

        String str5 = "name";

//        str5.equals("Java"); // true / false

        // 포함되었으면 "Python이 포함되어 있습니다" 출력하기
        for (int i = 0; i < strArr.length; i++) {
            if(strArr[i].equals("Python")){
                System.out.println("Python이 포함되어 있습니다.");
            }

        }

    }

}
