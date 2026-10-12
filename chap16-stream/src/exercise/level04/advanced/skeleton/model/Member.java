package exercise.level04.advanced.skeleton.model;

import java.util.Date;

public class Member {

    private int memberId;
    private String name;
    private int age;
    private String phone;
    private MembershipType membershipType;
    private Date enrollDate;
    private Date expiryDate;
    private boolean active;

    public Member() {
    }

    public Member(int memberId, String name, int age, String phone,
                  MembershipType membershipType, Date enrollDate,
                  Date expiryDate, boolean active) {
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

    public Date getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(Date enrollDate) {
        this.enrollDate = enrollDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
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
