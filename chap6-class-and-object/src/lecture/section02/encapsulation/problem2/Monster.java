package lecture.section02.encapsulation.problem1;

public class Monster {

    private String name; // 몬스터의 이름
    private int hp;      // 몬스터의 체력

    public int getHp() {
        return hp;

    }

    // setter
    // Monster 만든 인스턴트의 필드를 수정할때는 setHp라고 하는 메서드로만 변경하자
    // 메서드로만 변경하자
    public void setHp(int num) {

        if(num > 0){
            System.out.println("양수값이 입력되어 몬스터의 체력을 바꿉니다.");
            // this : 인스턴스가 생성되었을때 자신의 주소를 가리키는 키워드
            this.hp = num;
        } else {
            System.out.println("음수값이 입력되어 체력을 0으로 저장합니다.");
            this.hp = 0;
        }
    }

    // this : 인스턴트가 생성되었을때 자신의 주소를 가리키는 키워드
//    public void setHp(int hp) {
//        this.hp = hp;
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}