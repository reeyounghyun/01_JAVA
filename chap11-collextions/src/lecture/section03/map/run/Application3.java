package lecture.section03.map.run;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Application3 {
    public static void main(String[] args) {

        Properties prop = new Properties();

        try (FileInputStream input = new FileInputStream("setting.properties")) {

            // load: FileInputStream을 이용해 파일을 읽어온다.
            prop.load(input);
        } catch (IOException a) {

        }
        System.out.println("prop = " + prop);
    }
}