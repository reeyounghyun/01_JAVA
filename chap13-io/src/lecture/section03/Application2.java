package lecture.section03;

import lecture.section03.substream.dto.MemberDTO;

import java.io.*;

public class Application2 {
    public static void main(String[] args) {

        // 객체 배열
        MemberDTO[] outputMembers = {
                new MemberDTO("user01", "pass01", "홍길동", "hong777@ohgiraffers.com", 25, '남', 1250.7),
                new MemberDTO("user02", "pass02", "유관순", "korea31@ohgiraffers.com", 16, '여', 1221.6),
                new MemberDTO("user03", "pass03", "이순신", "leesoonsin@ohgiraffers.com", 22, '남', 1234.6)};

        try (
                //src/lecture/section03/object.dat" 자바 객체를 읽어오는 확장자 "dat"
                FileOutputStream fo = new FileOutputStream("src/lecture/section03/object.dat");  //utputStream 기본스트럼
                BufferedOutputStream bfo = new BufferedOutputStream(fo); // 기본스트럼 객체를 생성자에 전달
                ObjectOutputStream oos = new ObjectOutputStream(bfo); // 기본스트림 + 버터스트림 객체를 생성자에 전달
        ) {
            // 객체 배열시작
            // 반복하며 배열안의 모든 개체를 write 하게된다.
            for (MemberDTO dto : outputMembers) {
                oos.writeObject(dto);
            }


            // FileOutputStream catch 문
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Objext 파일 읽기
        MemberDTO[] inputMembers = new MemberDTO[3];
        try (
                FileInputStream fi = new FileInputStream("src/lecture/section03/object.dat");
                BufferedInputStream bfi = new BufferedInputStream(fi); // 기본스트림 객체를 생성자에 전달
                ObjectInputStream oos = new ObjectInputStream(bfi) // 기본스트림 + 버퍼스트림 객체를 생성자에 전달
        ) {

            // System.out.println(oos.readObject());

            for (int i = 0; i < inputMembers.length; i++){
                inputMembers[i] = (MemberDTO) oos.readObject();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        for(MemberDTO dto : inputMembers){
            System.out.println("dto = " + dto);
        }
    }
}
