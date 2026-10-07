package practice.level022.hard.level02.hard;

/*
 * 클래스명: Boat (자식 클래스)
 * 필드: 선체 타입(hullType, 문자열)
 * 메소드: 이동(move) - "보트가 물 위를 떠다닙니다." 출력 (메소드 오버라이딩)
 *
 * */
public class Boat {
    // 필드
    private String hullType;

    // 생성자
    public Boat(String hullType) {
        this.hullType = hullType;
    }

    // 메소드
    @Override
    public void move() {
        System.out.println("보트가 물 위를 떠다닙니다.");
    }
}
