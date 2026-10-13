package skeleton.model;

import java.time.LocalDateTime;

// 회원 데이터
public class Member {

    private int memberId;
    private String name;
    private int age;
    private String phone;
    private MembershipType membershipType;
    private LocalDateTime enrollDate;
    private LocalDateTime expiryDate;
    private boolean active;

    public Member() {
    }

    public Member(int memberId, String name, int age, String phone,
                  MembershipType membershipType, LocalDateTime enrollDate,
                  LocalDateTime expiryDate, boolean active) {
        this.memberId = memberId;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.membershipType = membershipType;
        this.enrollDate = enrollDate;
        this.expiryDate = expiryDate;
        this.active = active;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public MembershipType getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(MembershipType membershipType) {
        this.membershipType = membershipType;
    }

    public LocalDateTime getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(LocalDateTime enrollDate) {
        this.enrollDate = enrollDate;
    }

    public LocalDateTime getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDateTime expiryDate) {
        this.expiryDate = expiryDate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Member [memberId=" + memberId
                + ", name=" + name
                + ", age=" + age
                + ", phone=" + phone
                + ", membershipType=" + membershipType.getDescription()
                + ", enrollDate=" + enrollDate
                + ", expiryDate=" + expiryDate
                + ", active=" + active + "]";
    }
}
