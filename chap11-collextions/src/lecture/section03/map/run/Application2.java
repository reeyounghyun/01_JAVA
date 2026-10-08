package lecture.section03.map.run;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Application2 {
            /*
        *   yaml
            properties  -->  Application의 설정값

            Backend  <-->  DB  /  설정정보 (Propperties, yaml)

            노출  -->  인증정보
                       - DB URL
                       - UserName
                       - Password


            Propperties : 문자열 형태로마 저장된다
        *
        *
        * /*
         * Properties
         * - Key - Value 쌍으로 모두 문자열만 사용할 수 있는 자료구조
         * - 설정 파일의 설정 값을 저장하는 용도로 사용한다.
         * */

    public static void main(String[] args) {
        Properties prop = new Properties();  // 타입을 지정하지 않아도 됨 Properties

        prop.setProperty("Language", "Korean");
        prop.setProperty("theme", "dark");
        prop.setProperty("fontsize", "16");

        System.out.println("전체 줄력 결과 = " + prop);

        // 조회 할 때
        // .getProperty : key값으로 Value 조회하기
        prop.getProperty("language");
        System.out.println("조회할 언어" + prop.getProperty("Language"));
        
        // 수정 할 때
        prop.getProperty("theme","Light");
        System.out.println("prop = " + prop);

        // 파일 입출력
        // 파일 입출력
        try (FileOutputStream output = new FileOutputStream("setting.properties")) {
            // 파일을 저장
            prop.store(output, "application settings");
            System.out.println("settings.properties 파일 저장 완료!");
        } catch (IOException e) {

        }


        }

}
